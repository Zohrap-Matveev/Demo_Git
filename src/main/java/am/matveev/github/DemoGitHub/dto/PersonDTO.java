package am.matveev.github.DemoGitHub.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonDTO{

    @NotEmpty(message = "Name should not be empty.")
    private String name;

    @NotNull(message = "Age should be greater then zero.")
    private int age;
}
