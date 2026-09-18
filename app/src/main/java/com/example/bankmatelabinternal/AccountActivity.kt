package com.example.bankmatelabinternal

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class AccountActivity : AppCompatActivity() {

    private val tag = "BankMateLifecycle"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account)

        Log.d(tag, "AccountActivity: onCreate")

        val accountDetailsButton =
            findViewById<Button>(R.id.accountDetailsButton)

        val fundTransferButton =
            findViewById<Button>(R.id.fundTransferButton)

        val transactionHistoryButton =
            findViewById<Button>(R.id.transactionHistoryButton)

        accountDetailsButton.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(
                    R.id.fragmentContainer,
                    AccountDetailsFragment()
                )
                .commit()
        }

        fundTransferButton.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(
                    R.id.fragmentContainer,
                    FundTransferFragment()
                )
                .commit()
        }

        transactionHistoryButton.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(
                    R.id.fragmentContainer,
                    TransactionHistoryFragment()
                )
                .commit()
        }

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(
                    R.id.fragmentContainer,
                    AccountDetailsFragment()
                )
                .commit()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(tag, "AccountActivity: onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(tag, "AccountActivity: onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(tag, "AccountActivity: onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(tag, "AccountActivity: onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(tag, "AccountActivity: onDestroy")
    }
}