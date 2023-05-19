package sg.edu.rp.c346.id21023644.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {

    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        tvAnswer = findViewById(R.id.textView);
        Intent intentReceived = getIntent();
        double thedouble = intentReceived.getDoubleExtra("double", 99.99);
        tvAnswer.setText("Double value received is: " + thedouble);

    }

}