package com.triclops.androidgpacalculator;

public class GPACalc {
	public static float getGPA(final int[] classes) {
		float GPA = 0;
		final float classNums[] = gradeToGPA(classes);
		for (float i : classNums) {
			GPA += i;
		}
		GPA = GPA/classes.length;
		return GPA;
	}
	public static float[] gradeToGPA(final int[] grades) {
		float GPAs[] = new float[grades.length];
		for (int i = 0; i < grades.length; i++) {
			switch (grades[i]) {
			case 0:
				GPAs[i] = 4;
				break;
			case 1:
				GPAs[i] = 4;
				break;
			case 2:
				GPAs[i] = 3.7f;
				break;
			case 3:
				GPAs[i] = 3.3f;
				break;
			case 4:
				GPAs[i] = 3;
				break;
			case 5:
				GPAs[i] = 2.7f;
				break;
			case 6:
				GPAs[i] = 2.3f;
				break;
			case 7:
				GPAs[i] = 2;
				break;
			case 8:
				GPAs[i] = 1.7f;
				break;
			case 9:
				GPAs[i] = 1.3f;
				break;
			case 10:
				GPAs[i] = 1;
				break;
			case 11:
				GPAs[i] = .7f;
				break;
			default:
				GPAs[i] = 8;
				break;
			}
		}
		return GPAs;
	}
}
