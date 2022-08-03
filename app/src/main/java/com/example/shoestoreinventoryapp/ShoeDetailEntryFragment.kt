package com.example.shoestoreinventoryapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentResultOwner
import androidx.navigation.findNavController
import com.example.shoestoreinventoryapp.databinding.FragmentShoeDetailEntryBinding

class ShoeDetailEntryFragment : Fragment() {
    private lateinit var binding:FragmentShoeDetailEntryBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=DataBindingUtil.inflate(inflater,R.layout.fragment_shoe_detail_entry, container, false)
        binding.buttonCancel.setOnClickListener { v:View->
            v.findNavController().navigate(R.id.action_shoeDetailEntryFragment_to_shoeListScreenFragment)
        }
        return binding.root
    }
}