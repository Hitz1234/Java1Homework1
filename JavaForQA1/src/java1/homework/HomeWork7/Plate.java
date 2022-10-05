package java1.homework.HomeWork7;

public class Plate {
    public int foodAmount;

    public Plate (int foodAmount){
        this.foodAmount = foodAmount;
    }

    public void addFood(int amount){
        foodAmount += amount;
    }

    public void decreaseFood(int amount){
        foodAmount -= amount;
        if (amount < 0){

        }
    }

    public void info(){
        System.out.println("Всего еды: " + foodAmount);
    }
}
