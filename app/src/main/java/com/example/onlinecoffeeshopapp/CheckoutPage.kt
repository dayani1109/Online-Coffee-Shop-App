package com.example.onlinecoffeeshopapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CheckoutPage : AppCompatActivity() {

    lateinit var checkaddcardbtn : Button
    lateinit var confirmPayBtn : Button
    lateinit var checkoutBackarrow : ImageView
    lateinit var delivername: EditText
    lateinit var deliveraddress: EditText
    lateinit var deliverphone: EditText
    lateinit var checktotalprice: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_checkout_page)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        checkaddcardbtn = findViewById(R.id.checkaddcardbtn)
        confirmPayBtn = findViewById(R.id.confirmPayBtn)
        checkoutBackarrow = findViewById(R.id.checkoutBackarrow)
        delivername = findViewById(R.id.delivername)
        deliveraddress = findViewById(R.id.deliveraddress)
        deliverphone = findViewById(R.id.deliverphone)
        checktotalprice = findViewById(R.id.checktotalprice)



        val checkaddcardbtn = findViewById<Button>(R.id.checkaddcardbtn)
        checkaddcardbtn.setOnClickListener {
            val intent = Intent(this, addnewcard::class.java)
            startActivity(intent)
        }

        val confirmPayBtn = findViewById<Button>(R.id.confirmPayBtn)
        confirmPayBtn.setOnClickListener {
            val intent = Intent(this, orderConfirm::class.java)
            startActivity(intent)
        }

        val checkoutBackarrow = findViewById<ImageView>(R.id.checkoutBackarrow)
        checkoutBackarrow.setOnClickListener {
            val intent = Intent(this, Cart::class.java)
            startActivity(intent)
        }

        confirmPayBtn.setOnClickListener {
            // User input
            val name = findViewById<EditText>(R.id.delivername).text.toString()
            val address = findViewById<EditText>(R.id.deliveraddress).text.toString()
            val phone = findViewById<EditText>(R.id.deliverphone).text.toString()
            val amount = findViewById<TextView>(R.id.checktotalprice).text.toString()

            // make intent and send data
            val intent = Intent(this, orderConfirm::class.java).apply {
                putExtra("name", name)
                putExtra("address", address)
                putExtra("phone", phone)
                putExtra("amount", amount)
            }
            startActivity(intent)
        }


    }
}