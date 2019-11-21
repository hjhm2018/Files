import java.io.File;

public class DeleteFile {
	
	public static void main(String[] args) {
		try { 
	         File file = new File("C:\\Users\\Henry\\Desktop\\Java\\JavaCICCC\\Files\\src\\new.txt");
	         if(file.delete()) { 
	            System.out.println(file.getName() + " is deleted!");
	         } else {
	            System.out.println("Delete operation is failed.");
	    		}
	      } catch(Exception e) {
	         e.printStackTrace();
	      }
	}

}
