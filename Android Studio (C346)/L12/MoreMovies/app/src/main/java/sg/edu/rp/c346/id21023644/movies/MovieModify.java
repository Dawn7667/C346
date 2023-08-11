package sg.edu.rp.c346.id21023644.movies;

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

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MovieModify extends AppCompatActivity {

    EditText etTitle, etGenre, etYear;
    Spinner spnRating;
    Button btnUpdate, btnDelete, btnCancel;
    ArrayList<String> alMovies;
    ArrayAdapter<String> aaMovies;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modify_movie);

        etTitle = findViewById(R.id.editTextTitle);
        etGenre = findViewById(R.id.editTextGenre);
        etYear = findViewById(R.id.editTextYear);
        btnUpdate = findViewById(R.id.buttonUpdate);
        btnDelete = findViewById(R.id.buttonDelete);
        btnCancel = findViewById(R.id.buttonCancel);
        spnRating = findViewById(R.id.spinnerRating);

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alMovies.clear();
                aaMovies.notifyDataSetChanged();
                Toast.makeText(MovieModify.this, "Movie Deleted", Toast.LENGTH_LONG).show();
            }
        });
    }
}
