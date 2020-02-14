package teamProject;

public class EnteringVO {
//	데이터를 저장하는 클래스
	
	
	private int idx;
	private String quiz;
	private String answer;
	private String wrong1;
	private String wrong2;
	private String wrong3;
	private String quizPassword;
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getQuiz() {
		return quiz;
	}
	public void setQuiz(String quiz) {
		this.quiz = quiz;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getWrong1() {
		return wrong1;
	}
	public void setWrong1(String wrong1) {
		this.wrong1 = wrong1;
	}
	public String getWrong2() {
		return wrong2;
	}
	public void setWrong2(String wrong2) {
		this.wrong2 = wrong2;
	}
	public String getWrong3() {
		return wrong3;
	}
	public void setWrong3(String wrong3) {
		this.wrong3 = wrong3;
	}
	public String getQuizPassword() {
		return quizPassword;
	}
	public void setQuizPassword(String quizPassword) {
		this.quizPassword = quizPassword;
	}
	@Override
	public String toString() {
		return "EnteringVO [idx=" + idx + ", quiz=" + quiz + ", answer=" + answer + ", wrong1=" + wrong1 + ", wrong2="
				+ wrong2 + ", wrong3=" + wrong3 + ", quizPassword=" + quizPassword + "]";
	}
	
}