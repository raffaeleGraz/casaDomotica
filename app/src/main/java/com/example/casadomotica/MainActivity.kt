package com.example.casadomotica

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        
        val btnStazione = findViewById<Button>(R.id.btnStazione)
        btnStazione.setOnClickListener {
            intent(Stazione::class.java)
        }

    }

    private fun intent(nomeActivity: Class<*>){
        val intent = Intent(this, nomeActivity)
        startActivity(intent)
    }

}