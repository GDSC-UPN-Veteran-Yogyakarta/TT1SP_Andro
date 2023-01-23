package com.kylix.simplenotexml

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kylix.simplenotexml.databinding.ItemListBinding

class NoteAdapter: RecyclerView.Adapter<NoteAdapter.NoteViewHolder>() {
    
    private val listNotes = ArrayList<Note>()
    
    fun submitData(notes: List<Note>?) {
        if (notes == null) return
        this.listNotes.clear()
        this.listNotes.addAll(notes)
        notifyDataSetChanged()
    }
    
    class NoteViewHolder(private val binding: ItemListBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(note: Note) {
            binding.apply {
                tvTitle.text = note.title
                tvDescription.text = note.description
            }
        }
    }
    
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder {
        val view = ItemListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return NoteViewHolder(view)
    }
    
    override fun getItemCount(): Int = listNotes.size
    
    override fun onBindViewHolder(holder: NoteViewHolder, position: Int) {
        val note = listNotes[position]
        holder.bind(note)
    }
}