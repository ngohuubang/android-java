package cntt61_60135101.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //khai báo các đối tượng sẽ làm việc
    ListView listViewName;
    TextView textViewTen;
    String[] arrayName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewTen = (TextView) findViewById(R.id.tvTen);
        arrayName = getResources().getStringArray(R.array.list_name);
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

    }
}