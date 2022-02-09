import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) {
		//String pathName = "";
		//File file = new File(pathName);
		try {
            BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\LIUS319\\Desktop\\TEST - Copy\\票历史状态记录表数据.txt"));
            String str;
            
            int fileFlag = 1;
            String writeFileName = "C:\\Users\\LIUS319\\Desktop\\TEST - Copy\\write"+fileFlag+".txt";
            File file = null;
            file = new File(writeFileName);
            if(!file.exists()) {
            	file.createNewFile();
            }
            FileWriter fw = null;
            BufferedWriter bw = null;
            fw = new FileWriter(file.getAbsoluteFile());
            bw = new BufferedWriter(fw);
            int flag = 1;
            while ((str = in.readLine()) != null) {
            	String[] tmp = str.split("\t");
            	String a = "<row ContactID=\"" + tmp[0] + "\" count=\"" + tmp[1] +"\"/>"+"\n";
                //System.out.println(a);
                
                
                
                bw.write(a);
                flag ++;
                /*if(flag%1000000 == 0) {
                	bw.close();
                	fileFlag ++;
                	writeFileName = "C:\\Users\\LIUS319\\Desktop\\TEST - Copy\\write"+fileFlag+".txt";
                	file = new File(writeFileName);
                	fw = new FileWriter(file.getAbsoluteFile());
                    bw = new BufferedWriter(fw);
                }*/
            }
            bw.close();
//            System.out.println(str);
        } catch (IOException e) {
        	
        }
		
	}
}
