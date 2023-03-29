package com.example.mainactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MethodActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_method)
        val game=findViewById<Button>(R.id.game)
        val breath=findViewById<Button>(R.id.breath)
        val sport=findViewById<Button>(R.id.sport)
        val emotion=findViewById<Button>(R.id.emotion)
        val diet=findViewById<Button>(R.id.diet)


        game.setOnClickListener {
            val it= Intent(this,GameActivity::class.java)
            startActivity(it)
        }

        breath.setOnClickListener {
            val it= Intent(this,BreathActivity::class.java)
            startActivity(it)
        }

        sport.setOnClickListener {
            val it= Intent(this,SportActivity::class.java)
            startActivity(it)
        }

        emotion.setOnClickListener {
            val it= Intent(this,EmotionActivity::class.java)
            startActivity(it)
        }

        diet.setOnClickListener {
            val it= Intent(this,DietActivity::class.java)
            startActivity(it)
        }

    }
}