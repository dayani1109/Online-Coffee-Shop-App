package com.example.onlinecoffeeshopapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class coffee_MilkshakePage : AppCompatActivity() {

    lateinit var coffeemilkshakeBack : ImageView
    lateinit var coffeemilkshakeBtn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_coffee_milkshake_page)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        coffeemilkshakeBack = findViewById(R.id.coffeemilkshakeBack)
        coffeemilkshakeBtn = findViewById(R.id.coffeemilkshakeBtn)

        val coffeemilkshakeBack = findViewById<ImageView>(R.id.coffeemilkshakeBack)
        coffeemilkshakeBack.setOnClickListener {
            val intent = Intent(this, ColdCoffeeHome::class.java)
            startActivity(intent)
        }

        val coffeemilkshakeBtn = findViewById<Button>(R.id.coffeemilkshakeBtn)
        coffeemilkshakeBtn.setOnClickListener {
            val intent = Intent(this, Cart::class.java)
            startActivity(intent)
        }
    }
}