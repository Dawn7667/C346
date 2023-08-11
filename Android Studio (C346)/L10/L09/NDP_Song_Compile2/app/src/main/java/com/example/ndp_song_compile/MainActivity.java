package com.example.ndp_song_compile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button btnInsert, btnShowList;

    RadioGroup rgStars;
    EditText etSTitle, etSger, etYe;
    ArrayList<Song> al_NDP_Songs;
    ArrayAdapter<Song> aa_NDP_Songs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnInsert = findViewById(R.id.buttonInsert);
        btnShowList = findViewById(R.id.buttonShowList);
        etSTitle = findViewById(R.id.etSongTitle);
        etSger = findViewById(R.id.etSinger);
        etYe = findViewById(R.id.etYear);
        rgStars = findViewById(R.id.radioGroupStars);

        al_NDP_Songs = new ArrayList<Song>();
        aa_NDP_Songs = new ArrayAdapter<Song>(this,
                android.R.layout.simple_list_item_1, al_NDP_Songs);

        btnInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = etSTitle.getText().toString()
                + etSger.getText().toString()
                + Integer.parseInt(etYe.getText().toString());
                DBHelper dbh = new DBHelper(MainActivity.this);
                long inserted_id = dbh.insertSong(data);

                if (inserted_id != -1){
                    al_NDP_Songs.clear();
                    al_NDP_Songs.addAll(dbh.getAllSongs());
                    aa_NDP_Songs.notifyDataSetChanged();
                    Toast.makeText(MainActivity.this, "Insert successful",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnRetrieve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DBHelper dbh = new DBHelper(MainActivity.this);
                al.clear();
                //al.addAll(dbh.getAllNotes());
                String filterText = etContent.getText().toString().trim();
                if(filterText.length() == 0) {
                    al.addAll(dbh.getAllNotes());
                }
                else{
                    al.addAll(dbh.getAllNotes(filterText));
                }
                aa.notifyDataSetChanged();
            }
        });

        btnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Note target = al.get(0);

                Intent i = new Intent(MainActivity.this,
                        EditActivity.class);
                i.putExtra("data", target);
                startActivity(i);
            }
        });


    }

    @Override
    protected void onResume() {
        super.onResume();

        btnRetrieve.performClick();
    }

}