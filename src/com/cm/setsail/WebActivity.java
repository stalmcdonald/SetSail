/*
 * Crystal McDonald
 * MDF 3
 * 1310
 * Web Activity
 * Set Sail app provides a web page with information for sailing in San Francisco
 */

package com.cm.setsail;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class WebActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_web);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_web, menu);
		return true;
	}

}
