package com.example.onlinecoffeeshopapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class addnewcard : AppCompatActivity() {

    lateinit var addCardBtn : Button
    lateinit var addCardBackarrow : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_add_new_card)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        addCardBtn = findViewById(R.id.addCardBtn)
        addCardBackarrow = findViewById(R.id.addCardBackarrow)

        val addCardBtn = findViewById<Button>(R.id.addCardBtn)
        addCardBtn.setOnClickListener {
            val intent = Intent(this, CheckoutPage::class.java)
            startActivity(intent)
        }

        val addCardBackarrow = findViewById<ImageView>(R.id.addCardBackarrow)
        addCardBackarrow.setOnClickListener {
            val intent = Intent(this, CheckoutPage::class.java)
            startActivity(intent)
        }
    }
}