
// Реализовать структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

import java.util.Map;
import java.util.HashMap;
import java.util.List;

public class task_1 {
        
        
    public static Map<String, List<String>> phoneBook = new HashMap<>();
    
        public static void main(String[] args) {
            addPerson();
            findPerson("Nastya");
        
        }
    
        public static void addPerson() {
            phoneBook.put("Nastya", List.of("1112223333", "222444555"));
            phoneBook.put("Sasha",List.of("555666777"));
    
        }
    
        public static void findPerson(String surname) { 
            System.out.printf("%s: %s", surname, phoneBook.get(surname));
        }
    }