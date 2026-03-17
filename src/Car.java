public class Car {
    String model;
    public Car(String model) {
        this.model=model;
    }
    //nested class
        public static class Engine {
        int horsepower;
        public Engine(int horsepower){
            this.horsepower=horsepower;
        }
        @Override
        public String toString(){
            return "Engine with" + horsepower + "horsepower";
        }
    }
    public Engine spec(int horsepower){
        return new Engine(horsepower);
    }

}
