package project;

public class Penny extends AbstractMoney {
    private double faceValue;
    private double totalGroupAmount;
    private String type;

    public Penny(int coins) {
        super(coins);
        this.type = "Penny";
        this.faceValue = 0.01;
        this.totalGroupAmount = faceValue * coins;
    }

    @Override
    public double getTotal() {
        return this.totalGroupAmount;
    }

    public void addPennies(int coins) {
        this.coins += coins;
    }

    public int getCoins() {
        return this.coins;
    }

    @Override
    public String getType() {
        return this.type;
    }

}