package com.example.onlinecoffeeshopapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class OrderCancelSuccessful : AppCompatActivity() {

    lateinit var orderCancelBackbtn : Button
    lateinit var ordercancelbackarrow : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_order_cancel_successful)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        orderCancelBackbtn = findViewById(R.id.orderCancelBackbtn)
        ordercancelbackarrow = findViewById(R.id.ordercancelbackarrow)

        val orderCancelBackbtn = findViewById<Button>(R.id.orderCancelBackbtn)
        orderCancelBackbtn.setOnClickListener {
            val intent = Intent(this, hotcoffeehome::class.java)
            startActivity(intent)
        }

        val ordercancelbackarrow = findViewById<ImageView>(R.id.ordercancelbackarrow)
        ordercancelbackarrow.setOnClickListener {
            val intent = Intent(this, orderConfirm::class.java)
            startActivity(intent)
        }
    }
}