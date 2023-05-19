package sg.edu.rp.c346.id21023644.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView tvDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        tvDetails = findViewById(R.id.textViewModuleDetails);
        Intent intentReceived = getIntent();

        String moduleNo = intentReceived.getStringExtra("module");
        if(moduleNo == "c346"){
            moduleNo = getString(R.string.c346_details);
        }
        else if (moduleNo == "c206"){
            moduleNo = getString(R.string.c206_details);
        }
        else if (moduleNo == "c218"){
            moduleNo = getString(R.string.c218_details);
        }
        else if (moduleNo == "c338"){
            moduleNo = getString(R.string.c338_details);
        }
        else{
            moduleNo = "Error";
        }

        tvDetails.setText(moduleNo);

    }
}