package animal;

public class Review04 {

    public static void main(String[] args) {
        Human tanaka = new Human("田中 太郎", 25, "電車");
        Human suzuki = new Human("鈴木 次郎", 30, "野球");
        Human sato = new Human("佐藤 花子", 20, "映画");

     // tanakaのメソッド実行
        tanaka.say();
        tanaka.think();

     // suzukiのメソッド実行
        suzuki.say();
        suzuki.think();

     // satoのメソッド実行
        sato.say();
        sato.think();
    }

}
