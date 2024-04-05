package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ChapterFragment : Fragment() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: ChapterAdapterFilipino

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_chapter, container, false)
        recyclerView = view.findViewById(R.id.chapterRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(context)
        adapter = ChapterAdapterFilipino()
        recyclerView.adapter = adapter
        return view
    }
}
class ChapterAdapterFilipino : RecyclerView.Adapter<ChapterAdapterFilipino.ChapterViewHolder>() {
    private val chapters = listOf(
        Chapter("Lesson 1", "Mga Uri ng Pangugusap", listOf("Uri ng Pangungusap", "Video Lesson: Uri ng Pangungusap", "Test Quiz 1")),
        Chapter("Lesson 2", "Mga Uri ng Tayutay", listOf("Uri ng Tayutay", "Video Lesson: Uri ng Tayutay", "Test Quiz 2")),
        Chapter("Lesson 3", "Mga Uri ng Panitikan", listOf("Uri ng Panitikan", "Video Lesson: Uri ng Panitikan", "Test Quiz 3")),
        Chapter("Lesson 4", "Mga Uri ng Karunungang Bayan", listOf("Uri ng Karunungang Bayan", "Video Lesson: Uri ng Karunungang Bayan", "Test Quiz 4")),
        Chapter("Lesson 5", "Mga Uri ng Aspetong Pandiwa", listOf("Uri ng Aspetong Pandiwa", "Video Lesson: Uri ng Aspetong Pandiwa", "Test Quiz 5")),
        Chapter("Certificate Completion", "Final Quiz", listOf("Final Quiz", "Filipino Certificate"))
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

data class Chapter(val lessonNumber: String, val lessonTopic : String,  val topics: List<String>, var isExpanded: Boolean = false)

class TopicsAdapter(private val topics: List<String>, private val isExpanded: Boolean) :
    RecyclerView.Adapter<TopicsAdapter.TopicViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TopicViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_topic, parent, false)
        return TopicViewHolder(view)
    }

    override fun onBindViewHolder(holder: TopicViewHolder, position: Int) {
        holder.bind(topics[position])
    }

    override fun getItemCount(): Int {
        return if (isExpanded) topics.size else 0
    }

    inner class TopicViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val topicText = itemView.findViewById<TextView>(R.id.topicText)

        fun bind(topic: String) {
            topicText.text = topic
        }
    }

}
