package com.example.onlinecoffeeshopapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class OrderPlaceSuccessful : AppCompatActivity() {

    lateinit var orderplaceTrackbtn : Button
    lateinit var orderPlaceBackArrow : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_order_place_successful)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        orderplaceTrackbtn = findViewById(R.id.orderplaceTrackbtn)
        orderPlaceBackArrow = findViewById(R.id.orderPlaceBackArrow)

        val orderplaceTrackbtn = findViewById<Button>(R.id.orderplaceTrackbtn)
        orderplaceTrackbtn.setOnClickListener {
            val intent = Intent(this, TrackOrder::class.java)
            startActivity(intent)
        }

        val orderPlaceBackArrow = findViewById<ImageView>(R.id.orderPlaceBackArrow)
        orderPlaceBackArrow.setOnClickListener {
            val intent = Intent(this, orderConfirm::class.java)
            startActivity(intent)
        }
    }
}