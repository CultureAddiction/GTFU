package com.example.reminder.ui.statistics;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class StatisticsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public StatisticsViewModel() {

    }

    public LiveData<String> getText() {
        return mText;
    }
}