package practice2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String projectRootPath = System.getProperty("user.dir");
        String projectPath = "/[ch0401]io/src/practice2";

        String sourceFilePath = STR."\{projectRootPath}\{projectPath}/image.png";
        String destinationFilePath = STR."\{projectRootPath}\{projectPath}/copied-image.png";


        // 지시 사항을 참고하여 코드를 작성해 보세요.
        //try with resource 방식: try(괄호안에는 사용할 리소스)
        //try(FileInputStream fis = new FileInputStream(sourceFilePath)) {
        try {
            FileInputStream fis = new FileInputStream(sourceFilePath);
            FileOutputStream fos = new FileOutputStream(destinationFilePath);

            //가져오기
            byte[] buffer = new byte[1024];
            int i;

            //붙여넣기
            while((i = fis.read(buffer)) != -1) {
                //write(버퍼위치,시작,끝)
                fos.write(buffer, 0, i);
            }
            System.out.println("이미지 복사 완료되었습니다.");

        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}

