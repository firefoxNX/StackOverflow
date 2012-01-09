package com.vineetb.so.android.twitter;

import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.User;
import twitter4j.http.AccessToken;
import android.content.SharedPreferences;

import com.vineetb.so.android.twitter.store.SharedPreferencesCredentialStore;

public class TwitterUtils {

	public static boolean isAuthenticated(SharedPreferences prefs) {

		String[] tokens = new SharedPreferencesCredentialStore(prefs).read();
		AccessToken a = new AccessToken(tokens[0],tokens[1]);
		Twitter twitter = new TwitterFactory().getInstance();
		twitter.setOAuthConsumer(Constants.CONSUMER_KEY, Constants.CONSUMER_SECRET);
		twitter.setOAuthAccessToken(a);
		
		try {
			twitter.getAccountSettings();
			return true;
		} catch (TwitterException e) {
			return false;
		}
	}
	
	public static void sendTweet(SharedPreferences prefs,String msg) throws Exception {
		String[] tokens = new SharedPreferencesCredentialStore(prefs).read();
		AccessToken a = new AccessToken(tokens[0],tokens[1]);
		Twitter twitter = new TwitterFactory().getInstance();
		twitter.setOAuthConsumer(Constants.CONSUMER_KEY, Constants.CONSUMER_SECRET);
		twitter.setOAuthAccessToken(a);
        twitter.updateStatus(msg);
	}
	
	public static User getUser(SharedPreferences prefs) throws Exception {
		String[] tokens = new SharedPreferencesCredentialStore(prefs).read();
		AccessToken a = new AccessToken(tokens[0],tokens[1]);
		Twitter twitter = new TwitterFactory().getInstance();
		twitter.setOAuthConsumer(Constants.CONSUMER_KEY, Constants.CONSUMER_SECRET);
		twitter.setOAuthAccessToken(a);
        return twitter.showUser("firefoxNX");
	}
}
