import java.util.Scanner;

public class marks {
    public static void main(String[] args){
        Scanner m = new Scanner(System.in);
        System.out.print("enter marks:");
        int marks=m.nextInt();
        if(marks<=100 && marks>=0){
            if(marks>=80){
                System.out.println("high destintion");
            }else if(marks>=70){
                System.out.println("destintion");
            }else if(marks>=60){
                System.out.println("credit pass");
            }else if(marks>=50){
                System.out.println("pass");
            }else {
                System.out.println("fail");
                        
            }
        }else {
            System.out.println("error");
        }
    }
}
