package com.example.bankmatelabinternal

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class AccountDetailsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val view = inflater.inflate(
            R.layout.fragment_account_details,
            container,
            false
        )

        val balanceTextView =
            view.findViewById<TextView>(
                R.id.detailsBalanceTextView
            )

        val preferences =
            requireContext().getSharedPreferences(
                "BankMateData",
                android.content.Context.MODE_PRIVATE
            )

        val balance =
            preferences.getFloat("balance", 50000f)

        balanceTextView.text =
            "Available Balance: ₹${balance.toInt()}"

        return view
    }
}