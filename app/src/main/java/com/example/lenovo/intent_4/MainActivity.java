package com.example.lenovo.intent_4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
Button b1;
    EditText username;
    Intent intent;
    String S;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=(EditText) findViewById(R.id.name);
        b1=(Button) findViewById(R.id.login);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                S=username.getText().toString();
                intent = new Intent(getBaseContext(), Main2Activity.class);
                intent.putExtra("username", S);
                startActivity(intent);
            }
        });

    }
}
