package ngohuubang.baikt2;

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

        Button nutintro = (Button) findViewById(R.id.btnconfirm);

        nutintro.setOnClickListener(xulychuyensanglogin);

    }

    View.OnClickListener xulychuyensanglogin = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent iSimpleLoginApp = new Intent(MainActivity.this, SimpleLoginApp.class);

            startActivity(iSimpleLoginApp);
        }
    };
}