package com.example.mainactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DiaryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diary)
        val New=findViewById<Button>(R.id.New)
        val select=findViewById<Button>(R.id.select)
        val del=findViewById<Button>(R.id.del)

        New.setOnClickListener {
            val it= Intent(this,NewActivity::class.java)
            startActivity(it)
        }

        select.setOnClickListener {
            val it= Intent(this,SelectActivity::class.java)
            startActivity(it)
        }

        del.setOnClickListener {
            val it= Intent(this,DelActivity::class.java)
            startActivity(it)
            //為什麼又當機了
            //c8 c8
        }
    }
}