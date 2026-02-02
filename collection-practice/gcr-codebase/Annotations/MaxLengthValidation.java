import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface MaxLength {
    int value();
}

class User {

    @MaxLength(10)
    private String username;

    public User(String username) {

        // Validate using Reflection
        for (var field : this.getClass().getDeclaredFields()) {

            if (field.isAnnotationPresent(MaxLength.class)) {

                MaxLength max = field.getAnnotation(MaxLength.class);

                if (username.length() > max.value()) {
                    throw new IllegalArgumentException(
                        "Username length must not exceed " + max.value()
                    );
                }
            }
        }

        this.username = username;
    }
}

public class MaxLengthValidation {

	public static void main(String[] args) {
		new User("harsh");
        new User("harshdeep123");

	}

}
