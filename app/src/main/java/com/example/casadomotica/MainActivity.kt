package com.example.casadomotica

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btnStazione = findViewById<Button>(R.id.btnStazione)
        btnStazione.setOnClickListener {
            intent()
        }
    }

    private fun intent(){
        val intent = Intent(this, Stazione::class.java)
        startActivity(intent)
    }
}