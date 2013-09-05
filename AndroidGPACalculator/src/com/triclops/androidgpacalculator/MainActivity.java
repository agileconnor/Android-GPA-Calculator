package com.triclops.androidgpacalculator;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends FragmentActivity {
	
	private Spinner class1Spin, class2Spin, class3Spin, class4Spin;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		class1Spin = (Spinner) findViewById(R.id.class1_spinner);
		class2Spin = (Spinner) findViewById(R.id.class2_spinner);
		class3Spin = (Spinner) findViewById(R.id.class3_spinner);
		class4Spin = (Spinner) findViewById(R.id.class4_spinner);
		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.gradeArray, android.R.layout.simple_spinner_item);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		class1Spin.setAdapter(adapter);
		class2Spin.setAdapter(adapter);
		class3Spin.setAdapter(adapter);
		class4Spin.setAdapter(adapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
