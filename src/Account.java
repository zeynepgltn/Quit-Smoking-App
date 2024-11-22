public class Account {

    private String username;

    private String password;

    private CigarettePackage cigarettePackage;
    private SmokeQuitPlan quitPlan;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCigarette(CigarettePackage cigarettePackage) {
        this.cigarettePackage = cigarettePackage;
    }

    public void setQuitPlan(SmokeQuitPlan quitPlan) {
        this.quitPlan = quitPlan;
    }

    public SmokeQuitPlan getQuitPlan() {
        return quitPlan;
    }
}
