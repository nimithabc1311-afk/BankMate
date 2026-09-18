package com.example.bankmatelabinternal

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class TransactionHistoryFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val view = inflater.inflate(
            R.layout.fragment_transaction_history,
            container,
            false
        )

        val historyTextView =
            view.findViewById<TextView>(
                R.id.historyTextView
            )

        val preferences =
            requireContext().getSharedPreferences(
                "BankMateData",
                android.content.Context.MODE_PRIVATE
            )

        val history =
            preferences.getString("history", "")

        if (history.isNullOrEmpty()) {

            historyTextView.text =
                "No transactions yet."

        } else {

            historyTextView.text =
                history
        }

        return view
    }
}