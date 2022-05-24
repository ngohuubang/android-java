package cntt61_60135101.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edCao,edDay,edBen,edCV,edDT;
    Button btntinh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edCao = (EditText)findViewById(R.id.edChieuCao);
        edDay = (EditText)findViewById(R.id.edDay);
        edBen = (EditText)findViewById(R.id.edCanhBen);
        edCV = (EditText)findViewById(R.id.edKetQuaChuVi);
        edDT = (EditText)findViewById(R.id.edKetQuaDienTich);
        btntinh = (Button)findViewById(R.id.btntinh);


    }

    public void XuLy(View v){
        String chieuCao = edCao.getText().toString();
        int cao = Integer.parseInt(chieuCao);



        String canhDay = edDay.getText().toString();
        int day = Integer.parseInt(canhDay);

        String canhBen = edBen.getText().toString();
        int ben = Integer.parseInt(canhBen);

        int dienTich = day*cao;

        int chuVi = (day*2)+(ben*2);

        String chuoiChuVi = String.valueOf(chuVi);
        String chuoiDienTich = String.valueOf(dienTich);

        edCV.setText(chuoiChuVi);

        edDT.setText(chuoiDienTich);
    }
}