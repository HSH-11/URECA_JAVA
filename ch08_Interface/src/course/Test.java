package course;

public class Test {
	public static void main(String[] args) {
//		{
//		IFC ifc = new IFImpl(); //implements IFC O
//		IFC ifc2 = new IFImpl(); //implements IFB이면 mc()에 대한 오류 발생
//		
//		ifc.ma();
//		IFA ifa = new IFImpl(); //가능 A는 C의 상위 클래스이므로 
//		ifa.ma();
//		}
		
		{
			IFB ifb = new IFImpl();
			ifb.ma();
			ifb.mb();
//			ifb.mc(); 불가 IFImpl은 extends IFB이기 때문
			IFA ifa = new IFImpl();
			ifa.ma();
//			ifa.mb(); 타입이 IFA이므로 ma()메서드에만 접근 가능
		}
	}
}
