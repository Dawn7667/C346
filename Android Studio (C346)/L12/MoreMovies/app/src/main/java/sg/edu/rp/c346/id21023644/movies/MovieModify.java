package sg.edu.rp.c346.id21023644.movies;

import android.content.DialogInterface;
import android.content.Intent;
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
import androidx.appcompat.app.AlertDialog;
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

        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder myBuilder = new AlertDialog.Builder(MovieModify.this);

                myBuilder.setTitle("Warning");
                myBuilder.setMessage("Are you sure you want to delete the selected movie?");
                myBuilder.setCancelable(false);

                //Configure the 'positive' button
                myBuilder.setPositiveButton("Delete", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        alMovies.clear();
                        aaMovies.notifyDataSetChanged();
                        Toast.makeText(MovieModify.this, "Movie Deleted", Toast.LENGTH_SHORT).show();
                    }
                });

                //Configure the 'neutral' button
                myBuilder.setNeutralButton("Cancel", null);
                AlertDialog myDialog = myBuilder.create();
                myDialog.show();
            }
        });

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder myBuilder = new AlertDialog.Builder(MovieModify.this);

                myBuilder.setTitle("Warning");
                myBuilder.setMessage("Are you sure you want to discard your changes?");
                myBuilder.setCancelable(false);

                //Configure the 'positive' button
                myBuilder.setPositiveButton("Discard", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        Intent intent = new Intent(MovieModify.this, MovieList.class);
                        startActivity(intent);
                        Toast.makeText(MovieModify.this, "Changes discarded", Toast.LENGTH_SHORT).show();
                    }
                });

                //Configure the 'neutral' button
                myBuilder.setNeutralButton("Do not discard", null);
                AlertDialog myDialog = myBuilder.create();
                myDialog.show();
            }
        });
    }
}
