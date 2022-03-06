package vererbung1;

public class Dog extends Animal{

    public Dog(String color){
        this.color = color;
    }

    public void bark(){
        System.out.print("\nWau Wau");
    }
}
