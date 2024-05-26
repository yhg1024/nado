package chap_13;

import java.io.File;

public class _07_DeleteFile {
    public static void main(String[] args) {
        File file = new File("goodjob.txt");
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("파일 삭제 성공 : " + file.getName());
            } else {
                System.out.println("파일 삭제 실패 : " + file.getName());
            }
        }

        File folder = new File("A");
        if (folder.exists()) {
            if (folder.delete()) {
                System.out.println("폴더 삭제 성공 : " + folder.getAbsolutePath());
            } else {
                System.out.println("폴더 삭제 실패 : " + folder.getAbsolutePath());
            }
        }

        if (deleteFolder(folder)) {
            System.out.println("*폴더 삭제 성공 : " + folder.getAbsolutePath());
        } else {
            System.out.println("*폴더 삭제 실패 : " +folder.getAbsolutePath());
        }
    }


    // deleteFolder(A)
    // listFiles로 B확인
    //      deleteFolder(B) 실행
    //      listFiles로 C 확인
    //          deleteFolder(C) 실행
    //          C안에는 아무런 파일이나 폴더가 없음 for문 종료
    //          C.delete() 삭제
    //      B.delete() 삭제
    // A.delete() 삭제
    public static boolean deleteFolder(File folder) {
        // 재귀 호출, 하위 폴더 확인하기위해 계속 호출
        if (folder.isDirectory()) {
            for (File file : folder.listFiles()) {
                deleteFolder(file);
            }
        }
        System.out.println("삭제 대상 : " + folder.getAbsolutePath());
        return folder.delete();
    }
}
