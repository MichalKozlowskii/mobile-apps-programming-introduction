package com.example.recyclerviewbasics;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.recyclerviewbasics.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private final ArrayList<String> wordList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        for (int i = 0; i < 30; i++)
            wordList.add("Word" + i);

        binding.recyclerView.setAdapter(new WordListAdapter(
                wordList,
                position -> Toast.makeText(this, "Clicked " + position, Toast.LENGTH_SHORT).show())
        );
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}