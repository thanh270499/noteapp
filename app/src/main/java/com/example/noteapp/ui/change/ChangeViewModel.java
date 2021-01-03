package com.example.noteapp.ui.change;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ChangeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ChangeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is change fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}