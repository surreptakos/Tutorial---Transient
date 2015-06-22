import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjects {

	public static void main(String args[]) {
		System.out.println("Writing objects...");

		Person person = new Person(7, "Bob");

		try (ObjectOutputStream os = new ObjectOutputStream(
				new FileOutputStream("test.ser"))) {

			Person.setCount(88);
			os.writeObject(person);

		} catch (FileNotFoundException e) {
			// can't create file
			e.printStackTrace();
		} catch (IOException e) {
			// can't write to file
			e.printStackTrace();
		}
	}
}