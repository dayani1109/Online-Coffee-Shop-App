package com.example.onlinecoffeeshopapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ColdCoffeeHome : AppCompatActivity() {

    lateinit var hotcoffeeBtn2: Button
    lateinit var coldcoffeeBtn2: Button
    lateinit var hotteaBtn2 : Button
    lateinit var imgcoffeemilkshake : ImageView
    lateinit var coldcoffeProfile : ImageView
    lateinit var coldCoffeeCart : ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_cold_coffee_home)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        hotcoffeeBtn2 = findViewById(R.id.hotcoffeeBtn2)
        coldcoffeeBtn2 = findViewById(R.id.coldcoffeeBtn2)
        hotteaBtn2 = findViewById(R.id.hotteaBtn2)
        imgcoffeemilkshake = findViewById(R.id.imgcoffeemilkshake)
        coldcoffeProfile = findViewById(R.id.coldcoffeProfile)
        coldCoffeeCart = findViewById(R.id.coldCoffeeCart)

        val hotcoffeeBtn2 = findViewById<Button>(R.id.hotcoffeeBtn2)
        hotcoffeeBtn2.setOnClickListener {
            val intent = Intent(this, hotcoffeehome::class.java)
            startActivity(intent)
        }

        val coldcoffeeBtn2 = findViewById<Button>(R.id.coldcoffeeBtn2)
        coldcoffeeBtn2.setOnClickListener {
            val intent = Intent(this, ColdCoffeeHome::class.java)
            startActivity(intent)
        }

        val hotteaBtn2 = findViewById<Button>(R.id.hotteaBtn2)
        hotteaBtn2.setOnClickListener {
            val intent = Intent(this, HotTeaHome::class.java)
            startActivity(intent)
        }

        val imgcoffeemilkshake = findViewById<ImageView>(R.id.imgcoffeemilkshake)
        imgcoffeemilkshake.setOnClickListener {
            val intent = Intent(this, coffee_MilkshakePage::class.java)
            startActivity(intent)
        }

        val coldcoffeProfile = findViewById<ImageView>(R.id.coldcoffeProfile)
        coldcoffeProfile.setOnClickListener {
            val intent = Intent(this, Profile::class.java)
            startActivity(intent)
        }

        val coldCoffeeCart = findViewById<ImageView>(R.id.coldCoffeeCart)
        coldCoffeeCart.setOnClickListener {
            val intent = Intent(this, Cart::class.java)
            startActivity(intent)
        }
    }
}