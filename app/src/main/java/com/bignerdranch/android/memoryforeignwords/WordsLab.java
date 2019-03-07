package com.bignerdranch.android.memoryforeignwords;

import android.content.Context;

public class WordsLab {

    private static WordsLab sWordsLab;

    private WordsLab (Context context){

    }

    public static WordsLab get (Context context){
        if(sWordsLab == null){
            sWordsLab = new WordsLab(context);
        }
        return sWordsLab;
    }

}
