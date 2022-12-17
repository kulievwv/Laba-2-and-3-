import java.util.Scanner;
public class lb2z1 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите дату: ");
        String input = in.nextLine();
        String [] elements = input.split( "/");
        try {
            if (elements.length == 3) {
                if (Integer.parseInt(elements[0]) > 0 && Integer.parseInt(elements[0]) < 31) {
                    if (Integer.parseInt(elements[1]) > 0 && Integer.parseInt(elements[1]) <= 12) {
                        if (Integer.parseInt(elements[2]) >= 1900 && Integer.parseInt(elements[2]) <= 9999) {
                            System.out.println("Введенное выражение является датой. ");
                        }
                    }
                  }
                } else {
                System.out.println("Введенное выражение не соответствует заданному формату даты dd/mm/yyyy ");
            }
        }catch(ClassCastException e){
            System.out.println("Ошбика. Числа должны быть целыми и положительными. ");
        }
    }
}
