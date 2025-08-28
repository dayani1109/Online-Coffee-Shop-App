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

class Profile : AppCompatActivity() {

    lateinit var Logoutbtn : Button
    lateinit var profilebackarrow : ImageView
    lateinit var Profilename : TextView
    lateinit var Profileemail : TextView

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        Logoutbtn = findViewById(R.id.Logoutbtn)
        profilebackarrow = findViewById(R.id.profilebackarrow)
        Profilename = findViewById(R.id.Profilename)
        Profileemail = findViewById(R.id.Profileemail)


        val Logoutbtn = findViewById<Button>(R.id.Logoutbtn)
        Logoutbtn.setOnClickListener {
            val intent = Intent(this, login::class.java)
            startActivity(intent)
        }

        val profilebackarrow = findViewById<ImageView>(R.id.profilebackarrow)
        profilebackarrow.setOnClickListener {
            val intent = Intent(this, hotcoffeehome::class.java)
            startActivity(intent)
        }

//        val name = intent.getStringExtra("name")
//        val email = intent.getStringExtra("email")
//
//        val nameTextView = findViewById<TextView>(R.id.Profilename)
//        val emailTextView = findViewById<TextView>(R.id.Profileemail)
//
//        nameTextView.text = name
//        emailTextView.text = email
    }
}