package practice;

import java.io.BufferedReader; // 1行ずつ読み込むためのクラス
import java.io.IOException;	//null
import java.io.InputStreamReader; //日本語に

public class practice {
	public static void main(String[] args) {
        // 変数の初期値
		/* 必要な変数
		 * タイトル、ルール文、答えの格納される配列
		 * 入力された数字の格納される配列
		 * ヒット数、ブロー数、チャレンジ数
		 */
		String title = "*** CodeBreaker ***"; // タイトル
		String rule = "隠された３つの数字をあてます。\n"
				+ "１つの数字は１から６の間です。\n"
				+ "３つの答えの中に同じ数字はありません。\n"
				+ "入力した数字の、"
				+ "位置と数字だけ合ってたらヒット、\n"
				+ "数字だけあってたらブロートカウントとします。\n"
				+ "全部当てたら（３つともヒットになったら）"
				+ "終了です。\n\n";
		// \n = 改行
		int[] answer = new int[3]; //答えが入る
		int[] input = new int[3]; //入力した答えが入る
		/*
		 * hitはhitのカウント用、blowもblowのカウント用。
		 * countは何回目のチャレンジかを教えている。
		 */
		int hit = 0, blow = 0, count = 0;

		// タイトルとルール表示
		BufferedReader br
		  = new BufferedReader(new InputStreamReader(System.in)); //1行ごとに日本語の変換をしてくれる
		// System.in 標準入力を取得、InputStreamReaderで文字列に変換

		System.out.println(title);
		System.out.println(rule);

		// ランダムな答えを作成
		// ただし、仕様通り、同じ数字がないようにする。
		for (int i = 0; i < answer.length; i++) {
			// 自分より前の要素にかぶるやつがないか確かめる。
			// あったらもう１回random
			boolean flag = false;
			answer[i] = (int)(Math.random() * 6) + 1; //1~6ランダム
			// do~while文 trueの間繰り返す
			do {
				flag = false;
				for (int j = i - 1; j >= 0; j--) {
					if (answer[i] == answer[j]) {
						flag = true;
						answer[i] = (int) (Math.random() * 6) + 1;
					}
				}
			} while (flag == true);
		}
		// ゲーム部
		while (true) {
			count++;
			System.out.println("***" + count + "回目***");
			//インプット
			for (int i= 0; i < answer.length; i++) {
				System.out.print((i + 1) + "個目：");
				// try文:例外処理を行う
				try {
					input[i] = Integer.parseInt(br.readLine()); //答えを入力
				} catch (NumberFormatException e) { //文字列を数値型に変換しようとしたとき 
					System.err.println("数値を入力してください");
					i--;
				} catch (IOException e) { //nullだった場合
					System.out.println("もう一度入力してください");
					i--;
				}
			}
		}
	}

}
