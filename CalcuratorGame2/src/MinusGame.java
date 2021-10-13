
import java.util.Random;

public class MinusGame implements iGame {

	private Random ran;
	private int num1;
	private int num2;

	@Override
	public void makeRandom() {
		ran = new Random();

		// 1~9������ �������� �����Ͽ� num1�� num2�� �ʱ�ȭ
		num1 = ran.nextInt(99) + 1;
		num2 = ran.nextInt(99) + 1;

	}

	@Override
	public String getQuizMsg() {
		return num1 + " - " + num2 + " = ";
	}

	@Override
	public boolean checkAnswer(double answer) {
		// ���׿����� : (���ǽ�) ? ���� �� : ������ ��
		return (answer == (num1 - num2)) ? true : false;
	}

}



