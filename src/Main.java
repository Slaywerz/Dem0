public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        long bonusBelowLimitForRegistered = service.calculate(true, 1000_60);
        System.out.println(bonusBelowLimitForRegistered);

        long bonusOverLimitForUnRegistered = service.calculate(true, 100_000_60);
        System.out.println(bonusOverLimitForUnRegistered);

        long bonusBelowLimitForUnRegistered = service.calculate(false, 1000_60);
        System.out.println(bonusBelowLimitForUnRegistered);

        long bonusOverLimitForRegistered = service.calculate(false, 100_000_60);
        System.out.println(bonusOverLimitForUnRegistered);
    }
}
