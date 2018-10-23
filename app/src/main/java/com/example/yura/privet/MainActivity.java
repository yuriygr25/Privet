package com.example.yura.privet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        public void onClick (View view){
            EditText userEditTextFrom = (EditText) findViewById(R.id.editTextUserFrom);
            EditText userEditText = (EditText) findViewById(R.id.editTextUser);
            EditText giftEditText = (EditText) findViewById(R.id.editTextGift);


            Intent intent = new Intent(MainActivity.this, AboutActivity.class);

            // в ключ username пихаем текст из первого текстового поля
            intent.putExtra("usernamefrom", userEditTextFrom.getText().toString());
            intent.putExtra("username", userEditText.getText().toString());
            // в ключ gift пихаем текст из второго текстового поля
            intent.putExtra("gift", giftEditText.getText().toString());
            startActivity(intent);
        }

//    public void onClick1(View view) {
//        Intent intent = new Intent(MainActivity.this, BirthdayActivity.class);
//        startActivity(intent);
//    }
    }
