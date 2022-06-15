package Thi.Cau2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ShowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        Intent iShow = getIntent();
        TextView textView= (TextView) findViewById(R.id.tvInfo);
        textView.setText(String.valueOf(iShow.getStringExtra("info")));
    }
}