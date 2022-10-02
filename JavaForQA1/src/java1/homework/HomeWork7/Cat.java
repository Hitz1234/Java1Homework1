package java1.homework.HomeWork7;

public class Cat {
    public String name;
    public int appetite;
    public boolean fullness;
    public Cat(String name, int appetite, boolean fullness){
        this.appetite = appetite;
        this.name = name;
        this.fullness = fullness;
    }
    public void eat(Plate plate){
        plate.decreaseFood(appetite);
    }
}
