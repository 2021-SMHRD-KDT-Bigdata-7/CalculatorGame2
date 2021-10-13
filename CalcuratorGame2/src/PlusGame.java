import java.util.Random;

public class PlusGame implements iGame {


	private Random ran;
	private int num1;
	private int num2;
	
	@Override
	public void makeRandom() {
		ran = new Random();
		
		
		num1 = ran.nextInt(100)+1;
		num2 = ran.nextInt(100)+1;
		
	}

	@Override
	public String getQuizMsg() {
		return num1 + " + " + num2 + " = ";
	}

	@Override
	public boolean checkAnswer(double answer) {
		
		return (answer == (num1+num2)) ? true : false;
	}

	

}

