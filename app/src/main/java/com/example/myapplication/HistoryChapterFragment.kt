package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HistoryChapterFragment : Fragment() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: ChapterAdapterHistory

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_chapter, container, false)
        recyclerView = view.findViewById(R.id.chapterRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(context)
        adapter = ChapterAdapterHistory()
        recyclerView.adapter = adapter
        return view
    }
}

class ChapterAdapterHistory : RecyclerView.Adapter<ChapterAdapterHistory.ChapterViewHolder>() {
    private val chapters = listOf(
        Chapter("Lesson 1", "Spanish Colonial Period", listOf("Spanish Colonial Period", "Video Lesson: Spanish Colonial Period", "Test Quiz 1")),
        Chapter("Lesson 2", "Ancient Civilization", listOf("Ancient Civilization", "Video Lesson: Ancient Civilization", "Test Quiz 2")),
        Chapter("Lesson 3", "EDSA Revolution", listOf("EDSA Revolution", "Video Lesson: EDSA Revolution", "Test Quiz 3")),
        Chapter("Lesson 4", "American Colonial Period", listOf("American Colonial Period", "Video Lesson: American Colonial Period", "Test Quiz 4")),
        Chapter("Lesson 5", "Philippine Geography", listOf("Philippine Geography", "Video Lesson: Philippine Geography", "Test Quiz 5")),
        Chapter("Certificate Completion", "Final Quiz", listOf())
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChapterViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_chapter, parent, false)
        return ChapterViewHolder(view)
    }

    override fun onBindViewHolder(holder: ChapterViewHolder, position: Int) {
        val chapter = chapters[position]
        holder.bind(chapter)
    }

    override fun getItemCount(): Int {
        return chapters.size
    }

    inner class ChapterViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val chapterLessonNumber = itemView.findViewById<TextView>(R.id.tvLessonNumber)
        private val chapterLessonTitle = itemView.findViewById<TextView>(R.id.tvLessonTitle)
        private val topicsRecyclerView = itemView.findViewById<RecyclerView>(R.id.topicsRecyclerView)

        init {
            itemView.setOnClickListener {
                val chapter = chapters[adapterPosition]
                val isExpanded = chapter.isExpanded
                chapter.isExpanded = !isExpanded
                notifyItemChanged(adapterPosition)
            }
        }

        fun bind(chapter: Chapter) {
            chapterLessonNumber.text = chapter.lessonNumber
            chapterLessonTitle.text = chapter.lessonTopic
            topicsRecyclerView.apply {
                layoutManager = LinearLayoutManager(itemView.context)
                adapter = TopicsAdapter(chapter.topics, chapter.isExpanded)
                visibility = if (chapter.isExpanded) View.VISIBLE else View.GONE
            }
        }
    }
}

