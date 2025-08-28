package com.example.onlinecoffeeshopapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CappuccinoPage : AppCompatActivity() {

    lateinit var CappuBack : ImageView
    lateinit var cappuBtn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_cappuccino_page)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        CappuBack = findViewById(R.id.CappuBack)
        cappuBtn = findViewById(R.id.cappuBtn)

        val CappuBack = findViewById<ImageView>(R.id.CappuBack)
        CappuBack.setOnClickListener {
            val intent = Intent(this, hotcoffeehome::class.java)
            startActivity(intent)
        }

        val cappuBtn = findViewById<Button>(R.id.cappuBtn)
        cappuBtn.setOnClickListener {
            val intent = Intent(this, Cart::class.java)
            startActivity(intent)
        }
    }

}