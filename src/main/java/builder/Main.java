package builder;

public class Main {
    public static void main(String[] args) {
        User user = User.builder()
                .firstName("A")
                .age(1)
                .lastName("lina")
                .occupation("UCU student")
                .occupation("CS student")
                .build();
        System.out.println(user);
    }
}
