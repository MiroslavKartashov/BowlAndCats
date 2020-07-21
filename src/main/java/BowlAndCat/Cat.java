package BowlAndCat;

public class Cat {

    private String name;
    private int appetite;
    private boolean isFull;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.isFull = false;
    }
    @Override
    public String toString() {
        return "Кот: " + name + " | Голод: " + appetite + "| Сытый: " + isFull;
    }

   public void eat(Plate plate) {
       if (plate.getFood() > appetite) {
           plate.decreaseFood(appetite);
           isFull = true;
       }
    }
}