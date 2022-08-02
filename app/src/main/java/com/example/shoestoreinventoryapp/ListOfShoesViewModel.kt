package com.example.shoestoreinventoryapp

import android.util.Log
import androidx.lifecycle.ViewModel

class ListOfShoesViewModel: ViewModel() {
    val score=2
   lateinit var shoeList: MutableList<String>
   init {
       getShoeList()
   }
    private fun getShoeList()
    {
        shoeList = mutableListOf(
            "queen",
            "hospital",
            "basketball",
            "cat",
            "change",
            "snail",
            "soup",
            "calendar",
            "sad",
            "desk",
            "guitar",
            "home",
            "railway",
            "zebra",
            "jelly",
            "car",
            "crow",
            "trade",
            "bag",
            "roll",
            "bubble"
        )
    }
}