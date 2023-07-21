public class Main {
    public static void main(String[] args) {
        Animal [] animals={
             new Cow(20, 30,"male", "bora"),
                new Cow( 21,31,"female", "bora2"),
                new Sheep(10, 5,"male", "biki"),
                new Sheep(11, 6,"male", "biki2"),
                new Horse(15, 7,"male", "biki2","white"),
                new Horse(16, 8,"male", "biki2","black")

        };
        for (Animal animal : animals){
            System.out.println(animal instanceof  Cow);
        }
    }
}