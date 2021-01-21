import java.util.Arrays;

public class Homework2 {

    public static void main(String[] args) {
        System.out.println("Задание №1");
        invertArray();
        System.out.println("Задание №2");
        fillArray();
        System.out.println("Задание №3");
        changeArray();
        System.out.println("Задание №4");
        diagArray();
        System.out.println("Задание №5");
        minMax();
        System.out.println("Задание №6");
        int[] arr = {8,2,1,5};
        System.out.println(checkBalance(arr));
        System.out.println("Задание №7");
        int[] a = {5,6,2,3,5,1};
        arrayShift(a,-4);

    }

        public static void invertArray(){
            int[] arr = {0, 1, 1, 0, 0, 1, 1, 0};
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 0) {
                    arr[i] = 1;
                } else {
                    arr[i] = 0;
                }
            }
            System.out.println(Arrays.toString(arr));
        }

        public static void fillArray(){
        int[] arr = new int[8];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = i * 3;
            }
            System.out.println(Arrays.toString(arr));
        }

        public static void changeArray(){
            int[] arr = {1,5,3,2,11,4,5,2,4,8,9,1};
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < 6){
                    arr[i] *= 2;
                }
            }
            System.out.println(Arrays.toString(arr));
        }

        public static void diagArray(){
            int[][] arr = new int[4][4];
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    arr[0][0] = arr[0][3] = 1;
                    arr[1][1] = arr[1][2] = 1;
                    arr[2][1] = arr[2][2] = 1;
                    arr[3][0] = arr[3][3] = 1;
                    System.out.print(arr[i][j] + " ");

                }
                System.out.println();
            }
        }

        public static void minMax() {
            int[] arr = {3,40,-4,-2,100,9,-50,4};
            System.out.println(Arrays.toString(arr));
            int min = arr[0];
            int max = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < min)
                    min = arr[i];
                if (arr[i] > max)
                    max = arr[i];
            }
            System.out.println("Минимальный элемент: " + min);
            System.out.println("Максимальный элемент: " + max);
        }

        public static boolean checkBalance(int[] arr) {
            System.out.println(Arrays.toString(arr));
            int leftSum = 0;
            int sum = 0;
            //сумма всех элементов
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
            int halfSum = sum / 2; //"полусумма", условное разделение массива на 2 части

            //сумма в левой части
            for (int i = 0; i < arr.length; i++) {
                leftSum += arr[i];
                if (leftSum == halfSum)
                    break;
            }
            //сумма в правой части
            int rightSum = sum - leftSum;
            //сравниваем суммы правой и левой частей
            return (rightSum == leftSum);

        }

       public static void arrayShift(int [] a, int n){
            /*
            В этой задаче возникли трудности в тот момент, когда значение n выходит за пределы массива (т.е когда n > a.length)
            Плюс ещё не могу обойтись без вспомогательного массива...
             */

             System.out.println("Входной массив: " + Arrays.toString(a));
             System.out.println("Смещение n = " + n);
             if (n > 0) {
                 int[] b = new int[a.length];
                 for (int i = 0, j = n; i < a.length; i++, j--) {
                     if (j > 0)
                         b[i] = a[a.length - j];
                     else if (j == 0)
                         b[i] = a[j];
                     else if (j < 0)
                         b[i] = a[i - n];
                     else break;
                 }
                 System.out.println("Результат: " + Arrays.toString(b));
             }
             if (n < 0) {
                 int[] b = new int[a.length];
                 for (int i = 0, j = n * (-1); i < a.length; i++, j++) {
                     if (j < a.length)
                         b[i] = a[j];
                     if (j >= a.length)
                         b[i] = a[j - a.length];
                 }
                 System.out.println("Результат: " + Arrays.toString(b));

             }
         }





}
