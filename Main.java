import javax.swing.*;
//RaiseTech　Java課題第一回
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println(3);
        for(int i=0;i < 10;i++){
            if(i % 3 == 0) {
                System.out.println("HelloWorld");
            }else {
                System.out.println("HelloJava");
            }
        }
        double bmi = hello(1.7,  75.0);
        System.out.println(bmi);
        if(bmi >= 18.5 && bmi < 22.0) {
            System.out.println("BMIは正常です");
        }else{
            System.out.println("BMIが正常ではありません");
        }

    }
    public static double hello(double height,double weight){
        return weight / height /height;
    }
//
    

}
