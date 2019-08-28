import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class homeworkJava2 {
    public static void main(String[] args){
        greet();
        math();
        date();
        number(1);
        number(0);
        list();
    }

    //引数が0なら偽、1なら真と表示
    public static void number(int i) {
        if(i == 1){
            System.out.println("真");
        }else if(i == 0){
            System.out.println("偽");
        }
    }

    //コンソールに「HelloWorld」を表示してみよう
    public static void greet() {
        String greeting = "Hello World";
        System.out.println(greeting);
    }

    //1~10まで足した結果を表示してみよう これ以外にどう書くんだろうか
    public static void math(){
        int sum = 0;
        for(int i = 0;i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    //3年後の今日が何曜日なのかを計算して表示しよう
    public static void date() {
        LocalDateTime d = LocalDateTime.now();
        LocalDateTime dd = d.plusYears(3);
        System.out.println(dd.getDayOfWeek());
    }
    //Mapを使ってみた
    public static void list(){
        Map<String, Integer> population = new HashMap<>();
        population.put("京都府",2610000);
        population.put("大阪府",8838000);
        population.put("兵庫県",5536000);
        population.put("滋賀県",1413000);
        population.put("奈良県",1365000);
        System.out.println("京都府の人口は約" + population.get("京都府") + "人です");

    }


}
