package com.example.subbu.expandablerecyclerview;

import android.arch.lifecycle.ViewModel;

/**
 * Created by saravanan on 15-Aug-17.
 */

public class ScoreViewModel extends ViewModel {
    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
