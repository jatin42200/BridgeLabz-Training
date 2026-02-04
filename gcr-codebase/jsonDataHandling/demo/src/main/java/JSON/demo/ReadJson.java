package JSON.demo;
import java.io.File;
import com.fasterxml.jackson.databind.ObjectMapper;

class User{
	public String name;
	public String email;
	public int age;
	public String city;
	
}

public class ReadJson {

	public static void main(String[] args) {
		try {
			ObjectMapper obj = new ObjectMapper();
			User user = obj.readValue(new File("C:\\Users\\dimpl\\Desktop\\BridgeLabz-Training\\io-programming-practice\\gcr-codebase\\jsonDataHandling\\demo\\src\\main\\java\\user.json"),
					User.class);
			System.out.println("User Name: "+user.name);
			System.out.println("User email: "+user.email);
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
