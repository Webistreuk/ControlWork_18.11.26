public class Computer extends Products {
    private String cpu;
    static List<Computer> computerList = new ArrayList<>();

    public Computer(Integer length, Integer width, String name, Integer cost, String cpu) {
        super(length, width, name, cost);
        this.cpu = cpu;
        computerList.add(this);
    }

    public Computer copy(String newCpu) {
        return new Computer(this.length, this.width, this.name, this.cost, newCpu);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", width=" + width +
                ", cost=" + cost +
                ", cpu='" + cpu + '\'' +
                '}';
    }
}
