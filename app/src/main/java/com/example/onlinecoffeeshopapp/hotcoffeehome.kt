package com.example.onlinecoffeeshopapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class hotcoffeehome : AppCompatActivity() {

    lateinit var hotcoffeeBtn1: Button
    lateinit var coldcoffeeBtn1: Button
    lateinit var hotteaBtn1 : Button
    lateinit var imgCappuccino : ImageView
    lateinit var hotcoffeeprofile: ImageView
    lateinit var hotCoffeeCart: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_hot_coffee_home)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        hotcoffeeBtn1 = findViewById(R.id.hotcoffeeBtn1)
        coldcoffeeBtn1 = findViewById(R.id.coldcoffeeBtn1)
        hotteaBtn1 = findViewById(R.id.hotteaBtn1)
        imgCappuccino = findViewById(R.id.imgCappuccino)
        hotcoffeeprofile = findViewById(R.id.hotcoffeeprofile)
        hotCoffeeCart = findViewById(R.id.hotCoffeeCart)

        val hotcoffeeBtn1 = findViewById<Button>(R.id.hotcoffeeBtn1)
        hotcoffeeBtn1.setOnClickListener {
            val intent = Intent(this, hotcoffeehome::class.java)
            startActivity(intent)
        }

        val coldcoffeeBtn1 = findViewById<Button>(R.id.coldcoffeeBtn1)
        coldcoffeeBtn1.setOnClickListener {
            val intent = Intent(this, ColdCoffeeHome::class.java)
            startActivity(intent)
        }

        val hotteaBtn1 = findViewById<Button>(R.id.hotteaBtn1)
        hotteaBtn1.setOnClickListener {
            val intent = Intent(this, HotTeaHome::class.java)
            startActivity(intent)
        }

        val imgCappuccino = findViewById<ImageView>(R.id.imgCappuccino)
        imgCappuccino.setOnClickListener {
            val intent = Intent(this, CappuccinoPage::class.java)
            startActivity(intent)
        }

        val hotcoffeeprofile = findViewById<ImageView>(R.id.hotcoffeeprofile)
        hotcoffeeprofile.setOnClickListener {
            val intent = Intent(this, Profile::class.java)
            startActivity(intent)
        }

        val hotCoffeeCart = findViewById<ImageView>(R.id.hotCoffeeCart)
        hotCoffeeCart.setOnClickListener {
            val intent = Intent(this, Cart::class.java)
            startActivity(intent)
        }
    }
}