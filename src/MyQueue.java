
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class MyQueue {
    public static void main(String[] args) {
        Queue<Integer> numbers = new ArrayDeque<>();
        numbers.add(16);
        numbers.add(117);
        numbers.add(9872567);
        numbers.add(9273);
        int size = numbers.size();
        System.out.println(size);
        int firstElement = numbers.peek();
        System.out.println("FirstElement: " + firstElement);
        int deleteFirstElement = numbers.poll();
        System.out.println(deleteFirstElement);
        System.out.println(numbers);
        numbers.clear();
        System.out.println(numbers);





            }
        }

