package sg.edu.rp.c346.id21023644.democontextmenutranslation2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tvTranslatedText;
    String wordClicked = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTranslatedText = findViewById(R.id.textViewTranslatedText);

        registerForContextMenu(tvTranslatedText);
    }


    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
            getMenuInflater().inflate(R.menu.menu_main,menu);

    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        if(wordClicked.equalsIgnoreCase("hello")){
            if(item.getItemId()==0) {
                tvTranslatedText.setText("Hello");
                Toast.makeText(MainActivity.this, "English is chosen", Toast.LENGTH_SHORT).show();
                return true;
            }
            else if(item.getItemId()==1) {
                tvTranslatedText.setText("Ciao");
                Toast.makeText(MainActivity.this, "Italian is chosen", Toast.LENGTH_SHORT).show();
                return true;
            }
        }
        return super.onContextItemSelected(item); //pass menu item to the superclass implementation
    }

}