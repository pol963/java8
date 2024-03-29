package ch08;

import java.io.File;

public class ExceptionMethod01 {
    public static void main(String[] args) {
        try {
            File f = createFile("test.txt");
            System.out.println(f.getName() + " 파일이 성공적으로 만들어 졋습니다.");
        }catch (Exception e) {
            System.out.println(e.getMessage() + " 다시 입력해주시길 바랍니다.");
        }
    } //main

    static File createFile(String fileName) throws Exception{

        if(fileName == null || fileName.equals(""))
            throw new Exception("파일이름이 유효하지 않습니다.");

        File f = new File(fileName);
        f.createNewFile();
        return  f;

    }

}
