package sg.edu.rp.c346.id21023644.todolistmaker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText etToDo;
    Button btnAdd;
    Button btnDelete;
    Button btnClear;
    ListView lvToDo;

    ArrayList<String> alToDo;
    ArrayAdapter<String> aaToDo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etToDo = findViewById(R.id.editTextToDo);
        btnAdd = findViewById(R.id.buttonAdd);
        /*btnDelete = findViewById(R.id.buttonDelete);*/
        btnClear = findViewById(R.id.buttonClear);
        lvToDo = findViewById(R.id.listViewToDo);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String toDo = etToDo.getText().toString();
                alToDo.add(toDo);
                aaToDo.notifyDataSetChanged();
                toDo = null;
                Toast.makeText(MainActivity.this, "To Do Added", Toast.LENGTH_SHORT).show();
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alToDo.clear();
                aaToDo.notifyDataSetChanged();
                Toast.makeText(MainActivity.this, "To Do List Cleared", Toast.LENGTH_LONG).show();
            }
        });

        alToDo = new ArrayList<>();
        aaToDo = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, alToDo);
        lvToDo.setAdapter(aaToDo);
    }
}