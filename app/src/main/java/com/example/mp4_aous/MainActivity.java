package com.example.mp4_aous;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void button_click(View view) {
        TextView mytextview = (TextView) findViewById(R.id.textView);
        EditText myedittex = (EditText) findViewById(R.id.editText);
        String string1;
        string1 = myedittex.getText().toString();
        mytextview.setText(string1);
        myedittex.setText("");
    }
}