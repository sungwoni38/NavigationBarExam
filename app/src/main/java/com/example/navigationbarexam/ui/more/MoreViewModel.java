package com.example.navigationbarexam.ui.more;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;


public class MoreViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public MoreViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("더보기 화면 프래그먼트");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
