package project;

abstract class AbstractMoney{
    protected int coins;

    public AbstractMoney(){
        this.coins = 1;
    }

    public AbstractMoney(int coins){
        this.coins = coins;
    }

    abstract String getType();
    abstract double getTotal();
}