package com.droidmanifester.shankr;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b; // declaration above oncreate mtd
    EditText editText;
    String s;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=findViewById(R.id.button3); // initialtn inside oncreate mtd
        editText=findViewById(R.id.editText3);
        textView=findViewById(R.id.textView3);

        b.setOnClickListener(new View.OnClickListener() { //usage
            @Override
            public void onClick(View v) {
                s=editText.getText().toString();
                //Toast.makeText(MainActivity.this, s, Toast.LENGTH_SHORT).show();
                //textView.setText(s);

                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("abd",s);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.drp,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        String j = item.getTitle().toString();
        //Toast.makeText(this, j+" selected ", Toast.LENGTH_SHORT).show();

        switch (j){
            case "Contact":
                AlertDialog.Builder alrt = new AlertDialog.Builder(MainActivity.this);
                alrt.setMessage("Contact is selected");
                alrt.setTitle("Success!");
                alrt.setIcon(android.R.drawable.ic_media_play);
                alrt.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "Yes clicked!", Toast.LENGTH_SHORT).show();
                    }
                });
                alrt.setNegativeButton("any",null);
                alrt.setNeutralButton("hi",null);
                alrt.show();
                break;
            case "test":
                Toast.makeText(this, j+ "Tested" , Toast.LENGTH_SHORT).show();
                    break;
            case "Log In":
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public void sahkr(View view) {

    }
}
