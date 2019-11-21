import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Copy {
	static String file1;
	static String file2;

	static Copy instance;
	
	public Copy(String[] args) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// We are making a copy program

		instance = new Copy(args);

		if (args.length > 1) {
			file1 = args[0];
			file2 = args[1];

			FileReader aReader = null;
			FileWriter aWriter = null;

			try {
				aReader = new FileReader(file1);
				aWriter = new FileWriter(file2);
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				if (aReader != null) {
					if(aWriter != null) {
						int c;
						try {
							while((c = aReader.read()) != -1) {
								aWriter.write(c);
							}
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					
				} else {
					System.out.println("Unable to open file "+ file1);
				}
			}

		} else {
			System.out.println("Enter 2 files");
		}
	}
	
}

