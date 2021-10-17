package com.example.reminder.ui.rec;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.reminder.databinding.FragmentRecBinding;
import com.example.reminder.databinding.FragmentRecBinding;

public class RecFragment extends Fragment {

    private RecViewModel RecViewModel;
    private FragmentRecBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        RecViewModel =
                new ViewModelProvider(this).get(RecViewModel.class);

        binding = FragmentRecBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}