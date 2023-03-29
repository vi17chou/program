package com.example.mainactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val home_page=findViewById<Button>(R.id.home_page)
        home_page.setOnClickListener {
            val it= Intent(this,HomeActivity::class.java)
            startActivity(it)
        }
    }
}