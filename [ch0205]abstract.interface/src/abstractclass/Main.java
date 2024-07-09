package abstractclass;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Animal cat = new Cat(); //다형성 적용
        // Animal animal = new Animal(); //추상클래스는 인스턴스를 생성할 수 X
        Animal2 animal = new Animal2();
        Animal2 cat2 = new Cat2();

        dog.eat();
        cat.eat();

        animal.eat();
        cat2.eat();
    }
}
