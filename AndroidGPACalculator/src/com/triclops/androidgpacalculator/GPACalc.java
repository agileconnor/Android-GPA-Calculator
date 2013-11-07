package com.triclops.androidgpacalculator;

public class GPACalc {
	public static float getGPA(final int class1, final int class2, final int class3, final int class4 ) {
		float GPA = 0;
		final float class1Num = gradeToGPA(class1);
		final float class2Num = gradeToGPA(class2);
		final float class3Num = gradeToGPA(class3);
		final float class4Num = gradeToGPA(class4);
		GPA = class1Num + class2Num + class3Num + class4Num;
		GPA = GPA/4;
		return GPA;
	}
	public static float gradeToGPA(final int grade) {
		switch (grade) {
		case 0:
			return 4;
		case 1:
			return 4;
		case 2:
			return 3.7f;
		case 3:
			return 3.3f;
		case 4:
			return 3;
		case 5:
			return 2.7f;
		case 6:
			return 2.3f;
		case 7:
			return 2;
		case 8:
			return 1.7f;
		case 9:
			return 1.3f;
		case 10:
			return 1;
		case 11:
			return .7f;
		default:
			return 0;
		}
	}
}
