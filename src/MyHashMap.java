import java.util.HashMap;

public class MyHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> monthAndNumber = new HashMap<>();
        monthAndNumber.put("January", 1);
        monthAndNumber.put("February", 2);
        monthAndNumber.put("March", 3);
        monthAndNumber.put("April", 4);
        monthAndNumber.put("May", 5);
        monthAndNumber.put("Summer", 3);
        monthAndNumber.put("June", 6);
        monthAndNumber.put("July", 9);
        monthAndNumber.put("August", 8);
        monthAndNumber.put("July", 7);
        monthAndNumber.put("September", 9);
        monthAndNumber.put("October", 10);
        monthAndNumber.put("November", 11);
        monthAndNumber.put("December", 12);
        System.out.println(monthAndNumber);
        int size = monthAndNumber.size();
        System.out.println(size);

        monthAndNumber.remove("Summer", 3);
        int size2 = monthAndNumber.size();
        System.out.println(size2);

        int number = monthAndNumber.get("February");
        System.out.println(number);

        monthAndNumber.clear();
        System.out.println(monthAndNumber);

    }
}
