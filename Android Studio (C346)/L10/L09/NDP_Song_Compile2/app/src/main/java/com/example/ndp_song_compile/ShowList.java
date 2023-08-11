package com.example.ndp_song_compile;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ShowList extends AppCompatActivity {
    Button btn5Stars;
    ListView lv;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_list);

        lv = findViewById(R.id.lv);
        btn5Stars = findViewById(R.id.btnShow5Stars);
    }
}
