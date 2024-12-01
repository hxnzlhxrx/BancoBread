package com.example.bancobread

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var btnCreditCard: View
    private lateinit var btnInvestment: View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("MainActivity", "onCreate called")
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Manejando ambos tipos de vistas
        btnCreditCard = findViewById(R.id.btn_credit_card)
            ?: findViewById(R.id.btn_credit_card_land)

        btnInvestment = findViewById(R.id.btn_investment)
            ?: findViewById(R.id.btn_investment_land)

        btnCreditCard.setOnClickListener {
            Log.d("MainActivity", "btn_credit_card clicked")
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

        btnInvestment.setOnClickListener {
            Log.d("MainActivity", "btn_investment clicked")
            val intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent)
        }

        if (savedInstanceState != null) {
            Log.d("MainActivity", "Restoring state")
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d("MainActivity", "onSaveInstanceState called")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.d("MainActivity", "onRestoreInstanceState called")
    }
}
