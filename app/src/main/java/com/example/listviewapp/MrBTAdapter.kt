package com.example.listviewapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class MrBTAdapter(private val college: Array<dataCollege>) : BaseAdapter()
{
    override fun getItem(position: Int): dataCollege {
        return college[position]
    }
    override fun getCount(): Int {
        return college.size
    }

    override fun getItemId(position: Int): Long {
        return college[position].hashCode().toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View
    {
        // we can't access custom_layout directly then we need to inflate it
        var convertView = LayoutInflater.from(parent!!.context).inflate(R.layout.custom_layout,parent,false)
        var collegeN:TextView = convertView.findViewById(R.id.collegeName)
        var name:TextView = convertView.findViewById(R.id.studentName)

        collegeN.text = getItem(position).college
        name.text = getItem(position).Name

        // for onItemCLickListener you have to make it before returning the view
        convertView.setOnClickListener()
        {
            Toast.makeText(parent.context,"You clicked on "+position,Toast.LENGTH_SHORT).show()
        }
        return convertView
    }

    // ANOTHER METHOD FOR GET VIEW

//    override fun getView(position:Int, conversView: View?, container: ViewGroup?): View
//    {
//        val collegeView:View
//        val viewHolder: ViewHolder
//
//        if(conversView == null)
//        {
//            collegeView = LayoutInflater.from(container?.context).inflate(R.layout.custom_layout,container,false)
//
//            viewHolder = ViewHolder()
//            with(viewHolder)
//            {
//                studentName = collegeView.findViewById(R.id.studentName)
//                collegeName = collegeView.findViewById(R.id.collegeName)
//                collegeView.tag = this
//            }
//        }
//        else
//        {
//            collegeView = conversView
//            viewHolder = conversView.tag as ViewHolder
//        }
//        with(viewHolder)
//        {
//            studentName.text = getItem(position).Name
//            collegeName.text = getItem(position).college
//        }
//        return collegeView
//    }
//    private class ViewHolder
//    {
//        lateinit var studentName:TextView
//        lateinit var collegeName:TextView
//    }
}