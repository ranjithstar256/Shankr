package com.droidmanifester.shankr;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class WebBased extends AppCompatActivity {

    TextView textView1,textView2;
    String s1,s2;
    ProgressDialog progressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_based);
        textView1=findViewById(R.id.textView5);
        textView2=findViewById(R.id.textView6);
    }

    public void webb(View view) {
        BgProcess obj = new BgProcess();
        obj.execute();
    }

    private class BgProcess extends AsyncTask{
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            progressDialog=new ProgressDialog(WebBased.this);
            progressDialog.setMessage("loading...");
            progressDialog.show();
        }

        @Override
        protected Object doInBackground(Object[] objects) {
            GetDat b = new GetDat();

            String j = b.getstr("https://api.androidhive.info/contacts/");
            try {
                JSONObject jsonObject = new JSONObject(j);

                JSONArray jary=jsonObject.getJSONArray("contacts");

                JSONObject jsonObject1= jary.getJSONObject(3);

                s1=jsonObject1.getString("name");

                JSONObject jsonObject2= jary.getJSONObject(8);

                s2=jsonObject2.getString("name");

            } catch (JSONException e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(Object o) {
            super.onPostExecute(o);
            progressDialog.dismiss();
            textView1.setText(s1);
            textView2.setText(s2);
        }
    }
}
