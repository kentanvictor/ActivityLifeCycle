package com.example.dell.activitylifecycle;

/*
 * Created by kentanvictor on 2017/7/5.
 */
public class TureFalse {
    private int mQuestion;
    // this variable will hold a resource ID for a string

    private boolean mTrueQuestion;

    public TureFalse(int question, boolean trueQuestion) {
        mQuestion = question;
        mTrueQuestion = trueQuestion;
    }

    public int getQuestion() {
        return mQuestion;
    }

    public void setQuestion(int question) {
        mQuestion = question;
    }

    public boolean isTrueQuestion() {
        return mTrueQuestion;
    }

    public void setTrueQuestion(boolean trueQuestion) {
        mTrueQuestion = trueQuestion;
    }

}
