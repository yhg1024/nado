package chap_13;

import java.io.File;

public class _05_FileAndFolder {
    public static void main(String[] args) {
        // String folder = "."; // . : 현재 위치 상대 경로
        // String folder = "C:\\Users\\Bear\\github\\nado\\src\\chap_13"; // . : 현재 위치 절대 경로
        String folder = "src/chap_13"; // . : 상대 경로
        File filesAndFolders = new File(folder);
        System.out.println("현재 폴더 경로 : " + filesAndFolders.getAbsoluteFile());
        for (File file : filesAndFolders.listFiles()) {
            if (file.isFile()) {
                System.out.println("(파일) " + file.getName());
            } else if (file.isDirectory()) {
                System.out.println("(폴더) " + file.getName());
            }
        }

    }
}
