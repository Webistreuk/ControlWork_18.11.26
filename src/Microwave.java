public class Microwave extends Products {
    private int power;
    static List<Microwave> microwaveList = new ArrayList<>();

    public Microwave(Integer length, Integer width, String name, Integer cost, int power) {
        super(length, width, name, cost);
        this.power = power;
        microwaveList.add(this);
    }

    public Microwave copy(int newPower) {
        return new Microwave(this.length, this.width, this.name, this.cost, newPower);
    }

    @Override
    public String toString() {
        return "Microwave{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", width=" + width +
                ", cost=" + cost +
                ", power=" + power +
                '}';
    }
}
