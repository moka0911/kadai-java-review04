package animal;

public class Human extends Animal implements Thinkable {
    private String hobby;
    
 // コンストラクタ
    public Human(String name, int age, String hobby) {
        super(name, age); // スーパークラスのコンストラクタを利用して名前と年齢を初期化
        this.hobby = hobby;
    }

    // ゲッターとセッター
    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
    
   // thinkメソッドの実装
    @Override
    public void think() {
        System.out.println("私は" + hobby + "について考えています。");
    }

}
