package com.bignerdranch.android.memoryforeignwords;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class WordsLab {

    private static WordsLab sWordsLab;
    private List<Word> sWords;

    private WordsLab(Context context) {
        sWords = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Word word = new Word();
            word.setmOriginalWord("OriginalWord #" + 1);
            word.setmTranslatedWord("TranslatedWord #" + 1);
            sWords.add(word);
        }

    }

    public static WordsLab get(Context context) {
        if (sWordsLab == null) {
            sWordsLab = new WordsLab(context);
        }
        return sWordsLab;
    }

    public Word getWord(UUID id) {
        for (Word word : sWords) {
            if (word.getmId().equals(id)) {
                return word;
            }
        }
        return null;
    }
}