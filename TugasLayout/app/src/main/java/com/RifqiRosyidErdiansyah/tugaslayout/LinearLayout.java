package com.RifqiRosyidErdiansyah.tugaslayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class LinearLayout extends AppCompatActivity {

    EditText pada, subject, pesan;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout);

        pada = findViewById(R.id.pada);
        subject = findViewById(R.id.subject);
        pesan = findViewById(R.id.pesan);
        submit = findViewById(R.id.submit);
    }
}