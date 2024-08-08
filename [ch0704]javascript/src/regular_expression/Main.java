package regular_expression;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
    public static void main(String[] args) {
        StringBuilder content = new StringBuilder();

        /*
        파일이 실제로 위치한 경로로 수정하세요. String filePath = {파일경로 입력}
        */
        String filePath = "/Users/bada/dev/elice/leeeunju-practice/[ch0704]javascript/src/regular_expression/LoremIpsum.txt";


        // 파일 읽기
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 읽어온 파일 내용을 문자열로 변환
        String text = content.toString();

        // 정규식 예제
        // 1. 임의의 단일 문자와 일치 (.)
        Pattern pattern1 = Pattern.compile("L.r.m");
        Matcher matcher1 = pattern1.matcher(text);
        while (matcher1.find()) {
            System.out.println("Pattern1 found: " + matcher1.group());
        }

        // 2. 문자열의 시작을 나타냄 (^)
        Pattern pattern2 = Pattern.compile("^Lorem");
        Matcher matcher2 = pattern2.matcher(text);
        if (matcher2.find()) {
            System.out.println("Pattern2 found at the start: " + matcher2.group());
        }

        // 3. 문자열의 끝을 나타냄 ($)
        Pattern pattern3 = Pattern.compile("Ipsum.$");
        Matcher matcher3 = pattern3.matcher(text);
        if (matcher3.find()) {
            System.out.println("Pattern3 found at the end: " + matcher3.group());
        }

        // 4. 0회 이상 반복 (*)
        Pattern pattern4 = Pattern.compile("dumm*y");
        Matcher matcher4 = pattern4.matcher(text);
        while (matcher4.find()) {
            System.out.println("Pattern4 found: " + matcher4.group());
        }

        // 5. 1회 이상 반복 (+)
        Pattern pattern5 = Pattern.compile("dumm+y");
        Matcher matcher5 = pattern5.matcher(text);
        while (matcher5.find()) {
            System.out.println("Pattern5 found: " + matcher5.group());
        }

        // 6. 0회 또는 1회 존재 (?)
        Pattern pattern6 = Pattern.compile("typesett?ing");
        Matcher matcher6 = pattern6.matcher(text);
        while (matcher6.find()) {
            System.out.println("Pattern6 found: " + matcher6.group());
        }

        // 7. 정확히 n번 반복 ({n})
        Pattern pattern7 = Pattern.compile("a{2}");
        Matcher matcher7 = pattern7.matcher(text);
        while (matcher7.find()) {
            System.out.println("Pattern7 found: " + matcher7.group());
        }

        // 8. n번 이상 반복 ({n,})
        Pattern pattern8 = Pattern.compile("a{2,}");
        Matcher matcher8 = pattern8.matcher(text);
        while (matcher8.find()) {
            System.out.println("Pattern8 found: " + matcher8.group());
        }

        // 9. n번 이상 m번 이하 반복 ({n,m})
        Pattern pattern9 = Pattern.compile("a{2,3}");
        Matcher matcher9 = pattern9.matcher(text);
        while (matcher9.find()) {
            System.out.println("Pattern9 found: " + matcher9.group());
        }

        // 10. 문자 집합 내의 한 문자와 일치 ([])
        Pattern pattern10 = Pattern.compile("[aeiou]");
        Matcher matcher10 = pattern10.matcher(text);
        while (matcher10.find()) {
            System.out.println("Pattern10 found: " + matcher10.group());
        }

        // 11. 문자 집합 내의 문자가 아닌 한 문자와 일치 ([^])
        Pattern pattern11 = Pattern.compile("[^Lorem]");
        Matcher matcher11 = pattern11.matcher(text);
        while (matcher11.find()) {
            System.out.println("Pattern11 found: " + matcher11.group());
        }

        // 12. 그룹화 또는 캡처 (()) -> 정규식이 아닌 조건 결과와 동일
        Pattern pattern12 = Pattern.compile("(Lorem Ipsum)");
        Matcher matcher12 = pattern12.matcher(text);
        while (matcher12.find()) {
            System.out.println("Pattern12 found: " + matcher12.group());
        }

        // 13. OR 연산자 (|)
        Pattern pattern13 = Pattern.compile("Lorem|Ipsum");
        Matcher matcher13 = pattern13.matcher(text);
        while (matcher13.find()) {
            System.out.println("Pattern13 found: " + matcher13.group());
        }

        // 14. 정규식 대소문자 구별해서 추출 ([a-z][A-Z])
        Pattern pattern14 = Pattern.compile("[a-z][A-Z]");
        Matcher matcher14 = pattern14.matcher(text);
        while (matcher14.find()) {
            System.out.println("Pattern14 found: " + matcher14.group());
        }
    }
}
