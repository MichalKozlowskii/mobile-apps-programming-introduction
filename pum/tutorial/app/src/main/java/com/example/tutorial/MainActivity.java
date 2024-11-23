package com.example.tutorial;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.example.tutorial.databinding.ActivityMainBinding;

import org.jetbrains.annotations.NotNull;

public class MainActivity extends AppCompatActivity {
    //private TextView showCount;
    //private Button increaseButton;
    private int count;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //showCount = findViewById(R.id.show_count);
        //increaseButton = findViewById(R.id.increase_button);

        if (savedInstanceState != null) {
            count = savedInstanceState.getInt("counter_state");
        }

        binding.showCount.setText(String.valueOf(count));

        binding.increaseButton.setOnClickListener(view -> {
            count++;
            binding.showCount.setText(String.valueOf(count));
        });
    }

    @Override
    protected void onSaveInstanceState(@NotNull Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putInt("counter_state", count);
    }
}