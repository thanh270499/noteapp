package com.example.noteapp.ui.edit;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class EditViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public EditViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Edit Profile");
    }

    public LiveData<String> getText() {
        return mText;
    }
}