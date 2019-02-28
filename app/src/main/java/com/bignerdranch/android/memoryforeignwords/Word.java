package com.bignerdranch.android.memoryforeignwords;

import java.util.UUID;

public class Word {

    private UUID mId;
    private String mOriginalWord;
    private String mTranslatedWord;
    private int mScore;

    public Word() {
        this.mId = UUID.randomUUID();
    }

    public UUID getmId() {
        return mId;
    }

    public void setmId(UUID mId) {
        this.mId = mId;
    }

    public String getmOriginalWord() {
        return mOriginalWord;
    }

    public void setmOriginalWord(String mOriginalWord) {
        this.mOriginalWord = mOriginalWord;
    }

    public String getmTranslatedWord() {
        return mTranslatedWord;
    }

    public void setmTranslatedWord(String mTranslatedWord) {
        this.mTranslatedWord = mTranslatedWord;
    }

    public int getmScore() {
        return mScore;
    }

    public void setmScore(int mScore) {
        this.mScore = mScore;
    }
}
