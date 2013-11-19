package com.triclops.androidgpacalculator;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		SharedPreferences lastClass = getSharedPreferences("LASTCLASS", 0);
		switchClass(lastClass.getInt("LASTCLASSNUM", 0));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
        case R.id.action_about:
                Intent intent = new Intent(this, AboutActivity.class);
                startActivity(intent);
                return true;
        default:
                return super.onOptionsItemSelected(item);
        }
	}
	
	public void switchClass(int classNum) {
		setContentView(R.layout.activity_main);
		FragmentManager fmanage = getSupportFragmentManager();
		FragmentTransaction ftrans = fmanage.beginTransaction();
		Fragment fragment = null;
		SharedPreferences lastClass = getSharedPreferences("LASTCLASS", 0);
		SharedPreferences.Editor edit = lastClass.edit();
		switch (classNum) {
		case 4:
			fragment = new FourClassFragment();
			break;
		case 5:
			fragment = new FiveClassFragment();
			break;
		default:
			fragment = new FourClassFragment();
			classNum = 4;
			break;
		}
		ftrans.replace(R.id.fragCont, fragment);
		ftrans.addToBackStack(null);
		ftrans.commit();
		fmanage.executePendingTransactions();
		edit.putInt("LASTCLASSNUM", classNum);
		edit.commit();
	}
	
	

}
