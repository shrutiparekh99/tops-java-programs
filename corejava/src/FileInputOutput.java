import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputOutput {

	public static void main(String[] args)throws Exception {
		FileOutputStream fos=new FileOutputStream("tops1.txt");
		String s="This is file input/output demo";
				byte b[]=s.getBytes();
				fos.write(b);
				fos.flush();
				fos.close();
				System.out.println("File Written successfully");
				
				FileInputStream fis=new FileInputStream("tops.txt");
				int i;
				while((i=fis.read())!=-1);
				{
					System.out.println((char)i);
					
				}
				fis.close();
					
	}

}
