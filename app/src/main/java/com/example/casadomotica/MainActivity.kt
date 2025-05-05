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
            intentStazione()
        }

        val btnWebView = findViewById<Button>(R.id.btnWebView)
        btnWebView.setOnClickListener {
            intentWebView()
        }
    }

    private fun intentStazione(){
        val intent = Intent(this, Stazione::class.java)
        startActivity(intent)
    }

    private fun intentWebView(){
        val intent = Intent(this, WebView::class.java)
        startActivity(intent)
    }
}