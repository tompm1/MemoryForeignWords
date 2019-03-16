package com.bignerdranch.android.memoryforeignwords;


import android.support.v4.app.Fragment;

public class WordActivity extends SingleFragmentActivity {

    protected Fragment createFragment() {
        return new WordFragment();
    }

}
