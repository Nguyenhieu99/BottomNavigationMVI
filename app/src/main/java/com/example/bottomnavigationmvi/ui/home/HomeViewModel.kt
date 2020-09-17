package com.example.bottomnavigationmvi.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Click number: ${number}"
    }

    fun countNumber() {
        number += 1
        _text.value = "Click number: ${number}"
    }

    private var number = 0


    val text: LiveData<String> = _text
}