import java.util.Scanner;

public class R6_5 {

    public static ArrayStack remov(ArrayStack x)
    {
       while (s.isEmpty()!=true)
       {
           x.pop();
       }
            }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayStack<Integer> x=new ArrayStack<>(6);
        for (int i = 0; i < 6; i++) {
            x.push(scanner.nextInt());
        }
        System.out.println("Is Empty befor "+x.isEmpty());
        x=remov(x);
        System.out.println("Is Empty after "+x.isEmpty());

    }
}
