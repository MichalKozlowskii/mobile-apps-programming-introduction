package com.example.recyclerviewbasics;

import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewbasics.databinding.WordListItemBinding;

public class WordListViewHolder extends RecyclerView.ViewHolder {
    private final WordListItemBinding binding;

    public WordListViewHolder(WordListItemBinding binding, OnItemClickListener onItemClickListener) {
        super(binding.getRoot());
        this.binding = binding;

        binding.getRoot().setOnClickListener(v ->
                onItemClickListener.onItemClick(getAdapterPosition()));
    }

    public void bind(String item){
        binding.singleWord.setText(item);
    }
}