package com.droidmanifester.shankr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;

public class WebviwExpl extends AppCompatActivity {
    WebView webView;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webviw_expl);
        webView=findViewById(R.id.ww);
        editText=findViewById(R.id.ed);
        webView.setWebViewClient(new WebViewClient());
    }

    public void loa(View view) {
        webView.loadUrl("http://"+editText.getText().toString());

    }
}
