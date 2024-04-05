package com.example.myapplication

import android.content.DialogInterface
import android.graphics.Color
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.fragment.app.DialogFragment

class AddNewTask : DialogFragment() {

    companion object {
        const val TAG = "ActionBottomDialog"
        fun newInstance(): AddNewTask {
            return AddNewTask()
        }
    }

    // Declare the newTaskAddedListener once here
    var newTaskAddedListener: NewTaskAddedListener? = null

    private lateinit var newTaskText: EditText
    private lateinit var newTaskSaveButton: Button
    private lateinit var db: NoteDatabaseHandler

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.new_task, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        newTaskText = view.findViewById(R.id.newTaskText)
        newTaskSaveButton = view.findViewById(R.id.newTaskButton)

        var isUpdate = false
        val bundle = arguments
        if (bundle != null) {
            isUpdate = true
            val task = bundle.getString("task")
            newTaskText.setText(task)
            if (!task.isNullOrBlank()) {
                newTaskSaveButton.setTextColor(
                    ContextCompat.getColor(requireContext(), R.color.colorPrimaryDark)
                )
            }
        }

        db = NoteDatabaseHandler(requireActivity())
        db.openDatabase()

        newTaskText.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if (s.isNullOrBlank()) {
                    newTaskSaveButton.isEnabled = false
                    newTaskSaveButton.setTextColor(Color.GRAY)
                } else {
                    newTaskSaveButton.isEnabled = true
                    newTaskSaveButton.setTextColor(
                        ContextCompat.getColor(requireContext(), R.color.colorPrimaryDark)
                    )
                }
            }

            override fun afterTextChanged(s: Editable?) {}
        })

        val finalIsUpdate = isUpdate
        newTaskSaveButton.setOnClickListener {
            val text = newTaskText.text.toString()
            if (text.isNotBlank()) {
                if (finalIsUpdate) {
                    bundle?.getInt("id")?.let { id ->
                        db.updateTask(id, text)
                    }
                } else {
                    val task = ToDoModel()
                    task.task = text
                    task.status = 0
                    db.insertTask(task)
                }

                // Notify the listener that a new task has been added
                newTaskAddedListener?.onNewTaskAdded()

                // Dismiss the dialog after saving
                dismiss()
            } else {
                // Display an error message or perform some action to inform the user
                // that the task cannot be empty, e.g., show a toast message
                Toast.makeText(requireContext(), "Task cannot be empty", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onDismiss(dialog: DialogInterface) {
        super.onDismiss(dialog)
    }
}
interface NewTaskAddedListener {
    fun onNewTaskAdded()
}
