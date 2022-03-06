package vererbung1;

public class Program {

    public static void main(String[] args) {
        Dog dog = new Dog("Schwarz");
        dog.bark();
        System.out.println(dog.color);

        Cat cat = new Cat();
        cat.purr();

        //Test for git


    }
}