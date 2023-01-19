public class Main {
    public static void main(String[] args) {

        BonusMilesService bms = new BonusMilesService();
        int price = 24_000;
        int miles = bms.calculate(price);
        System.out.println("Количество начисленных бесплатных милей: " + miles);
    }
}