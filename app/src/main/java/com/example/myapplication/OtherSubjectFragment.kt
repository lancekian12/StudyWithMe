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
            SubjectItem(R.drawable.sciencelogo, "Science Subject", R.drawable.sciencesubject),
            SubjectItem(R.drawable.filipinologo, "Filipino Subject", R.drawable.filipinosubject),
            SubjectItem(R.drawable.mathlogo, "Math Subject", R.drawable.mathsubject),
            SubjectItem(R.drawable.englishlogo, "English Subject", R.drawable.englishsubject),
            SubjectItem(R.drawable.historylogo, "History Subject", R.drawable.history)
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

    override fun onBindViewHolder(holder: SubjectAdapter.SubjectViewHolder, position: Int) {
        val subjectItem = subjectItems[position]
        holder.bind(subjectItem)

        // Set a click listener for the item
        holder.itemView.setOnClickListener {
            // Handle item click here based on position
            when (position) {
                0 -> {
                    val intent = Intent(context, ScienceContent::class.java)
                    context.startActivity(intent)
                }
                1 -> {
                    val intent = Intent(context, FilipinoContent::class.java)
                    context.startActivity(intent)
                }
                2 -> {
                    val intent = Intent(context, MathContent::class.java)
                    context.startActivity(intent)
                }
                3 -> {
                    val intent = Intent(context, EnglishContent::class.java)
                    context.startActivity(intent)
                }
                4 -> {
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
        private val logos : ImageView = itemView.findViewById(R.id.ivLogos)
        private val lessonNumberTextView: TextView = itemView.findViewById(R.id.tvSubject)
        private val subjectPictureImageView: ImageView = itemView.findViewById(R.id.ivSubject)

        fun bind(subjectItem: SubjectItem) {
            logos.setImageResource(subjectItem.id)
            lessonNumberTextView.text = subjectItem.lessonNumber
            subjectPictureImageView.setImageResource(subjectItem.subjectPictureResourceId)
        }
    }
}

