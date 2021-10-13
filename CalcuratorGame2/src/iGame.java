
public interface iGame {
	
	//랜덤문제생성, 더하기문제출제, 빼기문제출제, 곱하기문제출제, 나누기문제출제
	
	    public void makeRandom();
	
		public void PlusGame();
		
		public void MinusGame();
		
		public void MulGame();
		
		public void DivGame();
		
		public String getQuizMsg();
		
		public boolean checkAnswer(int answer);
	
	

}
