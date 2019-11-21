import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class NameGenerator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BufferedReader reader;
		BufferedReader reader2;
		
		FileWriter writer;  
	    BufferedWriter buffer;  
	    
		try {
			//The files you want to read
			reader = new BufferedReader(new FileReader(
					"C:\\Users\\Henry\\Desktop\\Java\\Program_00_Bootstrap\\src\\new.txt"));
			reader2 = new BufferedReader(new FileReader(
					"C:\\Users\\Henry\\Desktop\\Java\\Program_00_Bootstrap\\src\\new2.txt"));
			
			//The file that will be created
			writer = new FileWriter("C:\\Users\\Henry\\Desktop\\Java\\Program_00_Bootstrap\\src\\textout.txt");
			buffer = new BufferedWriter(writer);
			
			//The lines that are to going to be read
			String line = reader.readLine();
			String line2 = reader2.readLine();
			while (line != null && line2 != null) {
				//System.out.println(line);
				buffer.write(line+ "       " + line2 + "\n");
				// read next line
				line = reader.readLine();
				line2 = reader2.readLine();
			}
			reader.close();
			reader2.close();
			buffer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
