package com.jpaz.testapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var editTextName: EditText
    lateinit var textViewName: TextView
    lateinit var submitBtn: Button
    lateinit var name: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextName = findViewById(R.id.edt_txt_name)
        textViewName = findViewById(R.id.txt_view_name)
        submitBtn= findViewById(R.id.submit_btn)

        submitBtn.setOnClickListener{
            name = editTextName.text.toString()
            textViewName.text = name
        }


    }
}