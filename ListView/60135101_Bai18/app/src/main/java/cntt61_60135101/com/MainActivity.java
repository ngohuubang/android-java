package cntt61_60135101.com;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends ListActivity{
    TextView selection;
    String arrPhone[]={"Intel",
            "SamSung",
            "Nokia",
            "Simen",
            "AMD",
            };
    ArrayAdapter<String >adapter=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Thiết lập Data Source cho Adapter
        adapter=new ArrayAdapter<String>
                (this,
                        android.R.layout.simple_list_item_1,
                        arrPhone);
        //Gán Adapter vào ListView
        //Nhớ là phải đặt id cho ListView theo đúng quy tắc
        setListAdapter(adapter);

        selection=(TextView) findViewById(R.id.selection);
    }
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {

        super.onListItemClick(l, v, position, id);
        String txt="Hãng điện thoại đã chọn là: "+arrPhone[position];
        selection.setText(txt);
    }
}