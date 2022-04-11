package ngohuubang.baikt2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SimpleLoginApp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_login_app);

        Button nutintro = (Button) findViewById(R.id.btnconfirm);
        //2. cai dat bo lang nghe su kien
        nutintro.setOnClickListener(xulychuyensangtip);
    }


    View.OnClickListener xulychuyensangtip = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            EditText edtdn = (EditText) findViewById(R.id.edtusername);
            EditText edtmk = (EditText) findViewById(R.id.edtpass);

            String StringTen = "ngohuubang";
            String StringMk = "cntt";

            String x = edtdn.getText().toString();
            String y = edtmk.getText().toString();

            if((x.equals(StringTen)) && (y.equals(StringMk))){
                Toast.makeText(SimpleLoginApp.this, "Login thành công", Toast.LENGTH_SHORT).show();
                Intent iTips = new Intent (SimpleLoginApp.this, Tips.class);
                startActivity(iTips);
            }
            else{
                Toast.makeText(SimpleLoginApp.this, "Login thất bại", Toast.LENGTH_SHORT).show();
            }
        }
    };




}