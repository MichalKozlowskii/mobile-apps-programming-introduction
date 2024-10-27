package com.example.m1l1;

import android.os.Bundle;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.m1l1.databinding.ActivityEndBinding;
import com.example.m1l1.databinding.ActivityMainBinding;
import com.example.m1l1.model.QuizQuestion;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private ActivityEndBinding endBinding;

    private List<QuizQuestion> questionList;
    private List<RadioButton> answers;
    private Integer count;
    private Integer points;

    private final Integer TOTAL_QUESTIONS = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        if (savedInstanceState != null) {
            questionList = savedInstanceState.getParcelableArrayList("questionList");
            count = savedInstanceState.getInt("count");
            points = savedInstanceState.getInt("points");
        } else {
            questionList = populateQuestionsList();
            count = 0;
            points = 0;
        }

        answers = List.of(
                binding.answer0,
                binding.answer1,
                binding.answer2,
                binding.answer3
        );

        displayQuestion();

        binding.nextQuestionButton.setOnClickListener(view -> {
            handleNextQuestion();
        });
    }

    @Override
    protected void onSaveInstanceState(@NotNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putParcelableArrayList("questionList", new ArrayList<>(questionList));
        outState.putInt("count", count);
        outState.putInt("points", points);
    }

    protected List<QuizQuestion> populateQuestionsList() {
        questionList = new ArrayList<>();

        questionList.add(new QuizQuestion("W jakim roku Mariusz Pudzianowski zdobył tytuł „Najsilniejszego Człowieka Świata” po raz pierwszy?",
                List.of("1999", "2001", "2002", "2004"),
                2));
        questionList.add(new QuizQuestion("Jaką dyscyplinę sportową Mariusz Pudzianowski uprawiał przed rozpoczęciem kariery strongmana?",
                List.of("Judo", "Boks", "Karate", "Zapasy"),
                1));
        questionList.add(new QuizQuestion("Ile razy Mariusz Pudzianowski zdobył tytuł „Najsilniejszego Człowieka Świata”?",
                List.of("3", "4", "5", "6"),
                2));
        questionList.add(new QuizQuestion("W którym roku Mariusz Pudzianowski zadebiutował w MMA?",
                List.of("2007", "2009", "2011", "2013"),
                1));
        questionList.add(new QuizQuestion("Czy Pudzian Lubi Piwo",
                List.of("nie", "średnio", "chyba", "tak"),
                3));
        questionList.add(new QuizQuestion("W jakiej kategorii wagowej walczy Mariusz Pudzianowski w MMA?",
                List.of("Lekka", "Średnia", "Półciężka", "Ciężka"),
                3));
        questionList.add(new QuizQuestion("Który z tych strongmanów był jednym z głównych rywali Mariusza Pudzianowskiego?",
                List.of("Hafthor Bjornsson", "Brian Shaw", "Jouko Ahola", "Zydrunas Savickas"),
                3));
        questionList.add(new QuizQuestion("Ile lat miał Mariusz Pudzianowski, gdy zdobył pierwszy tytuł Najsilniejszego Człowieka Świata?",
                List.of("22", "25", "26", "27"),
                2));
        questionList.add(new QuizQuestion("W którym polskim mieście urodził się Mariusz Pudzianowski?",
                List.of("Warszawa", "Wrocław", "Łódź", "Biała Rawska"),
                3));
        questionList.add(new QuizQuestion("Jaki kolor pasa ma Mariusz Pudzianowski w karate kyokushin?",
                List.of("Żółty", "Zielony", "Niebieski", "Czarny"),
                1));

        return questionList;
    }

    protected void displayQuestion() {
        int counter = 0;
        for (String answer : questionList.get(count).getAnswers()) {
            answers.get(counter).setText(answer);

            counter++;
        }

        binding.progressTextView.setText(String.format(Locale.getDefault(), "Pytanie %d z %d", count + 1, TOTAL_QUESTIONS));
        binding.questionTextView.setText(questionList.get(count).getQuestion());

        int progress = (int) ((count + 1) / (float) TOTAL_QUESTIONS * 100);
        binding.progressBar.setProgress(progress);

        binding.radioGroup.clearCheck();
    }

    protected void displayEndScreen() {
        endBinding = ActivityEndBinding.inflate(getLayoutInflater());
        setContentView(endBinding.getRoot());

        endBinding.pointsTextView.setText(String.format(Locale.getDefault(),"Zdobyłeś %d punktów", points));
    }

    protected void handleNextQuestion() {
        int checkedId = binding.radioGroup.getCheckedRadioButtonId();

        if (checkedId != -1) {
            int counter = 0;
            for (RadioButton answer : answers) {
                if (answer.getId() == checkedId && questionList.get(count).getRightAnswerIndex() == counter) {
                    points += 10;
                }
                counter++;
            }
        }

        count++;

        if (count < 10) {
            displayQuestion();
        } else {
            displayEndScreen();
        }
    }
}