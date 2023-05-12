package sg.edu.rp.c346.id21023644.billplease;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    EditText etAmount;
    EditText etPax;
    ToggleButton svsBtn;
    ToggleButton gstBtn;
    EditText etDiscount;
    RadioGroup rgPaymentType;
    Button splitBtn;
    Button resetBtn;
    TextView tvBill;
    TextView tvEachPay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etAmount = findViewById(R.id.editTextAmount);
        etPax = findViewById(R.id.editTextPax);
        svsBtn = findViewById(R.id.buttonSVS);
        gstBtn = findViewById(R.id.buttonGST);
        etDiscount = findViewById(R.id.editTextDiscount);
        rgPaymentType = findViewById(R.id.radioGroupPaymentType);
        splitBtn = findViewById(R.id.buttonSplitBill);
        resetBtn = findViewById(R.id.buttonReset);
        tvBill = findViewById(R.id.textViewTotalBill);
        tvEachPay = findViewById(R.id.textViewEachPay);

        splitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double totalBill = 0;
                double svs = 0;
                double gst = 0;

                double amount = Double.parseDouble(etAmount.getText().toString());
                int pax = Integer.parseInt(etPax.getText().toString());


                if (svsBtn.isChecked()) {
                    svs = amount * (1 / 10);
                }

                if (gstBtn.isChecked()) {
                    gst = amount * (7 / 100);
                }

                totalBill = amount + svs + gst;
                tvBill.setText("Total Bill: $" + totalBill);

                String paymentType = "";
                int checkedRadioId = rgPaymentType.getCheckedRadioButtonId();
                if(checkedRadioId == R.id.radioButtonPaynow){
                    paymentType = "Paynow to 912345678";
                }
                else{
                    paymentType = "Cash";
                }

                tvEachPay.setText(totalBill/pax + " in " + paymentType);

                Toast.makeText(MainActivity.this,"Bill Split", Toast.LENGTH_LONG).show();
            }
        });

        resetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etAmount.setText(null);
                etPax.setText(null);
                svsBtn.setEnabled(false);
                gstBtn.setEnabled(false);
                etDiscount.setText(null);
                rgPaymentType.clearCheck();
                tvBill.setText(null);
                tvEachPay.setText(null);
            }
        });

    }
}