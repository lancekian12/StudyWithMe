package com.example.myapplication

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.R // Import your R class from your package

class OtherSubjectFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_other_subject, container, false)
        val recyclerView = view.findViewById<RecyclerView>(R.id.chapterRecyclerView)

        // Create a list of subject items
        val subjectItems = listOf(
            SubjectItem(1, "Science Subject", R.drawable.sciencesubject),
            SubjectItem(2, "Filipino Subject", R.drawable.filipinosubject),
            SubjectItem(3, "Math Subject", R.drawable.mathsubject),
            SubjectItem(4, "English Subject", R.drawable.englishsubject),
            SubjectItem(5, "History Subject", R.drawable.history)
            // Add more SubjectItem objects as needed
        )

        // Create and set the adapter, passing the context
        val adapter = SubjectAdapter(requireContext(), subjectItems)
        recyclerView.adapter = adapter

        // Set a layout manager, e.g., LinearLayoutManager
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        return view
    }
}

data class SubjectItem(
    val id: Int,
    val lessonNumber: String,
    val subjectPictureResourceId: Int
)

class SubjectAdapter(private val context: Context, private val subjectItems: List<SubjectItem>) : RecyclerView.Adapter<SubjectAdapter.SubjectViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SubjectViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_othersubject, parent, false)
        return SubjectViewHolder(view)
    }

    override fun onBindViewHolder(holder: SubjectViewHolder, position: Int) {
        val subjectItem = subjectItems[position]
        holder.bind(subjectItem)

        // Set a click listener for the item
        holder.itemView.setOnClickListener {
            // Handle item click here
            when (subjectItem.id) {
                1 -> {
                    val intent = Intent(context, ScienceContent::class.java)
                    context.startActivity(intent)
                }
                2 -> {
                    val intent = Intent(context, FilipinoContent::class.java)
                    context.startActivity(intent)
                }
                3 -> {
                    val intent = Intent(context, MathContent::class.java)
                    context.startActivity(intent)
                }
                4 -> {
                    val intent = Intent(context, EnglishContent::class.java)
                    context.startActivity(intent)
                }
                5 -> {
                    val intent = Intent(context, HistoryContent::class.java)
                    context.startActivity(intent)
                }
                // Add more cases for additional items
            }
        }
    }

    override fun getItemCount(): Int {
        return subjectItems.size
    }

    inner class SubjectViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val lessonNumberTextView: TextView = itemView.findViewById(R.id.tvSubject)
        private val subjectPictureImageView: ImageView = itemView.findViewById(R.id.ivSubject)

        fun bind(subjectItem: SubjectItem) {
            lessonNumberTextView.text = subjectItem.lessonNumber
            subjectPictureImageView.setImageResource(subjectItem.subjectPictureResourceId)
        }
    }
}

