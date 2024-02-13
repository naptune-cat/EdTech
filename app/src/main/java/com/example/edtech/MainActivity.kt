package com.example.edtech

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val startBtn = findViewById<Button>(R.id.btn)
        startBtn.setOnClickListener{
            intent = Intent(/* packageContext = */ applicationContext, /* cls = */ Activity2::class.java)
            startActivity(intent)
        }
    }

}