import java.util.Scanner;

public class ArithmeticGameMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("======== 계산게임 프로그램 ========");
		
		int count = 0;
		while(true) {
			System.out.print("[1]더하기 [2]빼기 [3]곱하기 [4]나누기 [5]종료 >>");
			iGame game = null;
			int num = sc.nextInt();
			if(num == 1) {
				//플러스
				game = new PlusGame();
			}else if (num == 2) {
				//마이너스
				game = new MinusGame();
			}else if(num == 3) {
				//곱하기
				game = new MulGame();
			}else if(num == 4) {
				//나누기
				game = new DivGame();
			}else if(num ==5) {
				//종료
				//맞춘문제
				System.out.println("맞춘문제: " + count);
				System.out.println("프로그램을 종료합니다!");
				break;
			}else {
				System.out.println("잘못된 번호를 입력하셨군요! 강제 종료 됩니다.");
				break;
			}
			game.makeRandom();
			
			for (int i = 0; i < 3; i++) {
				// 2. 랜덤수를 이용하여 문제 생성
				String quiz = game.getQuizMsg();
				System.out.print(quiz);
				int answer = sc.nextInt();

				// 3. 정답 확인
				if (game.checkAnswer(answer)) {
					System.out.println("잘 맞췄어요");
					count++;
					break;
				} else {
					if (i == 0) {
						System.out.println("다시 생각하세요");
					} else if (i == 1) {
						System.out.println("한번더!");
					} else {
						System.out.println("그냥 다음 문제로 넘어갈께요....");
					}
				}

			} // end i

		} // end j
			
	}

}
