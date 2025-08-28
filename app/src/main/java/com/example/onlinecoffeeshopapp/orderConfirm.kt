package com.example.onlinecoffeeshopapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class orderConfirm : AppCompatActivity() {

    lateinit var orderconfirmBtn2 : Button
    lateinit var orderconfirmCancelBtn : Button
    lateinit var OrderconfirmBackarrow : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_order_confirm)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        orderconfirmBtn2 = findViewById(R.id.orderconfirmBtn2)
        orderconfirmCancelBtn = findViewById(R.id.orderconfirmCancelBtn)
        OrderconfirmBackarrow = findViewById(R.id.OrderconfirmBackarrow)

        val orderconfirmBtn2 = findViewById<Button>(R.id.orderconfirmBtn2)
        orderconfirmBtn2.setOnClickListener {
            val intent = Intent(this, OrderPlaceSuccessful::class.java)
            startActivity(intent)
        }

        val orderconfirmCancelBtn = findViewById<Button>(R.id.orderconfirmCancelBtn)
        orderconfirmCancelBtn.setOnClickListener {
            val intent = Intent(this, OrderCancelSuccessful::class.java)
            startActivity(intent)
        }

        val OrderconfirmBackarrow = findViewById<ImageView>(R.id.OrderconfirmBackarrow)
        OrderconfirmBackarrow.setOnClickListener {
            val intent = Intent(this, CheckoutPage::class.java)
            startActivity(intent)
        }

        // Intent eke data ganna
        val name = intent.getStringExtra("name")
        val address = intent.getStringExtra("address")
        val phone = intent.getStringExtra("phone")
        val amount = intent.getStringExtra("amount")

        // UI ekata set karanna
        findViewById<TextView>(R.id.orderconfirmName).text = "Name: $name"
        findViewById<TextView>(R.id.orderconfirmAddress).text = "Address: $address"
        findViewById<TextView>(R.id.orderconfirmPhone).text = "Phone: $phone"
        findViewById<TextView>(R.id.orderconfirmAmount).text = "Amount: $amount"
    }
}