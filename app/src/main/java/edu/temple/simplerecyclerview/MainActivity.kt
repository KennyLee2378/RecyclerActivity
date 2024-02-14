package edu.temple.simplerecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Step 1: Reference RecyclerView object
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)


        //Step 2: Provide a LayoutManager
        val numbers = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 8, 9)

        //Step 4: Provide a RecyclerView.Adapter
        recyclerView.adapter = NumberDisplayAdapter(numbers)
    }
}