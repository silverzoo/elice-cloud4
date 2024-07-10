package practice2;

@FunctionalInterface
interface StringTransformer {
    // 지시사항을 참고하여 코드를 작성해 보세요.
    String transform(String str);
}

public class Main {
    // 지시사항을 참고하여 코드를 작성해 보세요.
    static String inputString = " Hello, Functional Interface! ";

    //public static StringTransformer toUpperCaseTransformer = (str) -> {return str.toUpperCase();};
    //public static StringTransformer toUpperCaseTransformer = (str) -> str.toUpperCase();
    public static StringTransformer toUpperCaseTransformer= String::toUpperCase;

    //public static StringTransformer removeSpacesTransformer = (str) -> str.replace(" ","");
    public static StringTransformer removeSpacesTransformer= str -> str.replace(" ", "");

    //public static StringTransformer addAsteriskTransformer = (str) -> "*" + str.trim() + "*";
    public static StringTransformer addAsteriskTransformer = str -> "*" + str.trim() + "*";
    //앞뒤공백을 제거해주는 함수 tirm()

    public static void main(String[] args) {


        System.out.println("대문자 변환 후: " + toUpperCaseTransformer.transform(inputString));
        System.out.println("공백 제거 후: " + removeSpacesTransformer.transform(inputString));
        System.out.println("\"*\" 기호 추가 후: " + addAsteriskTransformer.transform(inputString));
    }
}
