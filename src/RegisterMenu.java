public class RegisterMenu extends Menu {
    @Override
    public void interact() throws MenuExitException {
        String username = super.takeString("Lütfen Kullanıcı Adı Giriniz", 3, 10);

        Account account = new Account();
        account.setUsername(username);

        String password = super.takeString("Lütfen Şifre Giriniz", 3, 10);
        account.setPassword(password);


        int piece = super.takeInt("Günde kaç adet sigara içiyorsunuz?", 1, 150);

        int price = super.takeInt("Günlük ne kadar para ödüyorsunuz?", 1, 150);

        CigarettePackage cigarettePackage = new CigarettePackage(piece, price);
        account.setCigarette(cigarettePackage);

        int target = super.takeInt("Sigarayı kaç gün içerisinde bırakmak istersiniz?", 10, 364);
        SmokeQuitPlan quitPlan = new SmokeQuitPlan(target, cigarettePackage, piece);
        account.setQuitPlan(quitPlan);

        AccountDb.addAccount(account);
        System.out.println("Kayıt işlemi başarılı.");
    }
}
