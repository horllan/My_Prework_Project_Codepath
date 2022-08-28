package com.example.my_prework_project_codepath

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        findViewById<Button>(R.id.btn_change_text).setOnClickListener {
            val defaultText = findViewById<TextView>(R.id.display_text).text
            if (findViewById<EditText>(R.id.user_text).text.toString() == "") {
                findViewById<TextView>(R.id.display_text).text = defaultText
            } else findViewById<TextView>(R.id.display_text).text = findViewById<EditText>(R.id.user_text).text

        }

        findViewById<Button>(R.id.btn_change_text_color).setOnClickListener {

            findViewById<TextView>(R.id.display_text).setTextColor(resources.getColor(R.color.black))
        }
        findViewById<Button>(R.id.btn_change_bg_color).setOnClickListener {
            findViewById<RelativeLayout>(R.id.container).setBackgroundColor(resources.getColor(com.google.android.material.R.color.primary_text_disabled_material_dark))
        }
    }
}