package com.triclops.androidgpacalculator;

import android.app.backup.BackupAgentHelper;
import android.app.backup.SharedPreferencesBackupHelper;

public class GPABackupAgent extends BackupAgentHelper{
	
	static final String PREFS = "PREFS";
	static final String PREFS_KEY = "prefs";
	
	@Override
	public void onCreate() {
		SharedPreferencesBackupHelper helper = new SharedPreferencesBackupHelper(this, PREFS);
		addHelper(PREFS_KEY, helper);
	}

}
