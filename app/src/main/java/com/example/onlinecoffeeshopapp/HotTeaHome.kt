package com.example.onlinecoffeeshopapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class HotTeaHome : AppCompatActivity() {

    lateinit var hotcoffeeBtn3: Button
    lateinit var coldcoffeeBtn3: Button
    lateinit var hotteaBtn3 : Button
    lateinit var imgblacktea : ImageView
    lateinit var hotTeaprofile : ImageView
    lateinit var hotteacart : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_hot_tea_home)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        hotcoffeeBtn3 = findViewById(R.id.hotcoffeeBtn3)
        coldcoffeeBtn3 = findViewById(R.id.coldcoffeeBtn3)
        hotteaBtn3 = findViewById(R.id.hotteaBtn3)
        imgblacktea = findViewById(R.id.imgblacktea)
        hotTeaprofile = findViewById(R.id.hotTeaprofile)
        hotteacart = findViewById(R.id.hotteacart)

        val hotcoffeeBtn3 = findViewById<Button>(R.id.hotcoffeeBtn3)
        hotcoffeeBtn3.setOnClickListener {
            val intent = Intent(this, hotcoffeehome::class.java)
            startActivity(intent)
        }

        val coldcoffeeBtn3 = findViewById<Button>(R.id.coldcoffeeBtn3)
        coldcoffeeBtn3.setOnClickListener {
            val intent = Intent(this, ColdCoffeeHome::class.java)
            startActivity(intent)
        }

        val hotteaBtn3 = findViewById<Button>(R.id.hotteaBtn3)
        hotteaBtn3.setOnClickListener {
            val intent = Intent(this, HotTeaHome::class.java)
            startActivity(intent)
        }

        val imgblacktea = findViewById<ImageView>(R.id.imgblacktea)
        imgblacktea.setOnClickListener {
            val intent = Intent(this, blackTeaPage::class.java)
            startActivity(intent)
        }

        val hotTeaprofile = findViewById<ImageView>(R.id.hotTeaprofile)
        hotTeaprofile.setOnClickListener {
            val intent = Intent(this, Profile::class.java)
            startActivity(intent)
        }

        val hotteacart = findViewById<ImageView>(R.id.hotteacart)
        hotteacart.setOnClickListener {
            val intent = Intent(this, Cart::class.java)
            startActivity(intent)
        }
    }
}