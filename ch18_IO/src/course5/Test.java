package course5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {
	//객체 직렬화
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		Myclass mc = new Myclass();
		mc.n =10;
		mc.str = "Hello";
		
		//직렬화
		FileOutputStream fos = new FileOutputStream("Myclass.dat");
		//보조 스트림
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(mc);
		
		//역직렬화
		FileInputStream fis = new FileInputStream("Myclass.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		mc = (Myclass) ois.readObject();
		
		System.out.println(mc.n);
		System.out.println(mc.str);
		System.out.println(mc.ssn); //null 직렬화 과정에서 제외 되었기 때문
		
	}

}
