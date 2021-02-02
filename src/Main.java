public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int cost = 10_000;
        int miles = service.calculate(cost);
        System.out.println(miles);
    }
}










/*public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        boolean price = 12_000;
        int miles = service.calculate(price);
        System.out.println(miles);
    }
}*/