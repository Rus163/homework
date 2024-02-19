import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //1
        checkSum(7, 3);
        //2
        numberType(1);
        //3
        isNegative(-1);
        //4
        String str = "My name is Ruslan!:)";
        int count = 3;
        nameStrings(str, count);
        //5
        isLeapYear(1993);
        //6
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        niceArray(array);
        System.out.println("result:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        //7
        int[] array1 = new int[100];
        fillArray(array1);
        System.out.println("result:");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        //8
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        massivNumbers(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
        //9
        int size = 5;
        int[][] matrix = loveMatrix(size);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        //10
        int len = 5;
        int initialValue = 10;
        int[] array2 = loveArray(len, initialValue);
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }


    }

    //1
    public static boolean checkSum(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    //2
    public static void numberType(int num) {
        if (num >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    //3
    public static boolean isNegative(int num) {
        return num < 0;
    }

    //4
    public static void nameStrings(String str, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }

    //5
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    //6
    public static void niceArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }

    }

    //7
    public static void fillArray(int[] array1) {
        for (int i = 0; i < array1.length; i++) {
            array1[i] = i + 1;
        }
    }

    //8
    public static void massivNumbers(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
    }

    //9
    public static int[][] loveMatrix(int size) {
        int[][] matrix = new int[size][size];
            for (int i = 0; i < size; i++) {
                matrix[i][i] = 1;
            } return matrix;
    }

    //10
    public static int[] loveArray(int len, int loveValue) {
        int[] array2 = new int[len];
            for (int i = 0; i < len; i++) {
                array2[i] = loveValue;
            } return array2;
    }


}















