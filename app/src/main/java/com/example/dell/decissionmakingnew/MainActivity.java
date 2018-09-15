package com.example.dell.decissionmakingnew;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.resultId);
        editText = findViewById(R.id.numberId);
    }

    public void checkNumber(View view) {
        if (editText.getText().toString().isEmpty());
        textView.setText("Error");

        int number = Integer.parseInt(editText.getText().toString());

        switch (number / 10){
            case 10:  textView.setText("A+");
            case 9: textView.setText("A+");
            case 8: textView.setText("A+");
            break;

            case 7:  textView.setText("A");
                break;

            case 6:  textView.setText("A-");
                break;

            case 5:  textView.setText("B");
                break;

            case 4:  textView.setText("C");
                break;

                default: textView.setText("Fail");

        }

    }
}
