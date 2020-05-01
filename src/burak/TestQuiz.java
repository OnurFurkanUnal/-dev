package burak;

import java.util.Arrays;

public class TestQuiz {
	
	public  String maxLetter(Grader[] a) {
		String[] ar = new String[4];
		for (int i = 0; i < a.length; i++) {
			 ar[i]=a[i].getGrade();
		}
	    Arrays.sort(ar);
		return ar[0];
		
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestQuiz test=new TestQuiz();
		System.out.println("E123456, AHMET OKAN, CENG, SEC1");
		System.out.println("-------------------------------");

		Grader[] ar = new Grader[4];
		ar[0] = new Quiz(83, "BB");
		ar[1] = new Quiz(90, "AA");
		ar[2] = new Quiz(73, "CC");
		ar[3] = new Quiz(79, "CB");
		System.out.println(test.maxLetter(ar));
		
		
	
		Data d = new Data();
		System.out.println("avarage = "+d.avarage(ar));
		System.out.println("max = "+d.max(ar));

	}

}