package form.page.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class Dto {
    @NotBlank(message="Name cannot be empty")
    private String name;
    @NotBlank(message="email cannot be empty")
    @Email(message="Must contains Email")
    private String email;
    @Pattern(regexp="^[0-9]{10}$",message="Phone must contains 10 digits")
    private String phone;
@NotBlank(message = "Subject cannot be empty")
private String subject;
    public Dto() {
    }

    public Dto(String name, String email, String phone,String subject) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.subject=subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
