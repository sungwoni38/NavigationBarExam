package com.example.navigationbarexam.ui.like;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LikeViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public LikeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("즐겨찾기 화면입니다.");
    }
    public LiveData<String> getText() {
        return mText;
    }
}
