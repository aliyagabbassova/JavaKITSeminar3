package Seminar4;
//        Объедините студентов в команды. В рамках выполнения задачи студентам необходимо:
//        Создайте коллекцию мужских и женских имен с помощью интерфейса List
//        Отсортируйте коллекцию в алфавитном порядке
//        Отсортируйте коллекцию по количеству букв в слове
//        Разверните коллекцию

import java.util.*;

import static java.util.Arrays.stream;


public class task1 {

    public static void main(String[] args) {
        //task2();
        task3();

            ArrayList<String> names = new ArrayList<>();
            names.add("Александр");
            names.add("Маша");
            names.add("Николай");
            names.add("Елена");
            names.add("Олег");
            System.out.println(names);
            Collections.sort(names);

            names.sort(Comparator.comparingInt(String::length));
            System.out.println(names);

            //System.out.println(names.reversed());

        }

    static void task2() {
        ArrayList<String> names = new ArrayList<>();
        names.add("Александр");
        names.add("Маша");
        names.add("Елена");
        names.add("Олег");
        names.add("Николай");
        names.add("Александр");
        names.add("Елена");
        names.add("Олег");
        names.add("Елена");
        names.add("Александр");
        names.add("Олег");
        names.add("Елена");

        System.out.println(names);

        Set<String> uniqueNames = new HashSet<>(names);
        System.out.println(uniqueNames);
        String minName = uniqueNames.stream().sorted().toList().get(0);
        System.out.println(minName);
        String maxName = uniqueNames.stream().max(Comparator.comparingInt(String::length)).get();
        System.out.println(maxName);
        System.out.println(new StringBuilder(maxName).reverse());

        names.removeIf(currentName -> currentName.contains("а"));
        System.out.println(names);
    }
//    Создайте телефонный справочник с помощью Map - телефон это ключ, а имя значение
//    Найдите человека с самым маленьким номером телефона
//    Найдите номер телефона человека чье имя самое большое в алфавитном порядке

    static void task3() {
        Map<String, String> phoneBook = new HashMap<>();
        phoneBook.put("5456544", "John");
        phoneBook.put("4789561", "James");
        phoneBook.put("8574598", "Kate");
        phoneBook.put("4236589", "Mary");

        String minKey = phoneBook.keySet().stream().sorted().findFirst().get();
        System.out.println(phoneBook.get(minKey));

        String maxValue = phoneBook.values().stream().sorted((s1,s2) ->s1.compareTo(s2)).findFirst().get();
        System.out.println(maxValue);
        System.out.println(phoneBook.entrySet().
                stream().filter((e)->e.getValue().equals(maxValue)).findAny().get().getKey());
    }
}

