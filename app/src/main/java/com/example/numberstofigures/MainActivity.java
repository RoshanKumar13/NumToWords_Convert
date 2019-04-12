package com.example.numberstofigures;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText numval;
    private Button convert;
    private TextView outputval;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numval = findViewById(R.id.etnum);
        outputval = findViewById(R.id.output);
        convert = findViewById(R.id.btnconvert);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.parseInt(numval.getText().toString());
                Convert c = new Convert();
                if (num<=10000000) {
                    String res = c.convert(num);
                    outputval.setText(res);
                }else{
                    outputval.setText("High number of length");
                }
            }
        });

    }
}
