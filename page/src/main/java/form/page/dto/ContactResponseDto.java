package form.page.dto;

public class ContactResponseDto {
    private Long id;
    private String name;
    private String phone;
    private String subject;
    private String status;

    private String email;

    public ContactResponseDto() {
    }

    public ContactResponseDto(Long id, String name, String phone, String subject, String status, String email) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.subject = subject;
        this.status = status;

        this.email=email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

//.course = course;


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
