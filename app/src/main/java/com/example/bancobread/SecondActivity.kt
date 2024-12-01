package com.example.bancobread

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton
import android.util.Log

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)

        val btnInvest: MaterialButton = findViewById(R.id.btn_investment)

        btnInvest.setOnClickListener {
            try {
                val intent = Intent(this, ThirdActivity::class.java)
                startActivity(intent)
            } catch (e: Exception) {
                Log.e("SecondActivity", "Error starting ThirdActivity: ${e.message}")
            }
        }
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        setContentView(R.layout.second_activity)

        val btnInvest: MaterialButton = findViewById(R.id.btn_investment)

        btnInvest.setOnClickListener {
            val intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent)
        }
    }
}
