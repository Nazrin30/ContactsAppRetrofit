package com.example.contactsapp.data.datasource

import android.util.Log
import com.example.contactsapp.data.entity.Persons
import com.example.contactsapp.retrofit.PersonsDao
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class PersonDatasource(var pdao:PersonsDao) {
    suspend fun save(name:String,phone:String) = pdao.save(name,phone)

    suspend fun update(id:Int,name:String,phone:String) = pdao.update(id,name,phone)

    suspend fun delete(id:Int) = pdao.delete(id)

    suspend fun loadPersons() : List<Persons>  =
        withContext(Dispatchers.IO){
            pdao.loadPersons().persons
        }

    suspend fun search(searchText:String) : List<Persons>  =
        withContext(Dispatchers.IO){
            pdao.search(searchText).persons
        }
}