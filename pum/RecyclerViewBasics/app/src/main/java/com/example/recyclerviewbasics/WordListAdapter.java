package com.example.recyclerviewbasics;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewbasics.databinding.WordListItemBinding;

import java.util.ArrayList;

public class WordListAdapter extends RecyclerView.Adapter<WordListViewHolder> {
    private final ArrayList<String> wordList;
    private final OnItemClickListener onItemClickListener;

    public WordListAdapter(ArrayList<String> wordList, OnItemClickListener onItemClickListener) {
        this.wordList = wordList;
        this.onItemClickListener = onItemClickListener;
    }

    @NonNull
    @Override
    public WordListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new WordListViewHolder(
                WordListItemBinding.inflate(
                        LayoutInflater.from(parent.getContext()),
                        parent,
                        false),
                onItemClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull WordListViewHolder holder, int position) {
        String currentItem = wordList.get(position);
        holder.bind(currentItem);
    }

    @Override
    public int getItemCount() {
        return wordList.size();
    }
}
