package com.example.finalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main2.view.*
import kotlinx.android.synthetic.main.activity_main3.*


class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val color1 = findViewById<EditText>(R.id.idColor1)
        val color2 = findViewById<EditText>(R.id.idColor2)
        val color3 = findViewById<EditText>(R.id.idColor3)
        val color4 = findViewById<EditText>(R.id.idColor4)
        val color5 = findViewById<EditText>(R.id.idColor5)
        val btn2 = findViewById<Button>(R.id.idButton2)

        btn2.setOnClickListener {
            startActivity(Intent(this@MainActivity2, MainActivity3::class.java))

           idLine1 = color1.text.toString(!)
           idLine2 = color2.text.toString(!)
          idLine3 = color3.text.toString(!)
           idLine4 = color4.text.toString(!)
           idLine5 = color5.text.toString(!)






        }
    }




}


