package com.example.lista4.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

public class QuizQuestion implements Parcelable {
    private String question;
    private List<String> answers;
    private Integer rightAnswerIndex;

    public QuizQuestion(String question, List<String> answers, Integer rightAnswerIndex) {
        this.question = question;
        this.answers = answers;
        this.rightAnswerIndex = rightAnswerIndex;
    }

    public QuizQuestion() {
    }

    protected QuizQuestion(Parcel in) {
        setQuestion(in.readString());
        setAnswers(in.createStringArrayList());
        setRightAnswerIndex(in.readInt());
    }

    public static final Creator<QuizQuestion> CREATOR = new Creator<QuizQuestion>() {
        @Override
        public QuizQuestion createFromParcel(Parcel in) {
            return new QuizQuestion(in);
        }

        @Override
        public QuizQuestion[] newArray(int size) {
            return new QuizQuestion[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(getQuestion());
        dest.writeStringList(getAnswers());
        dest.writeInt(getRightAnswerIndex());
    }


    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<String> getAnswers() {
        return answers;
    }

    public void setAnswers(List<String> answers) {
        this.answers = answers;
    }

    public Integer getRightAnswerIndex() {
        return rightAnswerIndex;
    }

    public void setRightAnswerIndex(Integer rightAnswerIndex) {
        this.rightAnswerIndex = rightAnswerIndex;
    }

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

