package burak;

import java.util.Arrays;

public class TestQuiz {
	

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
		//System.out.println(test.maxLetter(ar));
		
		Data d = new Data();
		double maxLetter = d.max(ar);
		System.out.println("avarage = "+d.avarage(ar));
		System.out.println("max = "+d.max(ar));
        if(maxLetter<=100&& 85<=maxLetter) { System.out.println("Hight Grade Letter=  AA"); }
	}

}