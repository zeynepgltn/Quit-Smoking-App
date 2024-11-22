public class DialogMenu extends Menu {

    private Account account;

    public DialogMenu(Account account) {
        this.account = account;
    }

    @Override
    public void interact() throws MenuExitException {
        account.getQuitPlan().displayPlan();
        for (int i = account.getQuitPlan().getCurrentDay(); i < account.getQuitPlan().getHowManyDaysAfterQuit(); i++) {
            int count = takeInt((account.getQuitPlan().getCurrentDay()) + " gündesiniz kaç sigara içtiniz", 0, 100);
            account.getQuitPlan().addUsage(count);
            account.getQuitPlan().displayGeneral();
        }
    }
}
