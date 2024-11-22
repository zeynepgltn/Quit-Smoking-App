public class AccountDb {
    private static final int MAX_SUPPORTED_ACCOUNTS = 250;
    public static Account[] accounts = new Account[MAX_SUPPORTED_ACCOUNTS];

    public static int length = 0;

    public static void addAccount(Account account) {
        accounts[length] = account;
        length++;
    }

    public static Account findAccountByUsernameAndPassword(String username, String password) {
        for (Account account : accounts) {
            if (account.getUsername().equals(username) && account.getPassword().equals(password)) {
                return account;
            }
        }
        return null;
    }

    public static int getAccountCount() {
        return length;
    }
}
