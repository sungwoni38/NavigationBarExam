package com.example.navigationbarexam.ui.like;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.navigationbarexam.databinding.FragmentLikeBinding;

public class LikeFragment extends Fragment {

    private FragmentLikeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        LikeViewModel likeViewModel =
                new ViewModelProvider(this).get(LikeViewModel.class);

        binding = FragmentLikeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textLike;
        likeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
