package com.example.listviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import java.util.ArrayList

class MainActivity : AppCompatActivity()
{

    var arr = arrayOf<String>("Bhut Tushar","Vismay Solanki","Sahil Anand","Elon Musk","Narendra Modi")
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //   using android (built in) adapter
        //   val ad = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arr)
        //   listView.adapter = ad

        // using Custom Adapter

        val dataCollege = arrayOf(dataCollege("Bhut Tushar","PDEU-Gandhinagar"),
                                  dataCollege("Sahil Anand","PDEU-Gandhinagar"),
                                  dataCollege("Nayan Senjaliya","Nirma-Gandhinagar"),
                                  dataCollege("Bhuva Mehul","DAIICT-Gandhinagar"),
                                  dataCollege("Solanki Vismay","GEC-Rajkot"),
                                  dataCollege("Bholani Darshan","GEC-Bhavnagar"),
                                  dataCollege("Mayur Chitraliya","BVM-Vallabh Vidhyanagar"),
                                  dataCollege("Vaylu Dhruvil","LD-Ahmedabad"),
                                  dataCollege("Vayak Bhavin","LD-Ahmedabad"),
                                  dataCollege("Utsav Mehta","PDEU-Gandhinagar"),
                                  dataCollege("Devrajsinh Jhala","PDEU-Gandhinagar"),
                                  dataCollege("Jay Kanani","CANADA"),
                                  dataCollege("Ravi Patel","PDEU-Gandhinagar"),
                                  dataCollege("Harsh Katariya","PDEU-Gandhinagar"),
                                  dataCollege("Vipul Chaudhary","PDEU-Gandhinagar"),
                                  dataCollege("Harsh Varmora","PDEU-Gandhinagar"))

        val listView = findViewById<ListView>(R.id.list1)
        val mrBTAdapter = MrBTAdapter(dataCollege)
        listView.adapter = mrBTAdapter
    }
}