package cntt61_60135101.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List <DiaDiem> image_details = getListData();
        final ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(new MyArrayAdapter(this,image_details));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                Object o = listView.getItemAtPosition(position);
                DiaDiem diadiem = (DiaDiem) o;
                Toast.makeText(MainActivity.this, "Selected :" + " " + diadiem, Toast.LENGTH_LONG).show();
            }
        });
        
    }

    //tạo danh sách
    private  List<DiaDiem> getListData() {
        List<DiaDiem> list = new ArrayList<DiaDiem>();
        DiaDiem spa = new DiaDiem("spa","star");
        DiaDiem hanoi = new DiaDiem("Hà Nội","earth");
        DiaDiem vungtau = new DiaDiem("Vũng Tàu","earth");
        DiaDiem conson = new DiaDiem("Côn Sơn","earth");
        DiaDiem danang = new DiaDiem("Đà Nẵng","earth");
        DiaDiem hue = new DiaDiem("Huế", "star");

        list.add(spa);
        list.add(hanoi);
        list.add(vungtau);
        list.add(conson);
        list.add(hue);
        list.add(danang);


        return list;
    }
}