package com.example.zakatcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button =(Button)findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
          @Override
            public void onClick(View v) {
                EditText gold=findViewById(R.id.editnum1);
                EditText silver=findViewById(R.id.editnum2);
                EditText cash=findViewById(R.id.editnum3);
                EditText otheramt=findViewById(R.id.editnum4);
                Double doublegold=Double.parseDouble(gold.getText().toString());
                Double doublesilver=Double.parseDouble(silver.getText().toString());
                Double doublecash=Double.parseDouble(cash.getText().toString());
                Double doubleotheramt=Double.parseDouble(otheramt.getText().toString());

                Double sum=doublecash+doublegold+doublesilver+doubleotheramt;
                Double zakat=sum*0.025;
                TextView resultt=findViewById(R.id.resultview);
                String fresult=zakat.toString();
              String f=fresult;
                resultt.setText(fresult.concat(" ").concat("Rs"));

          }
        });
    }




//    public void btnclick( View view) {
//        EditText gold=findViewById(R.id.editnum1);
//        EditText silver=findViewById(R.id.editnum2);
//        EditText cash=findViewById(R.id.editnum3);
//        EditText otheramt=findViewById(R.id.editnum4);
//        Double doublegold=Double.parseDouble(gold.getText().toString());
//        Double doublesilver=Double.parseDouble(silver.getText().toString());
//        Double doublecash=Double.parseDouble(cash.getText().toString());
//        Double doubleotheramt=Double.parseDouble(otheramt.getText().toString());
//
//        Double sum=doublecash+doublegold+doublesilver+doubleotheramt;
//        Double zakat=sum*0.025;
//        TextView resultt=findViewById(R.id.resultview);
//        String fresult=zakat.toString()+" "+"Rs";
//        String f=fresult+" "+"Rs";
//        resultt.setText(f);
//    }


}