package com.triclops.androidgpacalculator;

import com.triclops.androidgpacalculator.R;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class FourClassFragment extends Fragment{
	
	private Spinner class1Spin, class2Spin, class3Spin, class4Spin;
	private TextView gpaLabel;
	private Button calcButton;
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View fragView = inflater.inflate(R.layout.fragment_4classlayout, container, false);
		class1Spin = (Spinner) fragView.findViewById(R.id.class1_spinner);
		class2Spin = (Spinner) fragView.findViewById(R.id.class2_spinner);
		class3Spin = (Spinner) fragView.findViewById(R.id.class3_spinner);
		class4Spin = (Spinner) fragView.findViewById(R.id.class4_spinner);
		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getActivity(), R.array.gradeArray, android.R.layout.simple_spinner_item);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		class1Spin.setAdapter(adapter);
		class2Spin.setAdapter(adapter);
		class3Spin.setAdapter(adapter);
		class4Spin.setAdapter(adapter);
		return fragView;
	}
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setHasOptionsMenu(true);
		gpaLabel = (TextView) getActivity().findViewById(R.id.gpaLabel);
		calcButton = (Button) getActivity().findViewById(R.id.calculateButton);
		calcButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				int classes[] = new int[4];
				classes[0] = class1Spin.getSelectedItemPosition();
				classes[1] = class2Spin.getSelectedItemPosition();
				classes[2] = class3Spin.getSelectedItemPosition();
				classes[3] = class4Spin.getSelectedItemPosition();
				float GPA = GPACalc.getGPA(classes);
				gpaLabel.setText(getResources().getText(R.string.gpaLabel) +" "+ Float.toString(GPA));
			}
		});
	}
	public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
		inflater.inflate(R.menu.add, menu);
	}
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.add_button:
			return true;
		default:
			return super.onOptionsItemSelected(item);	
		}
	}
	

}
