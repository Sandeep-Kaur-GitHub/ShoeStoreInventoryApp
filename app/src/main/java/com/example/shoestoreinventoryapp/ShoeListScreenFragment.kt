package com.example.shoestoreinventoryapp

import android.os.Bundle
import android.util.Log
import android.view.*
import android.widget.ArrayAdapter
import androidx.lifecycle.Observer
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.shoestoreinventoryapp.R
import com.example.shoestoreinventoryapp.databinding.FragmentShoeListScreenBinding

class ShoeListScreenFragment : Fragment() {
    private lateinit var viewModel: ListOfShoesViewModel
    private lateinit var binding: FragmentShoeListScreenBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_shoe_list_screen, container, false)
        viewModel = ViewModelProvider(this).get(ListOfShoesViewModel::class.java)
        setHasOptionsMenu(true)

        val myada= shoeListAdapter(requireContext(),viewModel.shoeName,viewModel.shoeSize,viewModel.shoeDescription,viewModel.shoeImage, viewModel.shoeCompanyName)
        binding.customListView.adapter =myada
            return binding.root
    }


    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item, requireView().findNavController())
                || super.onOptionsItemSelected(item)
    }


}