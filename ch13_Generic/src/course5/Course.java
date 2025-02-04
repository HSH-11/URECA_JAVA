package course5;

//Course의 메서드가 파라미터를 갖는데 그 파라미터 타입이 generic 타입을 가진다.
public class Course {
    public static void registerCourse1(Applicant<?> applicant) {
        System.out.println(applicant.kind);
    }
    
    public static void registerCourse2(Applicant<? extends Student> applicant) {
            
        }
    
    public static void registerCourse3(Applicant<? super Worker> applicant) {
        
    }
}
