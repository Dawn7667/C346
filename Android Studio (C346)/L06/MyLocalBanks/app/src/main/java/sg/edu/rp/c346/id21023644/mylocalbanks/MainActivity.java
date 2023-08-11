package sg.edu.rp.c346.id21023644.mylocalbanks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnDBS;
    Button btnOCBC;
    Button btnUOB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDBS = findViewById(R.id.buttonDBS);
        btnOCBC = findViewById(R.id.buttonOCBC);
        btnUOB = findViewById(R.id.buttonUOB);

        btnDBS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +92240336));
                startActivity(intentCall);
            }
        });

        btnOCBC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +92240336));
                startActivity(intentCall);
            }
        });

        btnUOB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +92240336));
                startActivity(intentCall);
            }
        });
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.menu_bank,menu);

    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        if(btnDBS) {
            if(item.getItemId()==0) {
                Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +1800111111));
                startActivity(intentCall);
            }
            else if(item.getItemId()==1) {
                Intent intent = new Intent(Intent. ACTION_VIEW, Uri.parse("http://www.dbs.com"));
                startActivity(intent);
            }
        }
        else if (btnOCBC){
            if(item.getItemId()==0) {
                Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +1800111111));
                startActivity(intentCall);
            }
            else if(item.getItemId()==1) {
                Intent intent = new Intent(Intent. ACTION_VIEW, Uri.parse("http://www.ocbc.com"));
                startActivity(intent);
            }
        }
        else if (btnUOB){
            if(item.getItemId()==0) {
                Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +1800111111));
                startActivity(intentCall);
            }
            else if(item.getItemId()==1) {
                Intent intent = new Intent(Intent. ACTION_VIEW, Uri.parse("http://www.uob.com"));
                startActivity(intent);
            }
        }
        return super.onContextItemSelected(item); //pass menu item to the superclass implementation
    }
}