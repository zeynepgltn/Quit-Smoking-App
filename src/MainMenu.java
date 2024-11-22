public class MainMenu extends Menu {

    private static final String MENU_STRING = "Yapmak istediğiniz işlemi seçiniz:\n"
            + "1.Üye olmak\n"
            + "2.Giriş yapmak\n"
            + "3.Çıkış yapmak\n"
            + "Menülerden geri gelmek için 'q' giriniz.";

    public void interact() throws MenuExitException {
        while (true) {
            int input = this.takeInt(MENU_STRING, 1, 3);
            switch (input) {
                case 1: {
                    try {
                        RegisterMenu registerMenu = new RegisterMenu();
                        registerMenu.interact();
                    } catch (MenuExitException ex) {
                        System.out.println("Üst menüye dönüldü");
                    }
                    break;
                }
                case 2: {
                    try {
                        LoginMenu loginMenu = new LoginMenu();
                        loginMenu.interact();
                    } catch (MenuExitException ex) {
                        System.out.println("Üst menüye dönüldü");
                    }
                    break;
                }
                case 3: {
                    throw new MenuExitException();
                }
                default: {
                    break;
                }
            }
        }
    }
}
