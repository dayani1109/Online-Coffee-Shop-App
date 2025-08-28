package com.example.onlinecoffeeshopapp

import android.content.Intent
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class register : AppCompatActivity() {

    lateinit var registerName : EditText
    lateinit var registerEmail : EditText
    lateinit var registerPhone : EditText
    lateinit var registerPassword : EditText
    lateinit var registerConfirmPassword : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_register)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        registerName = findViewById(R.id.registerName)
        registerEmail = findViewById(R.id.registerEmail)
        registerPhone = findViewById(R.id.registerPhone)
        registerPassword = findViewById(R.id.registerPassword)
        registerConfirmPassword = findViewById(R.id.registerConfirmPassword)


        val registerButton = findViewById<Button>(R.id.registerButton)

        registerButton.setOnClickListener {
            val intent = Intent(this, login::class.java)
            startActivity(intent)
        }

        val registerSignin = findViewById<TextView>(R.id.registerSignin)

        registerSignin.setOnClickListener {
            val intent = Intent(this, login::class.java)
            startActivity(intent)
        }

//        registerButton.setOnClickListener {
//        val intent = Intent(this, Profile::class.java)
//        intent.putExtra("name", registerName.text.toString())
//        intent.putExtra("email", registerEmail.text.toString())
//        startActivity(intent)
//            }
    }
}