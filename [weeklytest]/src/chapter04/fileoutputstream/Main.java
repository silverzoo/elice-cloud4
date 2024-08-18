package chapter04.fileoutputstream;

import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String projectRootPath = System.getProperty("user.dir");
        String projectPath = "/weeklytest/src/chapter4/fileoutputstream";
        String inputData = "I hate test!";

        // 지시 사항에 따라 코드를 입력해 보세요.
        try {
            FileOutputStream fos = null;
            fos = new FileOutputStream(STR."\{projectRootPath}\{projectPath}/Test.txt");
            fos.write(inputData.getBytes());
            fos.close();
            System.out.println("파일에 데이터가 성공적으로 입력되었습니다.");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}