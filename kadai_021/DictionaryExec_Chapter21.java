package kadai_021;

public class DictionaryExec_Chapter21 {

    public static void main(String[] args) {

        // 辞書クラスのインスタンス生成
        Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();

        // 調べたい英単語の配列
        String[] wordsToSearch = {"apple", "banana", "grape", "orange"};

        // 辞書検索を実行
        dictionary.searchWords(wordsToSearch);
    }
}


