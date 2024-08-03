package animal;

public class Human extends Animal implements Thinkable {
    private String hobby;
    
 // コンストラクタ
    public Human(String name, int age, String hobby) {
        this.name = name; 
        this.age = age;
        this.hobby = hobby;
    }

    // ゲッターとセッター
    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
    
    public class Human extends Animal implements Thinkable {
       
    }

}
