import java.util.Scanner;
import java.util.regex.*;
public class lb2z2 {
    public static void main(String[] args){
        Scanner password = new Scanner(System.in);
        System.out.println("Введите пароль");
        Pattern checkingFullPassword = Pattern.compile("^[A-Za-z0-9_]{8,}$");
        Pattern checkingUppercase = Pattern.compile("[A-Z]");
        Pattern checkingLowerCase = Pattern.compile("[a-z]");
        Pattern chekingNumbers = Pattern.compile("[0-9]");
        int cycle = 1;
        while (cycle > 0) {
            String passwordString = password.nextLine();
            Matcher matcherCheckingFullPassword = checkingFullPassword.matcher(passwordString);
            Matcher matcherCheckingUppercase = checkingUppercase.matcher(passwordString);
            Matcher matcherCheckingLowerCase = checkingLowerCase.matcher(passwordString);
            Matcher matcherChekingNumbers = chekingNumbers.matcher(passwordString);
            if (matcherCheckingFullPassword.matches() && matcherCheckingUppercase.find() && matcherCheckingLowerCase.find() && matcherChekingNumbers.find()) {
                System.out.println("Поздравляю, данный пароль надежен. ");
                break;
            } else {
                System.out.println("Пароль ненадежен. Повторите ввод: ");
            }
        }
    }
}
