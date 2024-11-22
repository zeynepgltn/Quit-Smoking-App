public class SmokeQuitPlan {
    private int howManyDaysAfterQuit;

    private int currentDay;

    private int[] usage;

    private int[] requiredUsage;

    private CigarettePackage cigarettePackage;

    private int initialUsage;

    public SmokeQuitPlan(int howManyDaysAfterQuit, CigarettePackage cigarettePackage, int initialUsage) {
        this.howManyDaysAfterQuit = howManyDaysAfterQuit;
        this.usage = new int[howManyDaysAfterQuit];
        this.requiredUsage = new int[howManyDaysAfterQuit];
        this.cigarettePackage = cigarettePackage;
        this.addUsage(initialUsage);
        this.requiredUsage[0] = initialUsage;
        for (int i = 1; i < howManyDaysAfterQuit; i++) {
            int count = requiredUsage[i - 1] - (int) (Math.ceil(initialUsage / (double) howManyDaysAfterQuit));
            if (count < 0) {
                this.requiredUsage[i] = 0;
            } else {
                this.requiredUsage[i] = count;
            }
        }

        this.initialUsage = initialUsage;

    }

    public int getHowManyDaysAfterQuit() {
        return howManyDaysAfterQuit;
    }

    public void setHowManyDaysAfterQuit(int howManyDaysAfterQuit) {
        this.howManyDaysAfterQuit = howManyDaysAfterQuit;
        this.usage = new int[howManyDaysAfterQuit];
    }

    public int getCurrentDay() {
        return currentDay;
    }

    public void setCurrentDay(int currentDay) {
        this.currentDay = currentDay;
    }

    public int[] getUsage() {
        return usage;
    }

    public void setUsage(int[] usage) {
        this.usage = usage;
    }

    public void addUsage(int count) {
        this.usage[currentDay] = count;
        this.currentDay++;
    }


    public void displayDay() {
        this.displayDay(this.currentDay);
    }

    public void displayDay(int i) {
        System.out.println("=======" + "| Gün " + (i) + "|  " + "===========");
        System.out.println("\tİçilen Sigara:" + this.usage[i]);
        System.out.println("\tHedef :" + (this.requiredUsage[i]));

        if (this.usage[i] - this.requiredUsage[i] > 0) {
            System.out.println("\tHedef için azaltılması gereken sigara:" + (this.usage[i] - this.requiredUsage[i]));

        } else {
            System.out.println("\tTebrikler hedefe ulaştınız");
            System.out.println("\tBugun toplam:" + this.cigarettePackage.priceOfPiece(this.requiredUsage[i] - this.usage[i]) + " TL kar yaptınız.");
        }
        System.out.println("=======" + "| Gün " + (i) + "|  " + "===========");
    }

    public void displayPlan() {
        System.out.println("\tİçilen Sigara:" + this.initialUsage);
        System.out.println(howManyDaysAfterQuit + " Gün İçerisinde Sigara Bırakma Planı Oluşturuluyor...");
        System.out.println("Sigara Bırakma Planı:");
        for (int i = 1; i < howManyDaysAfterQuit; i++) {
            System.out.println((i) + ". Gün İçin Bırakılması Gereken Sigara " + (this.initialUsage - this.requiredUsage[i]));
        }

    }

    public void displayFinish() {
        if (this.usage[currentDay - 1] == 0) {
            System.out.println("Tebrikler Sigarayı Bıraktınız.");
            System.out.println("Artık günlük toplam:" + cigarettePackage.priceOfPiece(initialUsage) + " TL kar yapıyorsunuz.");
        } else {
            System.out.println("Üzgünüz sigarayı bırakamadınız. Tekrar denemeye ne dersiniz?");
        }
    }

    public void displayGeneral() {
        for (int i = 1; i < currentDay; i++) {
            displayDay(i);
        }
        if (currentDay == howManyDaysAfterQuit) {
            displayFinish();
        }
    }
}
