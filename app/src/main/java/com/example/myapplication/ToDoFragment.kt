package com.example.myapplication

import android.annotation.SuppressLint
import android.content.DialogInterface
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.google.android.material.floatingactionbutton.FloatingActionButton

class ToDoFragment : Fragment(), DialogCloseListener, NewTaskAddedListener {

    private lateinit var db: NoteDatabaseHandler
    private lateinit var tasksRecyclerView: RecyclerView
    private lateinit var tasksAdapter: ToDoAdapter
    private lateinit var fab: FloatingActionButton
    private var taskList: List<ToDoModel> = ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_to_do, container, false)

        db = NoteDatabaseHandler(requireContext())
        db.openDatabase()

        tasksRecyclerView = view.findViewById(R.id.tasksRecyclerView)
        tasksRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        tasksAdapter = ToDoAdapter(db, requireContext())
        tasksRecyclerView.adapter = tasksAdapter

        val itemTouchHelper = ItemTouchHelper(RecyclerItemTouchHelper(tasksAdapter))
        itemTouchHelper.attachToRecyclerView(tasksRecyclerView)

        fab = view.findViewById(R.id.fab)

        taskList = db.allTasks
        taskList = taskList.asReversed()

        tasksAdapter.setTasks(taskList)

        fab.setOnClickListener {
            val fragment = AddNewTask.newInstance()
            fragment.newTaskAddedListener = this // Set the callback listener
            fragment.show(requireFragmentManager(), AddNewTask.TAG)
        }

        return view
    }

    @SuppressLint("NotifyDataSetChanged")
    override fun handleDialogClose(dialog: DialogInterface?) {
        taskList = db.allTasks
        taskList = taskList.asReversed()
        tasksAdapter.setTasks(taskList)
        tasksAdapter.notifyDataSetChanged()
    }

    @SuppressLint("NotifyDataSetChanged")
    override fun onNewTaskAdded() {
        taskList = db.allTasks
        taskList = taskList.asReversed()
        tasksAdapter.setTasks(taskList)
        tasksAdapter.notifyDataSetChanged()
    }

    @SuppressLint("NotifyDataSetChanged")
    override fun onResume() {
        super.onResume()
        tasksAdapter.notifyDataSetChanged()
    }

    @SuppressLint("NotifyDataSetChanged")
    override fun onPause() {
        super.onPause()
        tasksAdapter.notifyDataSetChanged()
    }
}
