package project;

public class Dollar extends AbstractMoney {
    private double faceValue;
    private double totalGroupAmount;
    private String type;

    public Dollar(int coins) {
        super(coins);
        this.type = "Dollar";
        this.faceValue = 1;
        this.totalGroupAmount = faceValue * coins;
    }

    @Override
    public double getTotal() {
        return this.totalGroupAmount;
    }

    public void addDollars(int coins) {
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