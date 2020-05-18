package com.example.task1

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.jar.Attributes

class NextActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.next_layout)


        val intent=intent
        var fullname_Text: String = intent.getStringExtra("Name")
        var email_Text: String = intent.getStringExtra("Email")
        var password_Text: String = intent.getStringExtra("Password")
        var address_Text: String = intent.getStringExtra("Address")

        val information=findViewById<TextView>(R.id.info)

        information.text="Name: "+ fullname_Text +"\n Email :"+email_Text +"\n Password :"+password_Text + "\n Address :"+address_Text
    }

}