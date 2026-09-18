package com.example.bankmatelabinternal

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Open the Account Activity
        val intent = Intent(this, AccountActivity::class.java)
        startActivity(intent)

        // Close MainActivity
        finish()
    }
}