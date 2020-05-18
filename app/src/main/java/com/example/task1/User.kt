package com.example.task1

public class User {

     var fullname_Text:String=" "
     var email_Text:String=" "
     var password_Text:String=" "
     var address_Text:String=" "

   constructor()

    constructor(username:String, fullname:String, bio:String, image:String, uid:String){
        this.fullname_Text=fullname_Text
        this.email_Text=email_Text
        this.password_Text=password_Text
        this.address_Text=address_Text

    }

    fun getFullName():String
    {
        return fullname_Text
    }
    fun setFullName(fullname_Text:String)
    {
        this.fullname_Text=fullname_Text
    }


    fun getEmail():String
    {
        return email_Text
    }
    fun setEmail(email_Text:String)
    {
        this.email_Text=email_Text
    }


    fun getPassword():String
    {
        return password_Text
    }
    fun setPassword(password_Text:String)
    {
        this.password_Text=password_Text
    }


    fun getAddress():String
    {
        return address_Text
    }
    fun setAddress(address_Text:String)
    {
        this.address_Text=address_Text
    }





}