package be.thomasmore.tdd;

import java.lang.reflect.Array;

public class Exercise1 {

    public int calculateSum(int[] arrayInt){
        int som = 0;
        for (int i = 0; i < arrayInt.length; i++) {
            som += arrayInt[i];
        }
        return som;
    }

    public static void main(String[] args) {
        Exercise1 e1 = new Exercise1();
        int[] array = {2, 5, 7, 6};
        System.out.println(e1.calculateSum(array));
    }
}
