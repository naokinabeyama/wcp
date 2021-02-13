package practice;

public class quiz {
	public static void main(String[] args) {
		final int QUIZ_MAX = 3; // 問題数
		boolean loopFlg = true; //ループフラグ
		int inputNum = 0; // 入力番号
		int nowQuizNum = 0; //現在出題番号
		int correctTotal = 0; //正解数
		// メイン処理
		while (loopFlg) {
			System.out.println("********** クイズ **********");
			System.out.println("        現在、" + (nowQuizNum + 1) + "問目です。");
			System.out.println("***************************");
			System.out.println("");
			System.out.println("＜　問題です　＞");

			switch(nowQuizNum) {
			case 0:
			  System.out.println("変数の型でint型の最大値はいくつ？");
			  System.out.println("");
			  System.out.println("--------------------");
			  System.out.println("1:256 2:98776342 3:2147483647");
			  break;

			case 1:
			  System.out.println("変数の型を変更するのに使う方法はどれ？");
			  System.out.println("");
			  System.out.println("--------------------");
			  System.out.println("1:キャスト 2:スコープ 3:インクリメント");
			  break;

			case 2:
			  System.out.println("変数aが「4以上でかつ10以下」か「40未満」");
			  System.out.println("正しい条件式はどれ？");
			  System.out.println("");
			  System.out.println("--------------------");
			  System.out.println("1:(a >= 4 || a < 10) && a < 40");
			  System.out.println("2:(a >= 4 || a <= 10) || a < 40");
			  System.out.println("3:(a >= 4 && a <= 10) || a < 40");
			  break;
			}
			System.out.println("答え＞");
			// 問題を進める
			nowQuizNum += 1;

			// 最大数以上なら
			if(nowQuizNum >= QUIZ_MAX) {
				loopFlg = false; // ゲームを終了
			}

			// 入力処理
			int tmpInputNum = 0;
			try {
				final int IMPUT_MAX = 3; //最大入力値
				java.util.Scanner sc = new java.util.Scanner(System.in);
				int inputInt = sc.nextInt();
				if (inputInt > 0 && inputInt <= IMPUT_MAX) {
					tmpInputNum = inputInt;
				} else {
					System.out.println("*　コマンドは" + IMPUT_MAX + "以下で入力してください　*");
				}
			} catch (Exception e) {
				System.out.println("*　数字以外は入力しないで下さい　*");
			}

			// 入力番号を受け取る
			inputNum = tmpInputNum;

			// 表示終了の区切り
			System.out.println("");
			System.out.println("##############################");
			System.out.println("");
		}

		// 結果表示
		System.out.println("********** クイズ **********");
		System.out.println("");
		System.out.println("あなたの正解数は " + correctTotal + "でした。");
		System.out.println("");
		System.out.println("***************************");
		System.out.println("");
		System.out.println("おしまい");
	}

}