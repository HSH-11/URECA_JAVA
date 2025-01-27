package ch05_ReferenceType;

public class ArrayCopyExample {
	public static void main(String[] args) {
		String[] oldStrArray = { "java", "array", "copy" };

		String[] newStrArray = new String[5];
		//배열 항목 복사
		System.arraycopy( oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		//원본 배열,원본 배열 복사 시작 인덱스,새 배열,새 배열 붙여넣기 시작 인덱스,복사 항목 수
		//배열 항목 출력
		for(int i=0; i<newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ", ");
			//java, array, copy, null, null,
		}
	}
}
