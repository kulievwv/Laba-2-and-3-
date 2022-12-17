import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class ThirdLabaTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            System.out.println("Введите количество чисел: ");
        try{
            int n = input.nextInt();
        int lengthSecondArray=0;
        Integer[] arrNumbers = new Integer[n];
        System.out.println("Введите " + n + " чисел: ");

        for (int i = 0; i < n; i++) {
            arrNumbers[i] = input.nextInt();
        }
        System.out.println("Введите число к удалению: ");
           int elementToDelete = input.nextInt();

        ArrayList<Integer> secondArray = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if(arrNumbers[i]!=elementToDelete){
                secondArray.add(arrNumbers[i]);
            }
        }
        System.out.println("Исходный массив: ");
        for(int i=0; i<n; i++){
            System.out.print(arrNumbers[i]+" ");
        }
            System.out.println(" ");
            System.out.println("Массив после обработки: ");
        for(int i:secondArray){
            System.out.print(i+" ");
        }
        } catch (NegativeArraySizeException e){
            System.out.println("Ошибка. Количество чисел должно быть положительным. ");
        }
        catch (ClassCastException e){
            System.out.println("Ошибка. Массив и число к удалению должны быть целыми.");
        }
    }
}
