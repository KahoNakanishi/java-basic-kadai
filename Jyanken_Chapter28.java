
import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {

    // 自分のじゃんけんの手を入力するメソッド
    public String getMyChoice() {
        Scanner scanner = new Scanner(System.in);
        String choice = "";

        while (true) {
            System.out.print("自分のじゃんけんの手を入力してください (r:グー, s:チョキ, p:パー) > ");
            choice = scanner.nextLine().trim().toLowerCase();

            if (choice.equals("r") || choice.equals("s") || choice.equals("p")) {
                break; // 正しい入力なら抜ける
            } else {
                System.out.println("エラー: r, s, p のいずれかを入力してください。");
            }
        }
        return choice;
    }

    // 相手のじゃんけんの手を乱数で選ぶメソッド
    public String getRandom() {
        String[] hands = {"r", "s", "p"};
        double randomValue = Math.random() * 3; // 0.0 <= x < 3.0
        int index = (int)Math.floor(randomValue); // 0,1,2 に変換
        return hands[index];
    }

    // じゃんけんを行うメソッド
    public void playGame() {
        // 自分と相手の手を取得
        String myHand = getMyChoice();
        String opponentHand = getRandom();

        // HashMap で手の表示を管理
        HashMap<String, String> handMap = new HashMap<>();
        handMap.put("r", "グー");
        handMap.put("s", "チョキ");
        handMap.put("p", "パー");

        // 出力
        System.out.println("自分の手: " + handMap.get(myHand));
        System.out.println("相手の手: " + handMap.get(opponentHand));

        // 勝敗判定
        if (myHand.equals(opponentHand)) {
            System.out.println("結果: あいこです");
        } else if ((myHand.equals("r") && opponentHand.equals("s")) ||
                   (myHand.equals("s") && opponentHand.equals("p")) ||
                   (myHand.equals("p") && opponentHand.equals("r"))) {
            System.out.println("結果: 自分の勝ちです");
        } else {
            System.out.println("結果: 自分の負けです");
        }
    }

    // 動作確認用 main
    public static void main(String[] args) {
        Jyanken_Chapter28 game = new Jyanken_Chapter28();
        game.playGame(); // 1回勝負
    }
}

