package com.example.shoestoreinventoryapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class shoeListAdapter(private val c: Context,private val name:Array<String>,
                      private val size:Array<String>, private val description:Array<String>, private val image:Array<Int>, private val companyName:Array<String>):
    ArrayAdapter<String>(c,R.layout.custom_list_view,name) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        //return super.getView(position, convertView, parent)
        val view = LayoutInflater.from(context).inflate(R.layout.custom_list_view, null, false)

        val valshoename=view.findViewById(R.id.shoeName_textView) as TextView
        val valshoeSize=view.findViewById(R.id.shoeSize_textView) as TextView
        val valshoedescription=view.findViewById(R.id.description_textView) as TextView
        val valshoeimage=view.findViewById(R.id.imageView) as ImageView
        val shoeCompanyName= view.findViewById(R.id.companyName_textView) as TextView
        valshoename.text=name[position]
        valshoeSize.text=size[position]
        valshoedescription.text=description[position]
        valshoeimage.setImageResource(image[position])
        shoeCompanyName.text=(companyName[position])
        return view
    }
}