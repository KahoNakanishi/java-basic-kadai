	
package kadai_021;
import java.util.HashMap;

public class DictionaryExec_Chapter21 {
    private HashMap<String, String> dictionary;

    // コンストラクタで辞書を初期化
    public Dictionary_Chapter21() {
        dictionary = new HashMap<>();
        dictionary.put("apple", "りんご");
        dictionary.put("peach", "桃");
        dictionary.put("banana", "バナナ");
        dictionary.put("lemon", "レモン");
        dictionary.put("pear", "梨");
        dictionary.put("kiwi", "キウィ");
        dictionary.put("strawberry", "いちご");
        dictionary.put("grape", "ぶどう");
        dictionary.put("muscat", "マスカット");
        dictionary.put("cherry", "さくらんぼ");
    }

    // 配列で渡された単語を調べるメソッド
    public void searchWords(String[] words) {
        for (String word : words) {
            if (dictionary.containsKey(word)) {
                System.out.println(word + " の意味は「" + dictionary.get(word) + "」です。");
            } else {
                System.out.println(word + " は辞書に存在していません。");
            }
        }
    }
}

