package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.lab2.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickFunction(View view){
        Log.i("Info","Button pressed");
        EditText myTextField = findViewById(R.id.myTextField);
        String str = myTextField.getText().toString();
        //Toast.makeText(MainActivity.this, myTextField.getText().toString(), Toast.LENGTH_SHORT).show();
        goToActivity2(str);
    }

    public void goToActivity2(String s){
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        intent.putExtra("message",s);
        startActivity(intent);
    }
}
