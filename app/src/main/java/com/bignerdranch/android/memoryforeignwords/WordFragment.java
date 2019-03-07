package com.bignerdranch.android.memoryforeignwords;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class WordFragment extends Fragment {

    private Word mWord;
    private EditText mOriginalWord;
    private EditText mTranslatedWord;
    private Button mSaveWords;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mWord = new Word();

    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_word, container, false);

        mOriginalWord = (EditText) view.findViewById(R.id.original_word);
        mTranslatedWord = (EditText) view.findViewById(R.id.translated_word);
        mSaveWords = (Button) view.findViewById(R.id.save_words);


        return view;
    }


}
