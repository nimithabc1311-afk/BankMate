package com.example.bankmatelabinternal

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.fragment.app.Fragment

class FundTransferFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val view = inflater.inflate(
            R.layout.fragment_fund_transfer,
            container,
            false
        )

        val beneficiaryEditText =
            view.findViewById<EditText>(R.id.beneficiaryEditText)

        val accountNumberEditText =
            view.findViewById<EditText>(R.id.accountNumberEditText)

        val amountEditText =
            view.findViewById<EditText>(R.id.amountEditText)

        val transferModeGroup =
            view.findViewById<RadioGroup>(R.id.transferModeGroup)

        val confirmButton =
            view.findViewById<Button>(R.id.confirmButton)

        confirmButton.setOnClickListener {

            val beneficiary =
                beneficiaryEditText.text.toString().trim()

            val accountNumber =
                accountNumberEditText.text.toString().trim()

            val amountText =
                amountEditText.text.toString().trim()

            if (beneficiary.isEmpty() ||
                accountNumber.isEmpty() ||
                amountText.isEmpty()
            ) {

                Toast.makeText(
                    requireContext(),
                    "Please enter all transfer details",
                    Toast.LENGTH_SHORT
                ).show()

                return@setOnClickListener
            }

            val amount = amountText.toFloatOrNull()

            if (amount == null || amount <= 0) {

                Toast.makeText(
                    requireContext(),
                    "Please enter a valid amount",
                    Toast.LENGTH_SHORT
                ).show()

                return@setOnClickListener
            }

            val selectedId =
                transferModeGroup.checkedRadioButtonId

            if (selectedId == -1) {

                Toast.makeText(
                    requireContext(),
                    "Please select transfer mode",
                    Toast.LENGTH_SHORT
                ).show()

                return@setOnClickListener
            }

            val transferMode =
                view.findViewById<RadioButton>(selectedId)
                    .text.toString()

            // Get current balance
            val preferences =
                requireContext().getSharedPreferences(
                    "BankMateData",
                    android.content.Context.MODE_PRIVATE
                )

            val currentBalance =
                preferences.getFloat("balance", 50000f)

            // Check sufficient balance
            if (amount > currentBalance) {

                Toast.makeText(
                    requireContext(),
                    "Insufficient balance",
                    Toast.LENGTH_SHORT
                ).show()

                return@setOnClickListener
            }

            // Deduct amount
            val newBalance =
                currentBalance - amount

            // Save new balance
            preferences.edit()
                .putFloat("balance", newBalance)
                .apply()

            // Save transaction
            val oldHistory =
                preferences.getString("history", "") ?: ""

            val newTransaction =
                "Beneficiary: $beneficiary\n" +
                        "Account Number: $accountNumber\n" +
                        "Amount: ₹${amount.toInt()}\n" +
                        "Mode: $transferMode\n" +
                        "Status: Successful"

            val updatedHistory =
                if (oldHistory.isEmpty()) {
                    newTransaction
                } else {
                    "$newTransaction\n\n$oldHistory"
                }

            preferences.edit()
                .putString("history", updatedHistory)
                .apply()

            // Open transaction screen
            val intent =
                Intent(
                    requireContext(),
                    TransactionActivity::class.java
                )

            intent.putExtra("beneficiary", beneficiary)
            intent.putExtra("accountNumber", accountNumber)
            intent.putExtra("amount", amountText)
            intent.putExtra("transferMode", transferMode)

            startActivity(intent)
        }

        return view
    }
}