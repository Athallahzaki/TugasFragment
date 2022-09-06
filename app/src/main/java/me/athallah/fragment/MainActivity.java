package me.athallah.fragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn_frag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_frag = (Button) findViewById(R.id.btn_frag);
        btn_frag.setOnClickListener(view -> {
            getSupportFragmentManager().beginTransaction().add(R.id.frame_lay, new FirstFragment()).commit();
        });
    }
}