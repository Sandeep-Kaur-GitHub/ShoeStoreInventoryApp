package com.example.shoestoreinventoryapp

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentResultOwner
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.findNavController
import com.example.shoestoreinventoryapp.databinding.FragmentShoeDetailEntryBinding

class ShoeDetailEntryFragment : Fragment() {
    private lateinit var binding:FragmentShoeDetailEntryBinding
   val viewModel:ListOfShoesViewModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=DataBindingUtil.inflate(inflater,R.layout.fragment_shoe_detail_entry, container, false)
        binding.buttonCancel.setOnClickListener { v:View->
            v.findNavController().navigate(R.id.action_shoeDetailEntryFragment_to_shoeListScreenFragment)
        }
        val myShoes=viewModel.getNewShoe()
        binding.myVarshoe=myShoes
        binding.buttonSave.setOnClickListener { v:View->
            viewModel.save(myShoes)
           v.findNavController().navigate(ShoeDetailEntryFragmentDirections.actionShoeDetailEntryFragmentToShoeListScreenFragment())
        }


        return binding.root
    }
}