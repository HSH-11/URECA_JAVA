package course2;

import java.io.FileNotFoundException;

public class Test2 {
    public static void main(String[] args) {
        // throws RuntimeException(Unchecked) 계열과 Checked Exception 계열
//      {
//          m1();
//          m2();
//          m3(); // Unchecked Exception
//      }
        
        // 복수개의 예외 처리
        {
            
            try {
                m1();
                m2();               
            }catch(ClassNotFoundException | FileNotFoundException e) {
                // 처리 코드
            }
            
            
//          try {
//              m1();
//              m2();               
//          }catch(Exception e) { 항상 상위 클래스 인 Exception 클래스에만 걸리게 됨
//              // 처리 코드
//          }catch(FileNotFoundException e) { // 오류 발생
//              // 처리 코드
//          }
        }
    }
    
    static void m1() throws ClassNotFoundException{
        
    }
    
    static void m2() throws FileNotFoundException{
        
    }
    
    static void m3() throws NullPointerException{
        
    }
}