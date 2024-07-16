package practice4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String projectRootPath = System.getProperty("user.dir");
        String projectPath = "/[ch0401]io/src/practice4";
        String filePath = STR."\{projectRootPath}\{projectPath}/Hello.txt";

        long startTime1 = System.nanoTime();

        //byte 단위로 읽는 방식
        try (FileReader fileReader = new FileReader(filePath)) {
            int data;
            while ((data = fileReader.read()) != -1) {
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        long endTime1 = System.nanoTime();
        System.out.println("FileReader 수행 시간: " + (endTime1 - startTime1) + "ns");

        long startTime2 = System.nanoTime();

        //한 줄씩 읽는 방식. 파일을 효율적으로 읽는 버퍼링 기능.
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while((line = br.readLine()) != null) {
            }
        } catch(IOException e) {
            e.printStackTrace();
        }

        long endTime2 = System.nanoTime();
        System.out.println("BufferedReader 수행 시간: " + (endTime2 - startTime2) + "ns");
    }
}