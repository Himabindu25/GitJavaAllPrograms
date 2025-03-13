import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;


public class JavaFileOutputStreamExample {

	public static void main(String[] args) {
		        
		 try {
		 FileOutputStream fos=new FileOutputStream("/Users/himabindu/desktop/JavaCode/JavaPractice/Text.txt");
		        
		        
		        String str="Learn Java Programming.";
		        
		        byte b[]=str.getBytes();
		        /*for(byte x:b)
		         *    fos.write(x);
		         *    
		         *fos.write(b);    
		         */
		        fos.write(b,6,str.length()-11);
		        
		        fos.close();
		        
		        }
		        catch(FileNotFoundException e)
		        {
		            System.out.println(e);
		        }
		        catch(IOException e)
		        {
		            System.out.println(e);
		        }
		 
		 try {
			 FileInputStream fis=new FileInputStream("/Users/himabindu/desktop/JavaCode/JavaPractice/Text.txt");
			        
			      byte[] b = new byte[fis.available()];
			      
			      for(byte x:b)
			          System.out.print((char)fis.read());
			      
			      /*String str = new String(b);
			      
			      System.out.println(str);*/
			      
			      fis.close();
			        
			        }
			        catch(FileNotFoundException e)
			        {
			            System.out.println(e);
			        }
			        catch(IOException e)
			        {
			            System.out.println(e);
			        }
		 
		 try {
			 FileWriter fw=new FileWriter("/Users/himabindu/desktop/JavaCode/JavaPractice/TextW.txt");
			        
			        
			        String str="Learn Java Programming.";
			        
			        fw.write(str);
			        
			        fw.close();
			        
			        }
			        catch(FileNotFoundException e)
			        {
			            System.out.println(e);
			        }
			        catch(IOException e)
			        {
			            System.out.println(e);
			        }
			 
			 try {
				 FileReader fr=new FileReader("/Users/himabindu/desktop/JavaCode/JavaPractice/TextW.txt");
				      
				 int x;
				      while((x = fr.read())!=-1)
				      {
				    	  System.out.print((char)x);
				      }
				       fr.close();
				        
				        }
				        catch(FileNotFoundException e)
				        {
				            System.out.println(e);
				        }
				        catch(IOException e)
				        {
				            System.out.println(e);
				        }
		    }
		    
	}
