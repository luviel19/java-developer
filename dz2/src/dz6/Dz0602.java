package dz6;
import java.util.Arrays;
public class Dz0602 {
    public static void main(String[] args) {
        String str1 = "Java DeVeLOPer";
        String str2 = "VaJa VeDePoLeR";
        char[] arrStr1 = str1.toLowerCase().toCharArray();
        char[] arrStr2 =str2.toLowerCase().toCharArray();
        Arrays.sort(arrStr1);
        Arrays.sort(arrStr2);
        str1 = Arrays.toString(arrStr1);
        str2 = Arrays.toString(arrStr2);
        System.out.println(str1.equals(str2));
    }
}
