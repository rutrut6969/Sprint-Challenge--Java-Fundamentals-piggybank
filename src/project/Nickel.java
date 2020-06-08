package project;

public class Nickel extends AbstractMoney{
    private double faceValue;
    private double totalGroupAmount;
    private String type;

    public Nickel (int coins){
        super(coins);
        this.type = "Nickel";
        this.faceValue = 0.05;
        this.totalGroupAmount = faceValue * coins;
    }

    @Override
    public double getTotal(){
        return this.totalGroupAmount;
    }

    public void addNickels(int coins){
        this.coins += coins;
    }

    public int getCoins(){
        return this.coins;
    }

    @Override
    public String getType(){
        return this.type;
    }
}