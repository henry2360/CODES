package chapterNine;

public class Vehicle {
        protected String brand = "Mercedes ";
        public void honk() {
            System.out.println("paaapaaa, paaapaaa!");
        }
    }

    class Car extends Vehicle {
        private final String modelName = "Benz";
        public static void main(String[] args) {
            Car myCar = new Car();
            myCar.honk();
            System.out.println(myCar.brand + " " + myCar.modelName);
        }
}



