import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/* ------------------- Задание 1, 2 -------------------
public class Application {
    public static void Algorithm(int[] numberArray, int numToFind) {
        int low = 0;
        int high = numberArray.length;
        int middle;
        int iter = 0;

        while (low <= high) {
            middle = (low + high) / 2;
            int num = numberArray[middle];
            iter++;
            if (num == numToFind) {
                System.out.println("Найдено");
                System.out.println("Индекс: " + middle + " Количество итераций: " + iter);
                return;
            } else if (num > numToFind) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }
        System.out.println("Нет числа");
        System.out.println("Итерация: " + iter);
    }


    public static void main(String[] args) {
        int[] numberArray;
        int arrayLenght;
        int numToFind;
        System.out.println("Введите размер массива");
        Scanner scan = new Scanner(System.in);
        arrayLenght = scan.nextInt();
        numberArray = new int[arrayLenght];
        Random random = new Random();
        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = random.nextInt(-100, 100);
        }
        Arrays.sort(numberArray);
        System.out.println(Arrays.toString(numberArray));
        System.out.println("Введите число для поиска");
        numToFind=scan.nextInt();
        Algorithm(numberArray, numToFind);
    }
}
*/

/* ------------------- Задание 3 -------------------
public class Application {
    public static void main(String[] args) {
        int[] numberArray1;
        int[] numberArray2;
        int arrayLenght;
        boolean flag = false;
        System.out.println("Введите размер массивов");
        Scanner scan = new Scanner(System.in);
        arrayLenght = scan.nextInt();

        numberArray1 = new int[arrayLenght];
        numberArray2 = new int[arrayLenght];
        Random random = new Random();
        for (int i = 0; i < numberArray1.length; i++) {
            numberArray1[i] = random.nextInt(-100, 100);
        }
        for (int j = 0; j < numberArray2.length; j++) {
            numberArray2[j] = random.nextInt(-100, 100);
        }
        Arrays.sort(numberArray1);
        Arrays.sort(numberArray2);
        System.out.println(Arrays.toString(numberArray1));
        System.out.println(Arrays.toString(numberArray2));
        System.out.println("Совпали числа: ");

        for (int i = 0; i < numberArray1.length; i++) {
            for (int j = 0; j < numberArray2.length; j++) {
                if (numberArray1[i] == numberArray2[j]) {
                    System.out.print(numberArray1[i] + " ");
                    flag = true;
                }
            }
        }
        if (flag==false){
            System.out.println("Совпадений нет");
        }
    }
}
*/

/* ------------------- Задание 4 -------------------
public class Application {
    public static void Algorithm(int[] numberArray, int numToFind) {
        int low = 0;
        int high = numberArray.length - 1;
        int middle;

        while (low <= high) {
            middle = (low + high) / 2;
            int num = numberArray[middle];

            if (num == numToFind) {
                System.out.print(numToFind + " ");
                return;
            } else if (num > numToFind) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }
    }

    public static void main(String[] args) {
        int[] numberArray1;
        int[] numberArray2;
        int arrayLength;

        System.out.println("Введите размер массивов");
        Scanner scan = new Scanner(System.in);
        arrayLength = scan.nextInt();

        numberArray1 = new int[arrayLength];
        numberArray2 = new int[arrayLength];
        Random random = new Random();

        for (int i = 0; i < numberArray1.length; i++) {
            numberArray1[i] = random.nextInt(-100, 100);
        }
        for (int j = 0; j < numberArray2.length; j++) {
            numberArray2[j] = random.nextInt(-100, 100);
        }

        Arrays.sort(numberArray1);
        Arrays.sort(numberArray2);

        System.out.println(Arrays.toString(numberArray1));
        System.out.println(Arrays.toString(numberArray2));
        System.out.println("Совпали числа: ");

        for (int i = 0; i < numberArray1.length; i++) {
            Algorithm(numberArray2, numberArray1[i]);
        }
    }
}
*/