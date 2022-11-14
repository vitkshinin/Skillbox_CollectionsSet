package practice;

import java.util.Scanner;

public class Main {
    public static final String WRONG_EMAIL_ANSWER = "Неверный формат email";
    
    /* TODO:
        Пример вывода списка Email, после ввода команды LIST в консоль:
        test@test.com
        hello@mail.ru
        - каждый адрес с новой строки
        - список должен быть отсортирован по алфавиту
        - email в разных регистрах считается одинаковыми
           hello@skillbox.ru == HeLLO@SKILLbox.RU
        - вывод на печать должен быть в нижнем регистре
           hello@skillbox.ru
        Пример вывода сообщения об ошибке при неверном формате Email:
        "Неверный формат email"
    */

    private static EmailList emailList = new EmailList();

    public static void main(String[] args) {
        System.out.println("Введите команду \"ADD\" или \"LIST\"");

        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String input = scanner.nextLine().trim();
            if (input.equals("0")) {
                break;
            }

            String[] text = input.split("\\s", 2);
            String command = text[0].trim();

            switch (command) {
                case "ADD":
                    String email = text[1].trim();
                    emailList.add(email);
                    break;
                case "LIST":
                    emailList.getSortedEmails();
                    break;
                default:
                    System.out.println("Введена неверная команда");
                    break;
            }
        }
    }
}
