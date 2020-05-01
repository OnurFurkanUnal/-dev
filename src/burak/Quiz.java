package burak;

public class Quiz extends Grader {

	double score;
	String grade;
	
	public Quiz(double score,String grade) {
		// TODO Auto-generated constructor stub
		this.score=score;
		this.grade=grade;
	}
    
	
	public String getGrade() {
		return grade;
	}

	@Override
	double getScore() {
		// TODO Auto-generated method stub
		return score;
	}

}
