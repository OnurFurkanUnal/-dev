package burak;

import java.util.Arrays;

public class Data {


	public static double avarage(Grader[] a) {
		double score = 0;
		for (int i = 0; i < a.length; i++) {

			score += a[i].getScore();

		}
		return score / 4;

	}

	public static double max(Grader[] a) {
		double score = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i].getScore() > score) {
				score = a[i].getScore();
			}

		}
		return score;

	}
	

}
