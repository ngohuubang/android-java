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

        List<BaiHat> image_details = getListData();
        final ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(new CustomListView(this, image_details));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Object o = listView.getItemAtPosition(position);
                BaiHat baihat = (BaiHat) o;
                Toast.makeText(MainActivity.this, "Đã chọn bài :" + " " + baihat, Toast.LENGTH_LONG).show();
            }
        });

    }



    private  List<BaiHat> getListData(){
        List<BaiHat> list = new ArrayList<BaiHat>();
        BaiHat baihat1 = new BaiHat("Bài hát 1","star","Ca sĩ 1");
        BaiHat baihat2 = new BaiHat("Bài hát 2","star","Ca sĩ 2");
        BaiHat baihat3 = new BaiHat("Bài hát 3","star","Ca sĩ 3");
        BaiHat bai4 = new BaiHat("Bài hát 4","star","Ca sĩ 4");

        list.add(baihat1);
        list.add(baihat2);
        list.add(baihat3);
        list.add(bai4);

        return  list;
    }
}