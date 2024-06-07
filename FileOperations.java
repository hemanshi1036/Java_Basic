import java.io.*;

public class FileOperations {
    public static void main(String[] args){
        
        //Info of the file:

        // File f = new File("D:\\Hemanshi\\1.txt");
        // if(f.exists()){
        //     System.out.println("File Name : " +f.getName());
        //     System.out.println("File Location : " +f.getAbsolutePath());
        //     System.out.println("File Readable : " +f.canRead());
        //     System.out.println("File Writeble : " +f.canWrite());
        //     System.out.println("File size : " +f.length());
            
        // }
        // else{
        //     System.out.println("File does not exists....");
        // }
            // try{
            //     FileWriter f = new FileWriter("D:\\Hemanshi\\1.txt");
            //     try{
            //         f.write("Hemanshi is the best coder.....");

            //     }
            //     finally{
            //         f.close();
            //     }
            //     System.out.println("Successfully wrote in file....");
            // }
            // catch(IOException e){
            //     System.out.println(e);
            // }


            try{
                FileOutputStream f = new FileOutputStream("D:\\Hemanshi\\1.txt");
                try{
                    f.write(65);
                    f.write(98);
                    f.write(3);
                    String s="Welcome to javaTpoint.";    
                    byte b[]=s.getBytes();//converting string into byte array    

                    f.write(b);
                }
                finally{
                    f.close();
                }
                System.out.println("Successfully wrote in file....");
            }
            catch(IOException e){
                System.out.println(e);
            }

            try{
              FileInputStream fin=new FileInputStream("D:\\Hemanshi\\1.txt");    
            //   int i=fin.read();   (these can read only one character)
            //     System.out.print((char)i);  

            int i=0;    
            while((i=fin.read())!=-1){    
             System.out.print((char)i);   // (these can read whole file)
            }    
            fin.close();    
            
                
            }
            catch(IOException e){
                System.out.println(e);
            }




    }
}
