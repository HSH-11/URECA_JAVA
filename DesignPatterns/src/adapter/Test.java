package adapter;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LegacyFunc legacyFunc = new LegacyFuncImpl();
		System.out.println(legacyFunc.calc(10));
		
		// 새로운 function을 위 LegacyFunc를 받아서 변형하는 Adapter 객체
		LegacyFuncAdapter legacyFuncAdapter = new LegacyFuncAdapterImpl(legacyFunc);
		System.out.println(legacyFuncAdapter.calc(10));
	}

}
