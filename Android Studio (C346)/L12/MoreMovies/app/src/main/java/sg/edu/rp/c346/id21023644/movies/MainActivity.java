package sg.edu.rp.c346.id21023644.movies;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText etTitle, etGenre, etYear;
    Spinner spnRating;
    Button btnInsert, btnShowList;
    ArrayList<String> alMovies;
    ArrayAdapter<String> aaMovies;
    ListView lvMovies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.insert_movie);

        etTitle = findViewById(R.id.editTextTitle);
        etGenre = findViewById(R.id.editTextGenre);
        etYear = findViewById(R.id.editTextYear);
        btnInsert = findViewById(R.id.buttonInsert);
        btnShowList = findViewById(R.id.buttonShowList);
        spnRating = findViewById(R.id.spinnerRating);

        btnInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String title = etTitle.getText().toString();
                String genre = etGenre.getText().toString();
                String year = etYear.getText().toString();
                String rating = spnRating.getSelectedItem().toString();
                String listing = title + "/n" + genre + "/n" + year + rating;
                alMovies.add(listing);
                aaMovies.notifyDataSetChanged();
                Toast.makeText(MainActivity.this, "Movie Added", Toast.LENGTH_SHORT).show();
            }
        });

//        btnClear.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                alToDo.clear();
//                aaToDo.notifyDataSetChanged();
//                Toast.makeText(MainActivity.this, "To Do List Cleared", Toast.LENGTH_LONG).show();
//            }
//        });

        alMovies = new ArrayList<>();
        aaMovies = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, alMovies);
        lvMovies.setAdapter(aaMovies);

    }
}