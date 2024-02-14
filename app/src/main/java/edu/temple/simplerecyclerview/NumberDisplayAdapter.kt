package edu.temple.simplerecyclerview

import android.icu.text.ListFormatter.Width
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// Step 3: Complete adapter implementation

class NumberDisplayAdapter (_numbers: Array<Int>) : RecyclerView.Adapter<NumberDisplayAdapter.NumberViewHolder>() /* Step 3a: Provide Adapter Parent */ {

    private val numbers = _numbers
    class NumberViewHolder (val textView: TextView) : RecyclerView.ViewHolder (textView) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberViewHolder {
        return NumberViewHolder (
            TextView(
                parent.context
            ).apply {
                layoutParams = ViewGroup.LayoutParams(300, 300 )
            }
        )
    }

    override fun getItemCount(): Int {
        return 100
    }

    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {
        holder.textView.setText(numbers[position])
    }

    //Step 3b: Complete function definitions for adapter

}