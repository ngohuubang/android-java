package cntt61_60135101.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 1. tim nut intro
        Button nutintro = (Button) findViewById(R.id.btnlogin);
        //2. cai dat bo lang nghe su kien
        nutintro.setOnClickListener(xulychuyensanglogin);

    }

    View.OnClickListener xulychuyensanglogin = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            //code xu ly chuyen about o day
            Intent iLogin = new Intent(MainActivity.this,LoginActivity.class);
            // goi lenh mo activity about
            startActivity(iLogin);
        }
    };

}