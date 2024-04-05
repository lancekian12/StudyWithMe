package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView

class ToDoAdapter(private val db: NoteDatabaseHandler, val context: Context) :
    RecyclerView.Adapter<ToDoAdapter.ViewHolder>() {
    private var todoList: List<ToDoModel> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(context).inflate(R.layout.task_layout, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = todoList[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return todoList.size
    }



    @SuppressLint("NotifyDataSetChanged")
    fun setTasks(todoList: List<ToDoModel>) {
        this.todoList = todoList
        notifyDataSetChanged()
    }

    fun deleteItem(position: Int) {
        val item = todoList[position]
        db.deleteTask(item.id)
        val mutableList = todoList.toMutableList()
        mutableList.removeAt(position)
        todoList = mutableList.toList()
        notifyItemRemoved(position)
    }

    fun editItem(position: Int, newTaskText: String) {
        val item = todoList[position]
        item.task = newTaskText // Update the task text
        // Update the task in the database
        db.updateTask(item.id, newTaskText)
    }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val task: CheckBox = view.findViewById(R.id.todoCheckBox)

        fun bind(item: ToDoModel) {
            task.text = item.task
            task.isChecked = item.status == 1
            task.setOnCheckedChangeListener { _, isChecked ->
                if (isChecked) {
                    db.updateStatus(item.id, 1)
                } else {
                    db.updateStatus(item.id, 0)
                }
            }
        }
    }
}
