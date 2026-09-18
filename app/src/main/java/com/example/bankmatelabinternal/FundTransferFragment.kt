package com.example.bankmatelabinternal

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
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

            val amount =
                amountEditText.text.toString().trim()

            if (beneficiary.isEmpty() ||
                accountNumber.isEmpty() ||
                amount.isEmpty()
            ) {

                Toast.makeText(
                    requireContext(),
                    "Please enter all transfer details",
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
                view.findViewById<android.widget.RadioButton>(selectedId)
                    .text.toString()

            val intent = Intent(
                requireContext(),
                TransactionActivity::class.java
            )

            intent.putExtra("beneficiary", beneficiary)
            intent.putExtra("accountNumber", accountNumber)
            intent.putExtra("amount", amount)
            intent.putExtra("transferMode", transferMode)

            startActivity(intent)
        }

        return view
    }
}