import java.util.Scanner;

public class ArithmeticGameMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("======== ������ ���α׷� ========");
		
		int count = 0;
		while(true) {
			System.out.print("[1]���ϱ� [2]���� [3]���ϱ� [4]������ [5]���� >>");
			iGame game = null;
			int num = sc.nextInt();
			if(num == 1) {
				//�÷���
				game = new PlusGame();
			}else if (num == 2) {
				//���̳ʽ�
				game = new MinusGame();
			}else if(num == 3) {
				//���ϱ�
				game = new MulGame();
			}else if(num == 4) {
				//������
				game = new DivGame();
			}else if(num ==5) {
				//����
				//���Ṯ��
				System.out.println("���Ṯ��: " + count);
				System.out.println("���α׷��� �����մϴ�!");
				break;
			}else {
				System.out.println("�߸��� ��ȣ�� �Է��ϼ̱���! ���� ���� �˴ϴ�.");
				break;
			}
			game.makeRandom();
			
			for (int i = 0; i < 3; i++) {
				// 2. �������� �̿��Ͽ� ���� ����
				String quiz = game.getQuizMsg();
				System.out.print(quiz);
				int answer = sc.nextInt();

				// 3. ���� Ȯ��
				if (game.checkAnswer(answer)) {
					System.out.println("�� ������");
					count++;
					break;
				} else {
					if (i == 0) {
						System.out.println("�ٽ� �����ϼ���");
					} else if (i == 1) {
						System.out.println("�ѹ���!");
					} else {
						System.out.println("�׳� ���� ������ �Ѿ����....");
					}
				}

			} // end i

		} // end j
			
	}

}
