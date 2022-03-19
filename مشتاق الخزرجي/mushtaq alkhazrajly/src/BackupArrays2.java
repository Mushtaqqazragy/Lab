import java.util.Arrays;

public class BackupArrays2 {
    public static void main(String[] args) {
        int []y={1,3,7,9,11};
        System.out.println ("Source Array");
        System.out.println (Arrays.toString (y));
        System.out.println ("backup array");
        System.out.println (Arrays.toString (backup(y)));
    }
    public static int[] backup(int[]source) {
        int[] backup = new int[source.length];
        for (int i = 0; i < source.length; i++) {
            backup[i] = source[i];


        }
        return backup;
    }
}
