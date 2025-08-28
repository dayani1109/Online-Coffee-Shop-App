package com.example.onlinecoffeeshopapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class blackTeaPage : AppCompatActivity() {

    lateinit var blackTeaback : ImageView
    lateinit var BlackTeaAddtocart : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_black_tea_page)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        blackTeaback = findViewById(R.id.blackTeaback)
        BlackTeaAddtocart = findViewById(R.id.BlackTeaAddtocart)

        val blackTeaback = findViewById<ImageView>(R.id.blackTeaback)
        blackTeaback.setOnClickListener {
            val intent = Intent(this, HotTeaHome::class.java)
            startActivity(intent)
        }

        val BlackTeaAddtocart = findViewById<Button>(R.id.BlackTeaAddtocart)
        BlackTeaAddtocart.setOnClickListener {
            val intent = Intent(this, Cart::class.java)
            startActivity(intent)
        }
    }
}