package jp.techacademy.murai.yusuke.calcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static jp.techacademy.murai.yusuke.calcapp.R.id.editText1;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText editText1;
    EditText editText2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);

        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);

        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(this);

        editText1 = (EditText) findViewById(R.id.editText1);
        editText2 = (EditText) findViewById(R.id.editText2);

    }

    @Override
    public void onClick(View v){

        String value1str = editText1.getText().toString();
        String value2str = editText2.getText().toString();
        double value1 = Double.parseDouble(value1str);
        double value2 = Double.parseDouble(value2str);

        if (v.getId() == R.id.button1){
            Log.d("UI_PARTS", "Value1="+value1+", Value2="+value2);
            double value = value1 + value2;
            Log.d("UI_PARTS", "button1:value="+value1+"+"+value2+"="+value);
            intentResult(value);

        }else if(v.getId() == R.id.button2) {
            double value = value1 - value2;
            Log.d("UI_PARTS", "button2:value="+value1+"-"+value2+"="+value);
            intentResult(value);

        }else if (v.getId()==R.id.button3){
            double value = value1 * value2;
            Log.d("UI_PARTS", "button3:value="+value1+"*"+value2+"="+value);
            intentResult(value);

        }else if (v.getId() == R.id.button4) {
            double value = value1 / value2;
            Log.d("UI_PARTS", "button4:value="+value1+"/"+value2+"="+value);
            intentResult(value);

        }
    }

    private void intentResult(double value) {
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("VALUERESULT", value);
        startActivity(intent);

    }


}
