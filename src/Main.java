public class Main {
    public static void main(String[] args) {
        Computer pc1 = new Computer(50, 45, "PC-Game", 60000, "Ryzen 5");
        Computer pc2 = pc1.copy("Intel i7");

        Microwave mw1 = new Microwave(40, 30, "LG EasyClean", 8500, 800);
        Microwave mw2 = mw1.copy(1000);

        Refrigerator fr1 = new Refrigerator(180, 60, "Atlant", 45000, "белый");
        Refrigerator fr2 = fr1.copy("серебристый");

        System.out.println("=== Компьютеры ===");
        for (Computer c : Computer.computerList) {
            System.out.println(c);
        }

        System.out.println("\n=== Микроволновки ===");
        for (Microwave m : Microwave.microwaveList) {
            System.out.println(m);
        }

        System.out.println("\n=== Холодильники ===");
        for (Refrigerator r : Refrigerator.refrigeratorList) {
            System.out.println(r);
        }
    }
}
