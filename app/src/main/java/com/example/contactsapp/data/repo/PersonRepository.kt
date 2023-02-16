package com.example.contactsapp.data.repo

import com.example.contactsapp.data.datasource.PersonDatasource
import com.example.contactsapp.data.entity.Persons

class PersonRepository(var pds:PersonDatasource) {

    suspend fun save(name:String,phone:String) = pds.save(name,phone)

    suspend fun update(id:Int,name:String,phone:String) = pds.update(id,name,phone)

    suspend fun delete(id:Int) = pds.delete(id)

    suspend fun loadPersons() : List<Persons> = pds.loadPersons()

    suspend fun search(searchText:String) : List<Persons> = pds.search(searchText)
}