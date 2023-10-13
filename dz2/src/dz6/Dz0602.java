package dz6;
import java.util.Arrays;
public class Dz0602 {
    public static void main(String[] args) {
        String str1 = "JavA";
                String str2 = "avaj";
        boolean areAnagrams = Arrays.equals(
                str1.toLowerCase().chars().sorted().toArray(),
                str2.toLowerCase().chars().sorted().toArray()
        );
        System.out.println(areAnagrams);;
    }
}

