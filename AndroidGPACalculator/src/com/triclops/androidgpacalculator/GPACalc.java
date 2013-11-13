package com.triclops.androidgpacalculator;

public class GPACalc {
	public static float getGPA(final int classes[]) {
		float GPA = 0;
		final float classNums[] = gradeToGPA(classes);
		for (float i : classNums) {
			GPA += i;
		}
		GPA = GPA/classes.length;
		return GPA;
	}
	public static float[] gradeToGPA(final int grades[]) {
		float GPAs[] = new float[grades.length];
		for (int i = 0; i < grades.length; i++) {
			switch (grades[i]) {
			case 0:
				GPAs[i] = 4;
			case 1:
				GPAs[i] = 4;
			case 2:
				GPAs[i] = 3.7f;
			case 3:
				GPAs[i] = 3.3f;
			case 4:
				GPAs[i] = 3;
			case 5:
				GPAs[i] = 2.7f;
			case 6:
				GPAs[i] = 2.3f;
			case 7:
				GPAs[i] = 2;
			case 8:
				GPAs[i] = 1.7f;
			case 9:
				GPAs[i] = 1.3f;
			case 10:
				GPAs[i] = 1;
			case 11:
				GPAs[i] = .7f;
			default:
				GPAs[i] = 0;
			}
		}
		return GPAs;
	}
}
