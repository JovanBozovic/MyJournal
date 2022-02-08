package com.example.myjournal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toolbar;

public class AddEntry extends AppCompatActivity {
    Toolbar toolbar;
    EditText entryTitle,entryContent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_entry);
        toolbar=findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

        entryTitle=findViewById(R.id.entryTitle);
        entryContent=findViewById(R.id.entryContent);
    }
}