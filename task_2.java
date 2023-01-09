
// 1.Написать программу, которая найдет и выведет повторяющиеся имена
// с количеством повторений.

// 2.Отсортировать по убыванию популярности.

import java.util.*;


public class task_2 {
    public static void main(String[] args) {
        Map<String, Integer> nameMap = new HashMap<>();
        String employees = "Иван Владимиров " +
                "Виктория Алексеева " +
                "Мария Лугова " +
                "Анна Чернышева " +
                "Павел Петров " +
                "Иван Рыков " +
                "Анна Владимирова " +
                "Мария Михайлова " +
                "Алексей Чернышов " +
                "Мария Савина " +
                "Павел Светлов " +
                "Алексей Сергеев ";
        String[] listOfNamesAndSurnames = employees.split(" ");
        for (int i = 0; i < listOfNamesAndSurnames.length; i += 2) {
            if (nameMap.containsKey(listOfNamesAndSurnames[i])) {
                nameMap.replace(listOfNamesAndSurnames[i], nameMap.get(listOfNamesAndSurnames[i]) + 1);
            } 

            else {
                nameMap.put(listOfNamesAndSurnames[i], 1);
            }
        }

        System.out.println(nameMap);
        Map<String, Integer> sortedNameMap = new LinkedHashMap<>();
        int max = 1;

        for (int value : nameMap.values()) {
            if (value > max) {
                max = value;
            }
        }

        for (int i = max; i > 0; i--) {
            for (Map.Entry<String, Integer> entry : nameMap.entrySet()) {
                String key = entry.getKey();

                if (nameMap.get(key) == i) {
                    sortedNameMap.put(key, nameMap.get(key));
                }
            }
        }

        System.out.println(sortedNameMap);

    }
}