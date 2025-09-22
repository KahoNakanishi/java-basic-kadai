package kadai_018;

public class Kato_Chapter18 {public abstract class Kato_Chapter18 {
    // フィールド
    public String familyName = "加藤"; // 姓は固定
    public String givenName;          // 子クラスで設定
    public String address = "東京都中野区〇〇"; // 任意の住所（例）

    // 共通の紹介を出力する
    public void commonIntroduce() {
        System.out.println("私の名前は " + familyName + " " + givenName + " です。");
        System.out.println("住所は " + address + " です。");
    }

    // 個別の紹介（抽象メソッド）
    public abstract void eachIntroduce();

    // 紹介を実行する
    public void execIntroduce() {
        commonIntroduce();   // 共通の紹介
        eachIntroduce();     // 個別の紹介（子クラスで実装）
    }
}

}
