package com.triclops.androidgpacalculator;

public class GPACalc {
	public static float getGPA(final int class1, final int class2, final int class3, final int class4 ) {
		float GPA = 0;
		float class1Num = gradeToGPA(class1);
		float class2Num = gradeToGPA(class2);
		float class3Num = gradeToGPA(class3);
		float class4Num = gradeToGPA(class4);
		GPA = class1Num + class2Num + class3Num + class4Num;
		GPA = GPA/4;
		return GPA;
	}
	public static float gradeToGPA(final int grade) {
		float gradeNum = 0;
		if (grade == 0) {
			gradeNum = 4;
		}else if (grade == 1) {
			gradeNum = 4;
		}else if (grade == 2) {
			gradeNum = 3.7f;
		}else if (grade == 3) {
			gradeNum = 3.3f;
		}else if (grade == 4) {
			gradeNum = 3;
		}else if (grade == 5) {
			gradeNum = 2.7f;
		}else if (grade == 6) {
			gradeNum = 2.3f;
		}else if (grade == 7) {
			gradeNum = 2;
		}else if (grade == 8) {
			gradeNum = 1.7f;
		}else if (grade == 9) {
			gradeNum = 1.3f;
		}else if (grade == 10) {
			gradeNum = 1;
		}else if (grade == 11) {
			gradeNum = .7f;
		}else{
			gradeNum = 0;
		}
		
		return gradeNum;
	}

}
