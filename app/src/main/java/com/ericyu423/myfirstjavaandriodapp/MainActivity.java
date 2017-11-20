package com.ericyu423.myfirstjavaandriodapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Boolean isClicked = false ;
    private Button button1;
    private TextView textView1;
    private ImageView imageView1;
    private EditText editText1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        initializeViews();

    }

    private void linkSubViews(){
        textView1 = (TextView) findViewById(R.id.textView1);
        button1 = (Button) findViewById(R.id.button1);
        imageView1 = (ImageView) findViewById(R.id.imageView1);
        editText1 = (EditText) findViewById(R.id.editText1);

    }


    private void initializeViews() {
        //connect
        linkSubViews();

        //button
        button1.setText(R.string.button_name);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {clicked();}
        });

        //textView
        textView1.setText(R.string.textView_name);
        textView1.setTextColor(Color.RED);
        textView1.setVisibility(View.INVISIBLE);

        //navigation Title
        setTitle(R.string.AppTitle_name);

        //editText, if default name hint name will now show up
        //keyboard automatically moves the text view
        editText1.setHint(R.string.hint_name);

    }
    public void clicked() {
        String enterText;
        isClicked = !isClicked;
        if (isClicked) {
            enterText = editText1.getText().toString();
            textView1.setVisibility(View.VISIBLE);
            textView1.setText(enterText);
            button1.setText("Clear Text");
        }else {

            enterText = "";
            textView1.setText(enterText);
            button1.setText("Get Text");
            editText1.setText(enterText);

        }


        /*
        isClicked = !isClicked;

        if (isClicked) {
            textView1.setVisibility(View.VISIBLE);
            textView1.setText(R.string.button_on_click_name);
        }else {
            textView1.setVisibility(View.INVISIBLE);
            //textView1.setText(R.string.button_name);

        }*/
    }

    /* this is added using storyboard than add code to match the onClick function name
    // obviously this got too many steps.
    public void showMe(View view){

        isClicked = !isClicked;

        if (isClicked) {
            textView1.setVisibility(View.VISIBLE);
            textView1.setText(R.string.button_on_click_name);
        }else {
            textView1.setVisibility(View.INVISIBLE);
            //textView1.setText(R.string.button_name);

        }

    } */


}
