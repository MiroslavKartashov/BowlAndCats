package BowlAndCat;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return "В миске: " + food + "корма";
    }
        public void info () {
            System.out.println("В миске  " + food + " корма");
        }

        public void decreaseFood ( int appetite){
            if (food >= appetite) {
                food -= appetite;
             } else
                 food = 0;
        }

       public int getFood () {
            return food;
        }

       public void getPutFood ( int amount){
            food += amount;
        }

    }
