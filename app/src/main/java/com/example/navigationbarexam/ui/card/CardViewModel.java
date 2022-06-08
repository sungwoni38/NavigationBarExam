package com.example.navigationbarexam.ui.card;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CardViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public CardViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("카드조회 화면 프래그먼트");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
