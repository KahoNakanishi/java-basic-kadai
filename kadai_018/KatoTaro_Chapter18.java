package kadai_018;

public class KatoTaro_Chapter18 extends Kato_Chapter18 {
    // givenName をセット
    public void setGivenName() {
        this.givenName = "太郎";
    }

    // 個別の紹介
    @Override
    public void eachIntroduce() {
        System.out.println("私はJavaが得意です。");
    }
}

