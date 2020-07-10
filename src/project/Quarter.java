package project;

public class Quarter extends AbstractMoney {
    private double faceValue;
    private double totalGroupAmount;
    private String type;

    public Quarter() {
        super();
        this.type = "Quarter";
        this.faceValue = 0.25;
        this.totalGroupAmount = faceValue;
    }

    public Quarter(int coins) {
        super(coins);
        this.type = "Quarter";
        this.faceValue = 0.25;
        this.totalGroupAmount = faceValue * coins;
    }

    @Override
    public double getTotal() {
        return this.totalGroupAmount;
    }

    public void addQuarters(int coins) {
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