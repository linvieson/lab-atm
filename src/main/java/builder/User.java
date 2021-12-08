package builder;

import lombok.Builder;
import lombok.Getter;
import lombok.Singular;
import lombok.ToString;

import java.util.List;

@Builder @Getter @ToString
public class User {
    private String firstName;
    private String lastName;
    private String gender;
    private int age;

    @Singular //value = "occupation"
    private List<String> occupations;
}
