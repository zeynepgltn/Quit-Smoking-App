public class CigarettePackage {

    private final int count;
    private final double price;

    public CigarettePackage(int count, double price) {
        this.count = count;
        this.price = price;
    }

    public double priceOfPiece(int count) {
        return this.unitPrice() * count;
    }

    public double unitPrice() {
        return (price / count);
    }

    public int getCount() {
        return count;
    }

    public double getPrice() {
        return price;
    }
}
