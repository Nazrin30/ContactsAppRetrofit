package com.example.contactsapp.retrofit

class ApiUtils {
    companion object {
        val BASE_URL = "http://kasimadalan.pe.hu/"

        fun getPersonsDao() : PersonsDao {
            return RetrofitClient.getClient(BASE_URL).create(PersonsDao::class.java)
        }
    }
}