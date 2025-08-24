package com.example.onlinecoffeeshopapp

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.widget.ContentLoadingProgressBar

class MainActivity : AppCompatActivity() {

    lateinit var logoImage: ImageView
    lateinit var loadingText: TextView
    lateinit var Loadingbar1: ContentLoadingProgressBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        logoImage = findViewById(R.id.logoImage)
        loadingText = findViewById(R.id.loadingText)
        Loadingbar1 = findViewById(R.id.Loadingbar1)

        // ⏳ Delay 3 seconds and then go to next activity
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, onboarding1::class.java) // 👉 change to your activity
            startActivity(intent)
            finish() // finish splash so user can't go back
        }, 3000) // 3000ms = 3s
    }
}
