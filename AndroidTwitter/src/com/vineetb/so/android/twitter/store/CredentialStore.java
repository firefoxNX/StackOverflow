package com.vineetb.so.android.twitter.store;


public interface CredentialStore {

  String[] read();
  void write(String[]response);
  void clearCredentials();
}
