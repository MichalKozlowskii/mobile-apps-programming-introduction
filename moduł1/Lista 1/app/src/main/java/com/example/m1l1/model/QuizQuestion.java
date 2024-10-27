package com.example.m1l1.model;

import android.os.Parcel;
import android.os.Parcelable;

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
}
