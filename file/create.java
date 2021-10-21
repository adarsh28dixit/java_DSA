
package file;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class create {
    public static void main(String[] args) {
        File myfile = new File("newfile.txt");
        try{
            if(myfile.createNewFile()){
                System.out.println("file created :"+ myfile.getName());
                FileWriter fileWrite = new FileWriter("newfile.txt");
                fileWrite.write("my name is adarsh");
                fileWrite.close();
            }else{
                System.out.println("file already exist");
            }
        } catch(IOException e){
            System.out.println("an error occured");
        }
        
    }
}
