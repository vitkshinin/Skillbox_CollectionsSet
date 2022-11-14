package practice;

import org.apache.commons.collections.list.TreeList;

import java.util.*;

public class EmailList {

    public TreeSet<String> mail = new TreeSet<>();
    String regexRu = "[a-zA-Z0-9]+@[a-zA-Z0-9]+[.][ru]+";
    String regexCom = "[a-zA-Z0-9]+@[a-zA-Z0-9]+[.][com]+";

    public void add(String email) {
        // TODO: валидный формат email добавляется, email это строка, она быть может любой
        // принять решение добавлять аргумент email или нет должен этот метод
        if (email.matches(regexRu) || email.matches(regexCom)) {
            mail.add(email.toLowerCase(Locale.ROOT));
        } else {
            System.out.println("Неверный формат email");
        }
    }

    public List<String> getSortedEmails() {
        // TODO: возвращается сортированный список электронных адресов в алфавитном порядке
        for (String listMail : mail) {
            System.out.println(listMail);
        }
        return new TreeList(mail);
    }

}
