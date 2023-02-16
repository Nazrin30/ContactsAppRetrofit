package com.example.contactsapp.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.contactsapp.data.repo.PersonRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SaveViewModel @Inject constructor (var prepo:PersonRepository) : ViewModel() {

    fun save(name:String,phone:String){
        CoroutineScope(Dispatchers.Main).launch {
            prepo.save(name,phone)
        }
    }
}