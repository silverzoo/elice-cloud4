package practice3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String projectRootPath = System.getProperty("user.dir");
        String projectPath = "/[ch0401]io/src/practice3";

        String inputFilename = STR."\{projectRootPath}\{projectPath}/Hello.txt";
        System.out.println("파일 내용: " + readFileContent(inputFilename));
    }

    public static String readFileContent(String inputFilename) {
        // 지시 사항에 따라 코드를 작성해 보세요.
        StringBuilder sb = new StringBuilder();

        try(FileInputStream fis = new FileInputStream(inputFilename)) {
            int bytedata;
            while((bytedata = fis.read()) != -1) {
                sb.append((char)bytedata);
            }

        } catch(FileNotFoundException e) {
            e.printStackTrace();
            return "파일을 찾을 수 없습니다.";

        } catch(IOException e) {
            e.printStackTrace();
            return "파일 읽기 중 오류가 발생했습니다.";
        }

        return sb.toString();
    }
}


