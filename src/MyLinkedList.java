import java.util.LinkedList;

public class MyLinkedList {
    public static void main(String[] args) {
        LinkedList<String> seasons =  new LinkedList<>();
        String winter = new String("Winter");
        String spring = new String("Spring");
        String summer = new String("Summer");
        String autumn = new String("Autumn");
        String february = new String("February");
        seasons.add(winter);
        seasons.add(summer);
        seasons.add(february);
        seasons.add(autumn);
        System.out.println(seasons);
        seasons.add(1, spring);
        seasons.remove(february);
        System.out.println("Seasons: " + seasons);
        int seasonsSize = seasons.size();
        String firstSeason = seasons.get(0);
        System.out.println("Amount of seasons: " + seasonsSize);
        System.out.println("FirstSeason: " + firstSeason);
        seasons.clear();
        System.out.println(seasons);
    }
}
