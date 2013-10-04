/*
 * Crystal McDonald
 * MDF 3
 * 1310
 * Web Activity
 * Set Sail app provides a web page with information for sailing in San Francisco
 */

package com.cm.setsail;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;

@SuppressLint("SetJavaScriptEnabled")
public class WebActivity extends Activity implements OnClickListener{
	WebView myWebView;
	Button goBack, goForward;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_web);
		//getting webView
		myWebView = (WebView)findViewById(R.id.sailingWebView);
		myWebView.getSettings().setUseWideViewPort(true);
		myWebView.getSettings().setLoadWithOverviewMode(true);
		//default URL
		myWebView.loadUrl("http://sfsailing.com/sailing/index.cfm");
		
		//set up onclick listeners for buttons
		findViewById(R.id.goBack).setOnClickListener(this);
		findViewById(R.id.goForward).setOnClickListener(this);	
	}
	
	//set up switch for buttons incase I add more functionality later
	@Override
	public void onClick(View v) {
		// set up switch case for buttons
		switch (v.getId()){
		case R.id.goBack:
			if(myWebView.canGoBack()){
				myWebView.goBack();
			}
			break;
			
		case R.id.goForward:
			if(myWebView.canGoForward()){
				myWebView.goForward();
				break;
			}
		
	}
}

	}//end