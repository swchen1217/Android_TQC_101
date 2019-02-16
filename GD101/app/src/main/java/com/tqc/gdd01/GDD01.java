package com.tqc.gdd01;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class GDD01 extends Activity
{
    TextView output ;
    EditText et1,et2,et3;
    Button btn;
  @Override
  protected void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main);
      output=(TextView)findViewById(R.id.textView_out);
      et1=(EditText)findViewById(R.id.editText);
      et2=(EditText)findViewById(R.id.editText2);
      et3=(EditText)findViewById(R.id.editText3);
      btn=(Button)findViewById(R.id.button);
  }
    public void count(View view)
    {

        double out;
        out=Double.parseDouble(et1.getText().toString())*Math.pow(Double.parseDouble(et2.getText().toString())/100/12 + 1, Double.parseDouble(et3.getText().toString()));
        output.setText("本利合為:"+(int)out);
    }
}
