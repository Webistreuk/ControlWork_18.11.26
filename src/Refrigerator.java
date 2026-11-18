import java.util.ArrayList;
import java.util.List;

public class Refrigerator extends Products {
    private String color;
    static List<Refrigerator> refrigeratorList = new ArrayList<>();

    public Refrigerator(Integer length, Integer width, String name, Integer cost, String color) {
        super(length, width, name, cost);
        this.color = color;
        refrigeratorList.add(this);
    }

    public Refrigerator copy(String newColor) {
        return new Refrigerator(this.length, this.width, this.name, this.cost, newColor);
    }

    @Override
    public String toString() {
        return "Refrigerator{" +
                "color='" + color + '\'' +
                '}';
    }
}
