package com.example.navigationbarexam.ui.like;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.navigationbarexam.R;
import com.example.navigationbarexam.databinding.FragmentLikeBinding;

import java.util.ArrayList;
import java.util.List;


public class LikeFragment extends Fragment {

    private FragmentLikeBinding binding;
    private View view;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_like, container, false);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view_like);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        List<LikeCardItem> dataList = new ArrayList<>();
        dataList.add(new LikeCardItem("본죽 망우우림시장점","02-2207-6288","서울특별시 중랑구 망우동 403-69"));

        LikeRecyclerAdapter adapter = new LikeRecyclerAdapter(dataList);
        recyclerView.setAdapter(adapter);

        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
