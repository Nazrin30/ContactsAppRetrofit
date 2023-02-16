package com.example.contactsapp.retrofit

import com.example.contactsapp.data.entity.CRUDResponse
import com.example.contactsapp.data.entity.PersonsResponse
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

interface PersonsDao {
    //http://kasimadalan.pe.hu/persons/getAllPersons.php
    //http://kasimadalan.pe.hu/ -> Base url
    //persons/getAllPersons.php

    @GET("persons/getAllPersons.php")
    suspend fun loadPersons() : PersonsResponse

    @POST("persons/searchPersons.php")
    @FormUrlEncoded
    suspend fun search(@Field("name") searchText:String) : PersonsResponse

    @POST("persons/insertPersons.php")
    @FormUrlEncoded
    suspend fun save(@Field("name") name:String,
                     @Field("phone") phone:String) : CRUDResponse

    @POST("persons/updatePersons.php")
    @FormUrlEncoded
    suspend fun update(@Field("id") id:Int,
                       @Field("name") name:String,
                       @Field("phone") phone:String) : CRUDResponse

    @POST("persons/deletePersons.php")
    @FormUrlEncoded
    suspend fun delete(@Field("id") id:Int) : CRUDResponse
}