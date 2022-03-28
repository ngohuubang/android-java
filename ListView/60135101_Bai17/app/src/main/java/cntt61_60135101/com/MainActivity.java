package cntt61_60135101.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listViewName;
    TextView textViewTen;
    ArrayList<String> arrayName;
    EditText editTextTenMoi;
    Button nutThem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nutThem = (Button)findViewById(R.id.btnThem);
        editTextTenMoi = (EditText)findViewById(R.id.edTenMoi);
        textViewTen = (TextView) findViewById(R.id.tvTen);

        arrayName = new ArrayList<>();
        arrayName.add("Tèo");
        arrayName.add("Tý");
        arrayName.add("Bin");
        arrayName.add("Bo");

        listViewName = (ListView) findViewById(R.id.listName);
        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1,arrayName);

        listViewName.setAdapter(adapter);



        listViewName.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String val = (String) listViewName.getItemAtPosition(position);

                textViewTen.setText("Tên đã chọn là "+ val);

            }
        });

        nutThem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editTextTenMoi.getText().toString();
                arrayName.add(name);
                adapter.notifyDataSetChanged();
            }
        });
    }
}