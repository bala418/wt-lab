import java.util.regex.*;

public class q4 {
    static void print(Object o) {
        System.out.println(o);
    }

    static class JobApplication {
        String name;
        String email;
        String password;

        JobApplication(String name, String email, String password) {
            this.name = name;
            this.email = email;
            this.password = password;
        }

        boolean validateEmail() {
            return Pattern.matches("^(.+)@(.+)$", email);
        }

        boolean validatePassword() {
            String regex = "^[a-zA-Z0-9]+$";
            return Pattern.matches(regex, password);
        }

        boolean validateName() {
            // ends with _job
            return Pattern.matches("^.+_job$", name);
        }

    }

    public static void main(String[] args) {
        JobApplication ja = new JobApplication("abc_job", "abc@mail.com", "abc123");
        if (ja.validateEmail() && ja.validatePassword() && ja.validateName()) {
            print("Valid details");
        } else {
            print("Invalid details");
        }

    }
}
