package practice1;

public class Main {
    public static void main(String[] args) {
        SimpleApplicationContext context = new SimpleApplicationContext();

        // 지시사항 4번을 참고하여 코드를 작성하세요.

        //1. UserService 빈을 등록한다.
        context.registerBean("name", new UserService());

        //2. 이것을 가져와서 사용자이름을 출력한다.
        Service service = (Service)context.getBean("name");
        String username = service.getUserName();
        System.out.println(username);

    }
}
