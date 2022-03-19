import java.util.Arrays;

public class RecerseArray {
    public static int[] recerse(int []t)
    {
        int []y=new 
int[t.length];
        for (int j = 0; j < t.length; j++) {
            y[(t.length-1)-j]=t[j];
        }
        return y;
    }

    public static void main(String[] args) {
        int [] a={1,2,6,8,9,7,12};
        System.out.println(Arrays.toString(a));
        System.out.println("after");
        System.out.println(Arrays.toString(recerse(a)));
    }
}
