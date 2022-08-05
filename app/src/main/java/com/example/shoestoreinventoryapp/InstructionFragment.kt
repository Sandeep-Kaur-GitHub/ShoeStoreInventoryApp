package com.example.shoestoreinventoryapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.shoestoreinventoryapp.databinding.FragmentInstructionBinding

class InstructionFragment : Fragment() {
    private lateinit var binding: FragmentInstructionBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_instruction, container, false)
        binding.navToListScreenButton.setOnClickListener { v: View ->
            v.findNavController()
                .navigate(R.id.action_instructionFragment_to_shoeListScreenFragment)
        }
        return binding.root
    }

}