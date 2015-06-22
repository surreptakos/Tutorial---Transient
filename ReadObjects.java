import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

// Good for implementing a "saving" feature
public class ReadObjects {

	public static void main(String args[]) {
		System.out.println("Reading objects...");

		try (ObjectInputStream is = new ObjectInputStream(new FileInputStream(
				"test.ser"))) {

			Person person = (Person) is.readObject();

			System.out.println(person);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}