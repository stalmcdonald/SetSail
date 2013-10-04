/*
 * Crystal McDonald
 * MDF 3
 * 1310
 * Web Activity
 * Set Sail app provides a web page with information for sailing in San Francisco
 */

package com.cm.setsail;

import java.net.URL;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.webkit.WebView;

public class WebActivity extends Activity {


		@Override
		protected void onCreate(Bundle savedInstanceState) {
			//gets a reference and launches activity
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_web);
			Intent webIntent = getIntent();
			
			// gets Uri data from the intent object
			Uri sailingData = webIntent.getData();
			URL sfsailingURL = null;
			
			//Converts the Uri data to a URL object
			try {
				sfsailingURL = new URL(sailingData.getScheme(), sailingData.getHost(), sailingData.getPath());
			}catch(Exception e){
				e.printStackTrace();
			}
			
			WebView webView = (WebView) findViewById(R.id.sailingWebView);
			//converts URL to a String
			webView.loadUrl(sfsailingURL.toString());
		}

		@Override
		public boolean onCreateOptionsMenu(Menu menu) {
			// Inflate the menu; this adds items to the action bar if it is present.
			getMenuInflater().inflate(R.menu.activity_web, menu);
			return true;
		}

	}