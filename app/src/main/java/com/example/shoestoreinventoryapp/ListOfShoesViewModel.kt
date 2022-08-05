package com.example.shoestoreinventoryapp

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ListOfShoesViewModel() : ViewModel() {

    private var _shoeList = MutableLiveData<MutableList<DataClass>>(mutableListOf())
    val shoeList: MutableLiveData<MutableList<DataClass>>
        get() = _shoeList

    fun getNewShoe() = DataClass("", "", "", "")
    fun save(dataClass: DataClass) {
        _shoeList.value!!.add(dataClass)
    }

}
