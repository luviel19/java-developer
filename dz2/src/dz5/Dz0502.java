package dz5;
import java.util.Scanner;
import java.util.Arrays;
public class Dz0502 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] n1 = new int [5];
        int[] n2 = new int [5];
        int i =0;
        int o = 0;
        while(n1.length>i || n2.length>o){
            int n3 =scanner.nextInt();
            if(i<n1.length && n3<0){
                n1[i]=n3;
                i+=1;
            }else if(o<n2.length && n3>0){
                n2[o]=n3;
                o+=1;
            }else if(n3==0){
                break;
            }else{
                System.out.println("Массив переполен!");
            }
        }
        System.out.println(Arrays.toString(n1));
        System.out.println(Arrays.toString(n2));
    }

}
