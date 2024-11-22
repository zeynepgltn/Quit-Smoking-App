public class LoginMenu extends Menu {
    @Override
    public void interact() throws MenuExitException {
        Account found = null;
        while (true) {
            String username = super.takeString("Lütfen Kullanıcı Adı Giriniz", 3, 10);
            String password = super.takeString("Lütfen Şifre Giriniz", 3, 10);
            found = AccountDb.findAccountByUsernameAndPassword(username, password);

            if (found == null) {
                System.out.println("Hatalı kullanıcı adı veya şifre girdiniz lütfen tekrar deneyiniz.");
            } else {
                break;
            }
        }

        DialogMenu dialogMenu = new DialogMenu(found);
        dialogMenu.interact();
    }
}
