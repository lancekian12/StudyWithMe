package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.databinding.FragmentNoteBottomBinding // Import the correct binding class

class NoteBottom : Fragment() {
    private lateinit var binding: FragmentNoteBottomBinding // Use the correct binding class
    private lateinit var db: NoteDatabaseHelper
    private lateinit var notesAdapter: NotesAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentNoteBottomBinding.inflate(inflater, container, false) // Inflate the correct binding object
        val view = binding.root // Get the root view from the binding object

        db = NoteDatabaseHelper(requireContext()) // Use requireContext() to get the context
        notesAdapter = NotesAdapter(db.getAllNotes(), requireContext()) // Use requireContext() for the context

        binding.rvTodoList.layoutManager = LinearLayoutManager(requireContext()) // Use requireContext() for the context
        binding.rvTodoList.adapter = notesAdapter

        binding.btnNoteAdd.setOnClickListener{
            Log.i("test", "Creating new note!")
            val intent = Intent(requireContext(), NoteAdd::class.java) // Use requireContext() for the context
            startActivity(intent)
        }

        return view
    }

    override fun onResume() {
        super.onResume()
        notesAdapter.refreshData(db.getAllNotes())
    }
}
