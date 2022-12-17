import java.util.Scanner;
public class ThirdLaba {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Введите количество чисел: ");
            int n = input.nextInt();
            float[] arrNumbers = new float[n];
            System.out.println("Введите " + n + " чисел: ");
            int sum = 0;
            for (int i = 0; i < n; i++) {
                arrNumbers[i] = input.nextFloat();
                sum += arrNumbers[i];
            }
            float[] cloneArrNumbers = new float[n];
            for (int j = n; j > 0; j--) {
                cloneArrNumbers[j - 1] = sum / (float) j;
                sum -= arrNumbers[j - 1];
            }
            System.out.println("Исходный массив: ");
            for (int k = 0; k < n; k++) {
                System.out.print(arrNumbers[k] + " ");
            }
            System.out.println(" ");
            System.out.println("Массив после обработки: ");
            for (int k = 0; k < n; k++) {
                System.out.print(cloneArrNumbers[k] + " ");
            }
        } catch (NegativeArraySizeException exc) {
            System.out.println("Ошибка. Количество чисел должно быть положительным. ");
        }
    }

}
