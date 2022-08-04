package com.example.shoestoreinventoryapp

import android.os.Bundle
import android.util.Log
import android.view.*
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.shoestoreinventoryapp.databinding.FragmentShoeListScreenBinding

class ShoeListScreenFragment : Fragment() {
    val viewModel: ListOfShoesViewModel by activityViewModels()
    private lateinit var binding: FragmentShoeListScreenBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_shoe_list_screen, container, false)
        // viewModel = ViewModelProvider(this).get(ListOfShoesViewModel::class.java)
        binding.myVarShoeData = viewModel
        setHasOptionsMenu(true)
        binding.floatingActionButton.setOnClickListener { v: View ->
            v.findNavController()
                .navigate(R.id.action_shoeListScreenFragment_to_shoeDetailEntryFragment)
        }
        binding.setLifecycleOwner(this)
        binding.myVarShoeData = viewModel

        viewModel.shoeList.observe(viewLifecycleOwner, Observer { list ->
            val custom =
                LayoutInflater.from(context).inflate(R.layout.custom_list_view, null, false)
            binding.shoeLinearLayout.addView(custom)
            val valshoename = custom.findViewById(R.id.shoeName_textView) as TextView
            val valshoeSize = custom.findViewById(R.id.shoeSize_textView) as TextView
            val valshoedescription = custom.findViewById(R.id.description_textView) as TextView
            val valshoeimage = custom.findViewById(R.id.imageView) as ImageView
            val shoeCompanyName = custom.findViewById(R.id.companyName_textView) as TextView


            list.forEach() {
                valshoename.text = it.name
                valshoeSize.text = it.size
                valshoedescription.text = it.description
                valshoeimage.setImageResource(R.drawable.shoe1)
                shoeCompanyName.text = it.company
            }
        })

        val myShoeData = shoeListAdapter(
            requireContext(),
            viewModel.shoeName,
            viewModel.shoeSize,
            viewModel.shoeDescription,
            viewModel.shoeImage,
            viewModel.shoeCompanyName
        )
        binding.customListView.adapter = myShoeData

        return binding.root
    }


    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        findNavController().navigate(ShoeListScreenFragmentDirections.actionShoeListScreenFragmentToLoginFragment())
        return true
    }


}