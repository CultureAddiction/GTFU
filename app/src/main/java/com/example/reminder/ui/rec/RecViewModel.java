package com.example.reminder.ui.rec;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class RecViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public RecViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is rec fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}