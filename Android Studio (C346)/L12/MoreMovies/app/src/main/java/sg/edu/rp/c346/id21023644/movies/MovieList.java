package sg.edu.rp.c346.id21023644.movies;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MovieList extends AppCompatActivity {

    Button btnPG13;
    ListView lvMovies;
    ArrayList<MovieListing> alMovies;
    CustomAdapter caMovies;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_movies);

        btnPG13 = findViewById(R.id.buttonShowPG13);
        lvMovies = findViewById(R.id.movieList);

        alMovies = new ArrayList<>();

        caMovies = new CustomAdapter(this, R.layout.movie_list_row, alMovies);
        lvMovies.setAdapter(caMovies);

        btnPG13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                if (listing.getRating() == "PG13"){
//                    alMovies = new ArrayList<>();
//
//                    caMovies = new CustomAdapter(this, R.layout.movie_list_row, alMovies);
//                    lvMovies.setAdapter(caMovies);
//                }
            }
        });
    }
}
