package kadai_021;
public class Dictionary_Chapter21 {
    public static void main(String[] args) {
        // 辞書クラスのインスタンスを作成
        Dictionary_Chapter21 dict = new Dictionary_Chapter21();

        // 調べたい英単語の配列を準備
        String[] wordsToSearch = {"apple", "banana", "grape", "orange"};

        // メソッドを呼び出して検索
        dict.searchWords(wordsToSearch);
    }
}
