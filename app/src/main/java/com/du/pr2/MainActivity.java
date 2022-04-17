package com.du.pr2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //View declaration

    private TextView hello_text;
    private Button up_button;
    private Button reset_button;
    private Button down_button;
    private static int value = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // View assignment

        hello_text = findViewById(R.id.text_hello);
        up_button = findViewById(R.id.up_button);
        down_button = findViewById(R.id.down_button);
        reset_button = findViewById(R.id.reset_button);

        // Event handling

        up_button.setOnClickListener(this);
        down_button.setOnClickListener(this);
        reset_button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.down_button:
                if(value>=1){
                    value--;
                    hello_text.setText(Integer.toString(value));
                }
                break;

            case R.id.up_button:
                value++;
                hello_text.setText(Integer.toString(value));
                break;

            case R.id.reset_button:
                value = 0;
                hello_text.setText("0");
                break;

            default:
                System.out.println("Something went wrong");
        }

    }
}