package cntt61_60135101.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listViewTho;
    TextView textViewTen;
    ArrayList<String> arrayTho;
    EditText editTextTen,editTextViTri;
    Button nutThem,nutSua,nutXoa;
    int vitri = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nutThem = (Button)findViewById(R.id.btnThem);
        nutSua = (Button)findViewById(R.id.btnSua);
        nutXoa = (Button)findViewById(R.id.btnXoa);
        editTextTen = (EditText)findViewById(R.id.edTen);
        editTextViTri = (EditText) findViewById(R.id.edViTri);

        arrayTho = new ArrayList<>();
        arrayTho.add("Quê Hương");
        arrayTho.add("Truyện Kiều");


        listViewTho = (ListView) findViewById(R.id.listName);
        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1,arrayTho);

        listViewTho.setAdapter(adapter);



        listViewTho.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String val = (String) listViewTho.getItemAtPosition(position);



                editTextTen.setText(val);
                vitri = position;
                String pos = String.valueOf(vitri);
                editTextViTri.setText(pos);

            }
        });

        nutThem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editTextTen.getText().toString();
                arrayTho.add(name);
                adapter.notifyDataSetChanged();
                Toast.makeText(MainActivity.this, "Thêm thành công", Toast.LENGTH_SHORT).show();
            }
        });

        nutSua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editTextTen.getText().toString();
                arrayTho.set(vitri,name);
                adapter.notifyDataSetChanged();
                Toast.makeText(MainActivity.this, "Cập nhập thành công", Toast.LENGTH_SHORT).show();
            }
        });

        nutXoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                arrayTho.remove(vitri);
                adapter.notifyDataSetChanged();
                Toast.makeText(MainActivity.this, "Xóa thành công", Toast.LENGTH_SHORT).show();
            }
        });


    }
}