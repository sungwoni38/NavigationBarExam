package com.example.navigationbarexam.ui.search;

import android.widget.SearchView;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SearchViewModel extends ViewModel {
    
    private final MutableLiveData<String> mText;
    
    public SearchViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("검색 화면 프래그먼트");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
