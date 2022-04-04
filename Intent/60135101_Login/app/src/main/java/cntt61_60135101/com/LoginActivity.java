package cntt61_60135101.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button nutintro = (Button) findViewById(R.id.btnconfirm);
        //2. cai dat bo lang nghe su kien
        nutintro.setOnClickListener(xulychuyensanghome);
    }

    View.OnClickListener xulychuyensanghome = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            EditText edtdn = (EditText) findViewById(R.id.edtusername);
            EditText edtmk = (EditText) findViewById(R.id.edtpass);
            EditText edtmail = (EditText) findViewById(R.id.edtemail);
            String StringTen = "ngohuubang";
            String StringMk = "cntt";
            String StringEmail = "bangnh@gmail.com";
            String x = edtdn.getText().toString();
            String y = edtmk.getText().toString();
            String z = edtmail.getText().toString();
            //sử dung hàm equals để so sanh hay chuỗi, đúng trả về true
            if ((x.equals(StringTen)) && (y.equals(StringMk)) && (z.equals(StringEmail))) {

                Toast.makeText(LoginActivity.this, "Login thành công", Toast.LENGTH_SHORT).show();
                Intent iHome = new Intent(LoginActivity.this, HomeActivity.class);
                iHome.putExtra("usr", x);
                startActivity(iHome);
            } else {
                Toast.makeText(LoginActivity.this, "Login thất bại, thử lại !", Toast.LENGTH_SHORT).show();
            }
        }
    };
}
