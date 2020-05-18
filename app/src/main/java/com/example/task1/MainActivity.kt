package com.example.task1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
     private var user=User()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Next.setOnClickListener {

            val fullname_Text: String = Name_text.text.toString()
            val email_Text: String = Email_text.text.toString()
            val password_Text: String = Password_text.text.toString()
            val address_Text: String = Address_text.text.toString()

            user.setFullName(fullname_Text)
            user.setEmail( email_Text)
            user.setPassword(password_Text)
            user.setAddress(address_Text)

            if(validateText()){
                Toast.makeText(this,"Done",Toast.LENGTH_LONG).show()
            }

            val intent= Intent(this,NextActivity::class.java)
            intent.putExtra("Name",fullname_Text)
            intent.putExtra("Email",email_Text)
            intent.putExtra("Password",password_Text)
            intent.putExtra("Address",address_Text)
            startActivity(intent)

        }




    }

    private fun validateText():Boolean {
        if(Email_text.text.toString().isEmpty()){
            Email_text.error="Email is Required"
            return false
        }
        else if(Name_text.text.toString().isEmpty()){
            Name_text.error="Name is Required"
            return false
        }
        else if(Password_text.text.toString().isEmpty()){
            Password_text.error="password is Required"
            return false
        }
        else if(Address_text.text.toString().isEmpty()){
            Address_text.error="Address is Required"
            return false
        }
        return true
    }
}
