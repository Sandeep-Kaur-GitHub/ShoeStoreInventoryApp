package com.example.shoestoreinventoryapp

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ListOfShoesViewModel : ViewModel() {
    val shoeName =
        arrayOf("Nike ZoomX ", "Skechers Work Men's Nampa Slip Resistant Work Shoe Black","Gennaio Women's Sneaker")
    val shoeDescription = arrayOf(
        "Breathable, lightweight comfort, support, softness and a snappy response in a shoe that’s designed to keep you running. It’s the total package.",
        "Get a good day's work every day with the NAMPA black lace up slip-resistant sneaker from SKECHERS.","These black Gennaio high-top sneakers prove Fila pulls off sleek and simple, just as well as it does big and bold. They've been crafted will panels of smooth leather and simply detailed with the brand's emblem embroidered on the side."
    )
    val shoeImage = arrayOf(R.drawable.shoe1, R.drawable.shoe2, R.drawable.shoe3)
    val shoeSize = arrayOf("Size: 8 U.S", "Size: 11 U.S","Size: 10 U.S")
    val shoeCompanyName= arrayOf("Brand: Nike","Brand: Skechers", "Brand: Fila")

}