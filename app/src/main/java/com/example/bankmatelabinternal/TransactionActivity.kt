package com.example.bankmatelabinternal

import android.Manifest
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat

class TransactionActivity : AppCompatActivity() {

    private val channelId = "bankmate_channel"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transaction)

        createNotificationChannel()

        val beneficiary =
            intent.getStringExtra("beneficiary") ?: ""

        val accountNumber =
            intent.getStringExtra("accountNumber") ?: ""

        val amount =
            intent.getStringExtra("amount") ?: ""

        val transferMode =
            intent.getStringExtra("transferMode") ?: ""

        val transactionText =
            findViewById<TextView>(R.id.transactionText)

        val doneButton =
            findViewById<Button>(R.id.doneButton)

        transactionText.text =
            "Transaction Successful\n\n" +
                    "Beneficiary: $beneficiary\n" +
                    "Account Number: $accountNumber\n" +
                    "Amount: ₹$amount\n" +
                    "Transfer Mode: $transferMode\n\n" +
                    "Status: SUCCESS"

        showNotification(
            beneficiary,
            amount,
            transferMode
        )

        doneButton.setOnClickListener {
            finish()
        }
    }

    private fun createNotificationChannel() {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {

            val channel = NotificationChannel(
                channelId,
                "BankMate Transactions",
                NotificationManager.IMPORTANCE_DEFAULT
            )

            val manager =
                getSystemService(NotificationManager::class.java)

            manager.createNotificationChannel(channel)
        }
    }

    private fun showNotification(
        beneficiary: String,
        amount: String,
        mode: String
    ) {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {

            if (checkSelfPermission(
                    Manifest.permission.POST_NOTIFICATIONS
                ) != PackageManager.PERMISSION_GRANTED
            ) {

                requestPermissions(
                    arrayOf(Manifest.permission.POST_NOTIFICATIONS),
                    100
                )

                return
            }
        }

        val builder = NotificationCompat.Builder(this, channelId)
            .setSmallIcon(android.R.drawable.ic_dialog_info)
            .setContentTitle("BankMate Transaction Successful")
            .setContentText(
                "₹$amount transferred to $beneficiary using $mode"
            )
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)
            .setAutoCancel(true)

        NotificationManagerCompat.from(this).notify(
            1,
            builder.build()
        )
    }
}