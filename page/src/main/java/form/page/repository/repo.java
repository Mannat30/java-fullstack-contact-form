package form.page.repository;

import form.page.entity.Form;
import org.springframework.data.jpa.repository.JpaRepository;

public interface repo extends JpaRepository<Form,Long> {
}
