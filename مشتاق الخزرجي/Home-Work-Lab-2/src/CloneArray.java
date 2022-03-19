import java.util.Arrays;

public class CloneArray {
     int [] j;
    public static void backup(int t[])
    {
        j=new int[t.length];
        for (int r = 1; r < t.length; r++) {
            y[r]=t[r];
        }
    }

    public static void main(String[] args) {
        int[] t={2,4,6,8,10};
        backup(x);
        System.out.println("t = "+Arrays.toString(t));
        System.out.println("j = "+Arrays.toString(j));
    }
}
