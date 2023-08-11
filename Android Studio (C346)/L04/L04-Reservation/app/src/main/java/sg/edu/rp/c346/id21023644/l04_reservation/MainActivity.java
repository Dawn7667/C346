package sg.edu.rp.c346.id21023644.l04_reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etName, etNo, etGroup;
    RadioGroup rgSmoking;
    DatePicker dp;
    TimePicker tp;
    Button btnConfirm, btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.editTextName);
        etNo = findViewById(R.id.editTextPhoneNumber);
        etGroup = findViewById(R.id.editTextGroupSize);
        rgSmoking = findViewById(R.id.radioGroupSmokingArea);
        dp = findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);
        btnConfirm = findViewById(R.id.buttonConfirm);
        btnCancel = findViewById(R.id.buttonCancel);

        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = etName.getText().toString();
                String no = etNo.getText().toString();
                String gSize = etGroup.getText().toString();
                String time = tp.getCurrentHour() + ":" + tp.getCurrentMinute();
                String date = dp.getDayOfMonth() + "/" + dp.getMonth() + "/" + dp.getYear();
                String smoke = "";
                int checkedRadioId = rgSmoking.getCheckedRadioButtonId();
                if(checkedRadioId == R.id.radioButtonSmoking){
                    smoke = "Smoking Area";
                }
                else{
                    smoke = "Non-Smoking Area";
                }
                String stringResponse = name + ", " + no + " has booked a table for " + gSize + " in a " + smoke + " at " + time + " " + date;
                Toast.makeText(MainActivity.this, stringResponse, Toast.LENGTH_LONG).show();
            }
        });

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Form Reset", Toast.LENGTH_SHORT).show();
                dp.updateDate(2020, 1, 6);
                tp.setCurrentHour(7);
                tp.setCurrentMinute(30);
                etName.setText(null);
                etNo.setText(null);
                etGroup.setText(null);
                rgSmoking.clearCheck();
            }
        });

    }
}