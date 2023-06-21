import java.util.ArrayList;
import java.util.List;

public class MyArrayList {
    public static void main(String[] args) {
        List<String> planets = new ArrayList<>();
        String sun = new String("Sun");
        String mercury = new String("Earth");
        String venus = new String("Venus");
        String earth = new String("Earth");
        String mars = new String("Mars");
        String jupiter = new String("Jupiter");
        String saturn = new String("Saturn");
        String uranus = new String("Uranus");
        String neptune = new String("Neptune");
        planets.add(sun);
        planets.add(mercury);
        planets.add(venus);
        planets.add(earth);
        planets.add(mars);
        planets.add(jupiter);
        planets.add(saturn);
        planets.add(uranus);
        planets.add(neptune);
        System.out.println(planets.toString());
        planets.remove(0);
        System.out.println(planets.toString());
        System.out.println(planets.size());
        String planet4 = planets.get(3);
        System.out.println(planet4);
        planets.clear();
        System.out.println(planets.toString());

    }

}
