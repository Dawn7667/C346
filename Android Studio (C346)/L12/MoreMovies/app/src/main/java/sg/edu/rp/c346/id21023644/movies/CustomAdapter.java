package sg.edu.rp.c346.id21023644.movies;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<MovieListing> movieList;

    public CustomAdapter(Context context, int resource, ArrayList<MovieListing> objects){
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        movieList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) parent_context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View movieView = inflater.inflate(layout_id, parent, false);

        TextView tvTitle = movieView.findViewById(R.id.textViewTitle);
        TextView tvGenre = movieView.findViewById(R.id.textViewGenre);
        TextView tvYear = movieView.findViewById(R.id.textViewYear);
        ImageView ivRate = movieView.findViewById(R.id.imageViewRating);

        MovieListing currentItem = movieList.get(position);
        tvTitle.setText(currentItem.getTitle());
        tvGenre.setText("+" + currentItem.getGenre());
        tvYear.setText(currentItem.getYear());
        if (currentItem.getRating() == "G") {
            ivRate.setImageResource(R.drawable.rating_g);
        }
        else if(currentItem.getRating() == "PG") {
            ivRate.setImageResource(R.drawable.rating_pg);
        }
        else if(currentItem.getRating() == "PG13") {
            ivRate.setImageResource(R.drawable.rating_pg13);
        }
        else if(currentItem.getRating() == "NC16") {
            ivRate.setImageResource(R.drawable.rating_nc16);
        }
        else if(currentItem.getRating() == "M18") {
            ivRate.setImageResource(R.drawable.rating_m18);
        }
        else if(currentItem.getRating() == "R21") {
            ivRate.setImageResource(R.drawable.rating_r21);
        }
        else {
            ivRate.setImageResource(R.drawable.ic_launcher_background);
        }

        return movieView;
    }
}

