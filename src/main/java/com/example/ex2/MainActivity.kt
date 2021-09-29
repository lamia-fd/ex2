package com.example.ex2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var butt: Button
    lateinit var Input: EditText
    lateinit var Input2: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Input = findViewById(R.id.editTextTextPersonName)
        Input2 = findViewById(R.id.editTextTextPersonName2)
        butt = findViewById(R.id.button)

        butt.setOnClickListener {
            Toast.makeText(applicationContext,"${Input.text}  ${Input2.text} ",Toast.LENGTH_LONG).show()

        }
    }
}