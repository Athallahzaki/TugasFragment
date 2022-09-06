package me.athallah.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class FirstFragment extends Fragment {
    Button btn_show;
    public FirstFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        btn_show = (Button) view.findViewById(R.id.btn_show);
        btn_show.setOnClickListener(view1 -> Toast.makeText(getContext(), "HASIL BUTTON KLIK", Toast.LENGTH_LONG).show());
        return view;
    }
}