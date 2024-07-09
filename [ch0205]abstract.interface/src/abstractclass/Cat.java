package abstractclass;

public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("Cat is eating.");
    }
    //abstract 메서드를 모두 오버라이딩하지 않으면 컴파일 오류가 난다
}
