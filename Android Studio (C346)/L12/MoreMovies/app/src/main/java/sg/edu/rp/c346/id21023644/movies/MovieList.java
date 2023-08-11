package sg.edu.rp.c346.id21023644.movies;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MovieList extends AppCompatActivity {

    Button btnPG13;
    ListView lvMovies;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_movies);

        btnPG13 = findViewById(R.id.buttonShowPG13);
        lvMovies = findViewById(R.id.movieList);
    }
}
