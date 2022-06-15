package Thi.Cau2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edInfo = (EditText) findViewById(R.id.edInfo);

        Button nutintro = (Button) findViewById(R.id.btnSend);
        //2. cai dat bo lang nghe su kien
        nutintro.setOnClickListener(xulychuyen);
    }

    View.OnClickListener xulychuyen = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            String x = edInfo.getText().toString();
            Intent iShow = new Intent(MainActivity.this,ShowActivity.class);
            iShow.putExtra("info", x);
            startActivity(iShow);
        }
    };
}