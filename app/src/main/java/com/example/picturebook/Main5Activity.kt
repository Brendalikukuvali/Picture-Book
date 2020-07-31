package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main5.*
import kotlinx.android.synthetic.main.activity_main5.btnNext

class Main5Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        btnPrevious.setOnClickListener {
            startActivity(Intent(baseContext,Main4Activity::class.java))
        }
        btnNext.setOnClickListener {
            startActivity(Intent(baseContext,Main6Activity::class.java))
        }
    }
}