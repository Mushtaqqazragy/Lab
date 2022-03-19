import java.util.Scanner;


public class R6_4 {

    public void static ArrayStack transfer(ArrayStack x, y)
    {
        while (y.isEmpty()!=true)
        {
            x.push(y.pop());
        }
      return x;
    }
    public static void main(String[] args) {
        ArrayStack<Integer> x =new ArrayStack<>(6);
        ArrayStack<Integer> x =new ArrayStack<>(6);
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i < 6; i++) {

            S.push(scanner.nextInt());
            System.out.println("x Top = "x.top());
        }
        System.out.println();
        T=transfer(x,y);
        for (int i = 0; i < 6; i++) {
            System.out.print("y Top = "+x.top());
            x.pop();
            System.out.println();

        }

    }
}
