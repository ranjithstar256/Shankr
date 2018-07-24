package com.droidmanifester.shankr;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ShardPref extends AppCompatActivity {

    EditText editText1, editText2;
    String s1, s2;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shard_pref);
        editText1 = findViewById(R.id.editText4);
        editText2 = findViewById(R.id.editText5);
        sharedPreferences = getSharedPreferences("naveen", MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }

    public void dfghjk(View view) {
        s1 = editText1.getText().toString();
        s2 = editText2.getText().toString();
        editor.putString("ram", s1);
        editor.putString("sita", s2);
        editor.commit();
        Toast.makeText(this, "Data save  success!", Toast.LENGTH_SHORT).show();
    }
}