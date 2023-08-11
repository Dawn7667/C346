package sg.edu.rp.c346.id21023644.arraylist;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

/*
public class MainActivity extends AppCompatActivity {

    TextView tv;
    String[] fruits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.fruitTextview);

        String fruitsList = "Fruits\n======\n";

        fruits = new String[3];
        fruits[0] = "apple";
        fruits[1] = "banana";
        fruits[2] = "cherry";

        for (int i = 0; i < fruits.length; i++) {
            fruitsList += fruits[i] + "\n";
        }

        tv.setText(fruitsList);
    }

}*/

public class MainActivity extends AppCompatActivity {

    TextView tv;
    ArrayList<String> fruits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.fruitTextview);

        String fruitsList = "Fruits\n======\n";

        fruits = new ArrayList<String>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");

        for (int i = 0; i < fruits.size(); i++) {
            fruitsList += fruits.get(i) + "\n";
        }

        fruits.add(3, "durian");

        String theFruit = fruits.get(1);

        fruits.remove(0);

        fruits.set(fruits.size() - 1, "dragon fruit");

        tv.setText(fruitsList);
    }

}