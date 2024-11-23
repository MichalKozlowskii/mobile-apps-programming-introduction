package com.example.lista4;

import com.example.lista4.model.QuizQuestion;

import java.util.ArrayList;
import java.util.List;

public class CoreFunctions {
    public List<QuizQuestion> populateQuestionsList() {
        List<QuizQuestion> questionList = new ArrayList<>();

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


}
