import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyClass2 {

	public static void main(String[] args ) {
		
		FileReader fileR = null; // Declare variable of type FileReader that hold file reader object
		try {
			fileR = new FileReader("markah.txt"); // Create fileR object
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); // Print stack trace of the exception
		}
		
		try {
			fileR.read(); // Invoke read() method on fileR object to read the file
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); // Print stack trace of the exception
		} // 
	}
}
