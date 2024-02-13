import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        prinThreeWords();
        checkSumSing();
        printColor();
        compareNumbers();
        dz1();
        dz2();
        dz3();
        dz4();
    }

    static void prinThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apply");
    }

    static void checkSumSing() {
        int a = 0;
        int b = -1;
        if ((a + b) >= 0) {
            System.out.println("Сумма положительная.");
        } else {
            System.out.println("Сумма отрицательная.");
        }

    }

    static void printColor() {
        int value = 777;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Жёлтый");
        } else {
            System.out.println("Зелёный");
        }
    }


    static void compareNumbers() {
        int a = 7;
        int b = 3;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }


    }

    static void dz1() {
        int a = 3;
        int b = 7;
        boolean c = (((a + b) >= 10) && ((a + b) <= 20));
        System.out.println(c);
    }

    static void dz2() {
        int a = 7;
        if (a >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }

    static void dz3() {
        int e = 3;
        if (e > 0){
            System.out.println("false");
        } else if (e < 0) {
            System.out.println("true");
        }
    }

    static void dz4(int ) {

    }




}




