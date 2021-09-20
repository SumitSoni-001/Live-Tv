package com.example.sonitv.My_Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.sonitv.R;

public class BBC extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_bbc, container, false);

        // Setting WebView in the Fragment
        WebView webView = root.findViewById(R.id.webviewBBC);

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true); // It helps in viewing the multimedia inside webView.

        webView.getSettings().setSupportZoom(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setDisplayZoomControls(false);

        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.bbc.com/news");          // It contains the URL of the specified site.

        return root;
    }
}