public class Application {
    public static void main(String[] args) {

        //testApplication();
        startMenu();
    }

    public static void startMenu() {
        MainMenu menu = new MainMenu();
        try {
            menu.interact();
        } catch (MenuExitException e) {
            System.out.println("Uygulama sonlandı");
        }
    }

    public static void assertTrue(boolean condition) {
        if (!condition)
            throw new RuntimeException();
    }

    public static void testApplication() {
        testSmokeQuitPlan();
    }

    public static void testCigarette() {
        CigarettePackage cigarettePackage = new CigarettePackage(10, 30);
        assertTrue(cigarettePackage.unitPrice() == 3);
        assertTrue(cigarettePackage.priceOfPiece(2) == 6);
    }

    public static void testSmokeQuitPlan() {
        CigarettePackage cigarettePackage = new CigarettePackage(10, 30);
        SmokeQuitPlan quitPlan = new SmokeQuitPlan(10, cigarettePackage, 10);
        quitPlan.addUsage(5);
        quitPlan.displayPlan();
    }
}
