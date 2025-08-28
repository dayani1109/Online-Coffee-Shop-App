package com.example.onlinecoffeeshopapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TrackOrder : AppCompatActivity() {


    lateinit var trackorderbtn : Button
    lateinit var profileTrack : ImageView
    lateinit var trackorderbackarrow : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_track_order)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        trackorderbtn = findViewById(R.id.trackorderbtn)
        profileTrack = findViewById(R.id.profileTrack)
        trackorderbackarrow = findViewById(R.id.trackorderbackarrow)

        val trackorderbtn = findViewById<Button>(R.id.trackorderbtn)
        trackorderbtn.setOnClickListener {
            val intent = Intent(this, hotcoffeehome::class.java)
            startActivity(intent)
        }

        val profileTrack = findViewById<ImageView>(R.id.profileTrack)
        profileTrack.setOnClickListener {
            val intent = Intent(this, Profile::class.java)
            startActivity(intent)
        }

        val trackorderbackarrow = findViewById<ImageView>(R.id.trackorderbackarrow)
        trackorderbackarrow.setOnClickListener {
            val intent = Intent(this, OrderPlaceSuccessful::class.java)
            startActivity(intent)
        }
    }
}