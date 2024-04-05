package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.Drawable
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.RecyclerView

class RecyclerItemTouchHelper(private val adapter: ToDoAdapter) :
    ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.LEFT or ItemTouchHelper.RIGHT) {

    override fun onMove(
        recyclerView: RecyclerView,
        viewHolder: RecyclerView.ViewHolder,
        target: RecyclerView.ViewHolder
    ): Boolean {
        return false
    }

    @SuppressLint("NotifyDataSetChanged")
    override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
        val position = viewHolder.adapterPosition
        if (direction == ItemTouchHelper.LEFT) {
            val builder = AlertDialog.Builder(adapter.context)
            builder.setTitle("Delete Task")
            builder.setMessage("Are you sure you want to delete this Task?")
            builder.setPositiveButton("Confirm") { _, _ ->
                adapter.deleteItem(position)
                adapter.notifyItemRemoved(position)
            }
            builder.setNegativeButton(android.R.string.cancel) { dialog, _ ->
                adapter.notifyItemChanged(viewHolder.adapterPosition)
                dialog.dismiss()
            }
            val dialog = builder.create()
            dialog.show()
        } else {
            adapter.notifyDataSetChanged()
            adapter.notifyItemChanged(position)
        }
    }

    override fun onChildDraw(
        c: Canvas,
        recyclerView: RecyclerView,
        viewHolder: RecyclerView.ViewHolder,
        dX: Float,
        dY: Float,
        actionState: Int,
        isCurrentlyActive: Boolean
    ) {
        super.onChildDraw(c, recyclerView, viewHolder, dX, dY, actionState, isCurrentlyActive)

        val icon: Drawable? = if (dX > 0) {
            ContextCompat.getDrawable(adapter.context, R.drawable.ic_baseline_edit)
        } else {
            ContextCompat.getDrawable(adapter.context, R.drawable.ic_baseline_delete)
        }

        val background: ColorDrawable = if (dX > 0) {
            ColorDrawable(ContextCompat.getColor(adapter.context, R.color.colorPrimaryDark))
        } else {
            ColorDrawable(Color.RED)
        }

        val itemView = viewHolder.itemView
        val backgroundCornerOffset = 20

        val iconMargin = ((itemView.height - icon?.intrinsicHeight!!) ?: 0) / 2
        val iconTop = itemView.top + ((itemView.height - icon.intrinsicHeight) ?: 0) / 2
        val iconBottom = iconTop + (icon.intrinsicHeight ?: 0)

        if (dX > 0) {
            val iconLeft = itemView.left + iconMargin
            val iconRight = itemView.left + iconMargin + (icon.intrinsicWidth ?: 0)
            icon?.setBounds(iconLeft, iconTop, iconRight, iconBottom)

            background.setBounds(
                itemView.left,
                itemView.top,
                itemView.left + dX.toInt() + backgroundCornerOffset,
                itemView.bottom
            )
        } else if (dX < 0) {
            val iconLeft = itemView.right - iconMargin - (icon.intrinsicWidth ?: 0)
            val iconRight = itemView.right - iconMargin
            icon.setBounds(iconLeft, iconTop, iconRight, iconBottom)

            background.setBounds(
                itemView.right + dX.toInt() - backgroundCornerOffset,
                itemView.top,
                itemView.right,
                itemView.bottom
            )
        } else {
            background.setBounds(0, 0, 0, 0)
        }

        background.draw(c)
        icon.draw(c)
    }
}