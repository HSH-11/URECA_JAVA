package Course4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		//File 객체 생성
		
//		File dir = new File("C:/Temp/images");
//		System.out.println(dir.exists());
//		if( ! dir.exists()) {
//			dir.mkdir();
//		}
//		//file
//		File file = new File("C:/Temp/myFile.txt");
//		System.out.println(dir.exists());
//		if( ! dir.exists()) {
//			file.createNewFile();
//		}
		//file write(Text-char기반)
//		{
//			File file = new File("C:/Temp/myFile.txt");
////			try {
////				FileWriter fw = new FileWriter(file);
////			}catch(IOException e) {
////				e.printStackTrace();
////			}
//			//Try-Resource
//			try(FileWriter fw = new FileWriter(file); ){
//				fw.write("안녕하세요!");
//			}catch(IOException e) {
//				e.printStackTrace();
//			}
//		}
//		{ file read (char)기반
//			File file  = new File("C:/Temp/myFile.txt");
//			
//			try (FileReader fr = new FileReader(file);){
//				int ch;
//				StringBuilder sb = new StringBuilder();
//				
//				while( (ch = fr.read()) != -1) {
//					sb.append( (char) ch); //정수를 문자로 변환
//				}
//				System.out.println(sb);
//			}catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
		
		//file copy (binary 기반 image)
		{	
			String dir = "C:"+ File.separator + "Temp";
			String srcFilename = "profile.jpg" ;
			String tgtFilename = "copy_profile.jpg";
			File src = new File(dir,srcFilename);
			File tgt = new File(dir,tgtFilename);
			
			try (
					FileInputStream fis  = new FileInputStream(src);
					FileOutputStream fos = new FileOutputStream(tgt);
			){
				int read;
				while( (read = fis.read()) != -1) {
					fos.write(read);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
