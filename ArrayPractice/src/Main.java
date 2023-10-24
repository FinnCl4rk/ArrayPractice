import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void elementSwap(int[] c,int a,int b) {
        int swap;
        swap = c[a];
        c[a] = b;
        c[b] = swap;

    }
    public static int[] numbers = {43, 13, 12,7,1};
    public static void numbers(){
        int[] numbers = {43, 13, 12,7,1};
        numbers[0] = 13;
        numbers[1] = 43;
        print(numbers);
    }
    public static void primitive(){
        int high = 10;
        int low = 6;
        int[] elements = new int[high - low + 1];
        for(int i = high, x = 0; i >= low; x++, i--){
            elements[x] = i;
        }
        print(elements);
    }
    public static void nonPrim(){
        int high = 20;
        int low = 16;
        Integer[] ints = new Integer[high - low + 1];
        for(int x = 0, i = high; x >= low; x++, i--){
        ints[x] = i;
    }
        System.out.println(Arrays.toString(ints));
    }
    public static void print(int[] elements){
        System.out.print("{" + elements[0]);
        for(int i = 1; i < elements.length; i++){
            System.out.print(", " + elements[i]);
        }
        System.out.print("}");
    }
    public static void print(Integer[] ints){
        System.out.print("{" + ints[0]);
        for(int i = 1; i < ints.length; i++){
            System.out.print(", " + ints[i]);
        }
        System.out.print("}");
    }
    public static void main(String[] args) {
    elementSwap(numbers, 1, 2);
print(numbers);
    }
}