package com.example.onlinecoffeeshopapp

import android.content.Intent
import android.os.Handler
import android.os.Looper
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // After 3 seconds → move to Onboarding1
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this@MainActivity, onboarding1::class.java)
            startActivity(intent)
            finish() // close MainActivity so user can’t come back with back button
        }, 3000)

    }
}
