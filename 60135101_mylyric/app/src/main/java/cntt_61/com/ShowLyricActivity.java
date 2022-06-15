package cntt_61.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ShowLyricActivity extends AppCompatActivity {

    EditText eFileContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_lyric);
        eFileContent = (EditText)findViewById(R.id.ednoidung);

        //
        Intent BH = getIntent();
        // Lấy ra tên BH   , ==> ten file là:  tenBH.txt
        String tenBai = BH.getStringExtra("tenBH");
        int resId = getRawResIdByName(tenBai);
        InputStream inp = getResources().openRawResource(resId);

        eFileContent.setText(readData(inp));
    }

    String readData(InputStream inp){
        String dongVanBan;
        InputStreamReader inpRdr = new InputStreamReader(inp);
        BufferedReader buffRdr = new BufferedReader(inpRdr);
        StringBuilder boTaoChuoi = new StringBuilder();//su dung lop nay de build chuoi
        try{
            while ((dongVanBan=buffRdr.readLine())!=null){
                boTaoChuoi.append(dongVanBan);
                boTaoChuoi.append("\n");
            }

        }catch (IOException ex){
            Log.e("ERROR", ex.getMessage());
        }

        return boTaoChuoi.toString();
    }

    public int getRawResIdByName(String resName)  {
        String pkgName = this.getPackageName();
        // Return 0 if not found.
        int resID = this.getResources().getIdentifier(resName , "raw", pkgName);

        return resID;
    }
}