package jp.techacademy.murai.yusuke.calcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        double value = intent.getDoubleExtra("VALUERESULT", 0);
        Log.d("UI_PARTS", "Main2でのLog出力Valueは"+value);


        TextView textView = (TextView) findViewById(R.id.textView3);
        textView.setText(String.valueOf(value));




    }
}
