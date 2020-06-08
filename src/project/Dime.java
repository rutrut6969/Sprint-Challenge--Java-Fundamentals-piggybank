package project;

public class Dime extends AbstractMoney{
    private double faceValue;
    private double totalGroupAmount;
    private String type;
    public Dime (int coins){
        super(coins);
        this.type = "Dime";
        this.faceValue = 0.10;
        this.totalGroupAmount = faceValue * coins;
    }

    @Override
    public double getTotal(){
        return this.totalGroupAmount;
    }

    public void addDimes(int coins){
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