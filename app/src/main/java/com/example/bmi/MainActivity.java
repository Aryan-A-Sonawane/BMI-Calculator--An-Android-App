package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.LinearLayoutCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

/** @noinspection Convert2Lambda*/
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayoutCompat MainLL = findViewById(R.id.MainLL);
        EditText EdtWt=findViewById(R.id.EdtWt), EdtHtFt=findViewById(R.id.EdtHtFt), EdtHtIn=findViewById(R.id.EdtHtIn);
        AppCompatButton BtnBMI = findViewById(R.id.BtnBMI);
        TextView VwResult=findViewById(R.id.VwResult), VwBMI=findViewById(R.id.VwBMI);

//        int Wt=Integer.parseInt(EdtWt.toString());
//        int HtFt=Integer.parseInt(EdtHtFt.toString());
//        int HtIn=Integer.parseInt(EdtHtIn.toString());
        BtnBMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int Wt=Integer.parseInt(EdtWt.getText().toString());
                int HtFt=Integer.parseInt(EdtHtFt.getText().toString());
                int HtIn=Integer.parseInt(EdtHtIn.getText().toString());
                float htcm= (float) ((30*HtFt)+(2.5*HtIn));
                float htm=htcm/100;
                float bmi=Wt/(htm*htm);
                VwBMI.setText(String.valueOf(String.format("%.2f",bmi)));
//                VwResult.setText(("Your BMI is:"+bmi);
                if(bmi>25)
                {
                    VwResult.setText(R.string.Ow);
                    MainLL.setBackgroundColor(getResources().getColor(R.color.ow));

                }
                else if(bmi<18)
                {
                    VwResult.setText(R.string.Uw);
                    MainLL.setBackgroundColor(getResources().getColor(R.color.uw));
                }
                else
                {
                    VwResult.setText(R.string.Nm);
                    MainLL.setBackgroundColor(getResources().getColor(R.color.nm));
                }
            }
        });

    }
}