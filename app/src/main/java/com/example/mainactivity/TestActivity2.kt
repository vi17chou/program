package com.example.mainactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TestActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test2)
        val submit = findViewById<Button>(R.id.submit)
        submit.setOnClickListener {
            val it = Intent(this, ResultActivity::class.java)
            startActivity(it)
        }
    }
}