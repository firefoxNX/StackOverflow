package com.vineetb.so.android.twitter;

import twitter4j.User;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.StrictMode;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.vineetb.so.android.twitter.store.SharedPreferencesCredentialStore;

public class AndroidTwitterActivity extends Activity {
	private SharedPreferences prefs;
	private TextView textView; 
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		if (android.os.Build.VERSION.SDK_INT > 9) {
		      StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
		      StrictMode.setThreadPolicy(policy);
		    }
		
		setContentView(R.layout.main);
		this.prefs = PreferenceManager.getDefaultSharedPreferences(this);

		Button launchOauth = (Button) findViewById(R.id.btn_launch_oauth);
		Button clearCredentials = (Button) findViewById(R.id.btn_clear_credentials);

		textView = (TextView) findViewById(R.id.response_code);
		
		launchOauth.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				startActivity(new Intent().setClass(v.getContext(),OAuthAccessTokenActivity.class));
			}
		});

		clearCredentials.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				clearCredentials();
				performApiCall();
			}

		});
		
		performApiCall();

	}
	
    private void clearCredentials() {
		new SharedPreferencesCredentialStore(prefs).clearCredentials();
	}
	
    /**
     * Performs an authorized API call.
     */
	private void performApiCall() {
		try {
//			String tweet = "Tweet sent at " + new Date();
//			TwitterUtils.sendTweet(prefs, tweet);
			User user = TwitterUtils.getUser(prefs);
			textView.setText(user.getName());
		} catch (Exception ex) {
			ex.printStackTrace();
			textView.setText("Error occured : " + ex.getMessage());
		}
	}
}