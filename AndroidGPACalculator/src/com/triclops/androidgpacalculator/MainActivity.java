package com.triclops.androidgpacalculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends FragmentActivity {
	
	private Spinner class1Spin, class2Spin, class3Spin, class4Spin;
	private TextView gpaLabel;
	private FragmentManager fmanage = getSupportFragmentManager();
	private FragmentTransaction ftrans = fmanage.beginTransaction();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		gpaLabel = (TextView) findViewById(R.id.gpaLabel);
		FourClassFragment fragment = new FourClassFragment();
		ftrans.add(R.id.fragCont, fragment);
		ftrans.commit();
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
	
	public void onCalcPress(View view) {
		final int class1 = class1Spin.getSelectedItemPosition();
		final int class2 = class2Spin.getSelectedItemPosition();
		final int class3 = class3Spin.getSelectedItemPosition();
		final int class4 = class4Spin.getSelectedItemPosition();
		float GPA = GPACalc.getGPA(class1, class2, class3, class4);
		gpaLabel.setText(getResources().getText(R.string.gpaLabel) +" "+ Float.toString(GPA));
	}
	

}
