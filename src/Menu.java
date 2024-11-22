import java.util.Scanner;

public abstract class Menu {
    protected final Scanner scanner;

    public Menu() {
        this.scanner = new Scanner(System.in);
    }

    public abstract void interact() throws MenuExitException;

    protected String takeString(String text, int minLength, int maxLength) throws MenuExitException {
        while (true) {
            System.out.print(text + ": ");
            String value = scanner.nextLine();

            if ("q".equals(value)) {
                throw new MenuExitException();
            }

            if (minLength == 0) {
                return value;
            }

            if (value == null || value.isBlank() || value.isEmpty()) {
                System.out.println("Bu alan boş girilemez");
            } else if (value.length() < minLength) {
                System.out.println("Deger minumum " + minLength + " uzunluğunda olabilir.");
            } else if (value.length() > maxLength) {
                System.out.println("Deger maximum " + minLength + " uzunluğunda olabilir.");
            } else {
                return value;
            }
        }
    }

    protected int takeInt(String text, int min, int max) throws MenuExitException {
        while (true) {
            System.out.print(text + ": ");
            String value = scanner.nextLine();

            if ("q".equals(value)) {
                throw new MenuExitException();
            }

            try {
                int number = Integer.parseInt(value);
                if (number < min) {
                    System.out.println("Deger minumum " + min + " uzunluğunda olabilir.");
                } else if (number > max) {
                    System.out.println("Deger maximum " + max + " uzunluğunda olabilir.");
                } else {
                    return number;
                }
            } catch (NumberFormatException ex) {
                System.out.println("Hatalı giriş yaptınız lütfen tekrar giriniz.");
            }
        }
    }
}
