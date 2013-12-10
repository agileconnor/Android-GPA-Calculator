package com.triclops.androidgpacalculator;

import android.os.Bundle;
import android.support.v4.app.Fragment;
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

public class NineClassFragment extends Fragment{

	private Spinner class1Spin, class2Spin, class3Spin, class4Spin, class5Spin, class6Spin, class7Spin, class8Spin, class9Spin;
	private TextView gpaLabel;
	private Button calcButton;
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View fragView = inflater.inflate(R.layout.nineclass_fragment, container, false);
		class1Spin = (Spinner) fragView.findViewById(R.id.class1_spinner);
		class2Spin = (Spinner) fragView.findViewById(R.id.class2_spinner);
		class3Spin = (Spinner) fragView.findViewById(R.id.class3_spinner);
		class4Spin = (Spinner) fragView.findViewById(R.id.class4_spinner);
		class5Spin = (Spinner) fragView.findViewById(R.id.class5_spinner);
		class6Spin = (Spinner) fragView.findViewById(R.id.class6_spinner);
		class7Spin = (Spinner) fragView.findViewById(R.id.class7_spinner);
		class8Spin = (Spinner) fragView.findViewById(R.id.class8_spinner);
		class9Spin = (Spinner) fragView.findViewById(R.id.class9_spinner);
		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getActivity(), R.array.gradeArray, android.R.layout.simple_spinner_item);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		class1Spin.setAdapter(adapter);
		class2Spin.setAdapter(adapter);
		class3Spin.setAdapter(adapter);
		class4Spin.setAdapter(adapter);
		class5Spin.setAdapter(adapter);
		class6Spin.setAdapter(adapter);
		class7Spin.setAdapter(adapter);
		class8Spin.setAdapter(adapter);
		class9Spin.setAdapter(adapter);
		return fragView;
	}
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setHasOptionsMenu(true);
	}
	
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		gpaLabel = (TextView) getActivity().findViewById(R.id.gpaLabel);
		calcButton = (Button) getActivity().findViewById(R.id.calculateButton);
		calcButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				int classes[] = new int[8];
				classes[0] = class1Spin.getSelectedItemPosition();
				classes[1] = class2Spin.getSelectedItemPosition();
				classes[2] = class3Spin.getSelectedItemPosition();
				classes[3] = class4Spin.getSelectedItemPosition();
				classes[4] = class5Spin.getSelectedItemPosition();
				classes[5] = class6Spin.getSelectedItemPosition();
				classes[6] = class7Spin.getSelectedItemPosition();
				classes[7] = class8Spin.getSelectedItemPosition();
				classes[8] = class9Spin.getSelectedItemPosition();
				float GPA = GPACalc.getGPA(classes);
				gpaLabel.setText(getResources().getText(R.string.gpaLabel) +" "+ Float.toString(GPA));
			}
		});
	}
	
	public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
		inflater.inflate(R.menu.remove, menu);
	}
	
	public boolean onOptionsItemSelected(MenuItem item) {
		MainActivity main = (MainActivity) getActivity();
		switch (item.getItemId()) {
		case R.id.remove_button:
			main.switchClass(8);
			return true;
		default:
			return super.onOptionsItemSelected(item);	
		}
	}
}
