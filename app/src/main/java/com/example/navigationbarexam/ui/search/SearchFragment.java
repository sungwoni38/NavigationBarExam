package com.example.navigationbarexam.ui.search;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.navigationbarexam.R;
import com.example.navigationbarexam.databinding.FragmentSearchBinding;

import java.util.ArrayList;

public class SearchFragment extends Fragment {

    private FragmentSearchBinding binding;
    private View view;
    private ImageView img_italy;
    private LinearLayout layout_kor;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        view = inflater.inflate(R.layout.fragment_home, container,false);
        img_italy = view.findViewById(R.id.img_italy);
        img_italy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout_kor = (LinearLayout) view.findViewById(R.id.layout_kor);
                layout_kor.setVisibility(View.INVISIBLE);
            }
        });



        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
