package com.example.contactsapp.data.entity

import java.io.Serializable

data class Persons(var id:Int,
                   var name:String,
                   var phone:String) : Serializable {
}