package form.page.service;

import form.page.dto.ContactResponseDto;
import form.page.dto.Dto;
import form.page.entity.Form;
import form.page.repository.repo;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class Servicee {
   private final repo rep;
   public Servicee(repo rep){
       this.rep=rep;
   }
    //get
    public List<ContactResponseDto> get(){
       List<Form>form=rep.findAll();
       return form.stream().map(s->new ContactResponseDto(s.getId(),s.getName(),s.getPhone(),s.getSubject(),s.getStatus(),s.getEmail())).toList();

    }
    //post
    //post
public String post(Dto dto) {
    Form form = new Form();
//       form.s
    form.setEmail(dto.getEmail());
    form.setName(dto.getName());
    form.setPhone(dto.getPhone());
    form.setSubject(dto.getSubject());
    form.setStatus("NEW");
    rep.save(form);
    return "data saved";
}
public ContactResponseDto getid(Long id) {
    Form form = rep.findById(id).orElseThrow();
    return new ContactResponseDto(
            form.getId(),
            form.getName(),
            form.getPhone(),
            form.getSubject(),
            form.getStatus(),
            form.getEmail()
    );
}
  public String update(Long id,Dto dto){
      Form form=rep.findById(id).orElseThrow();
      form.setName(dto.getName());
      form.setEmail(dto.getEmail());
      form.setPhone(dto.getPhone());
      form.setSubject(dto.getSubject());
      rep.save(form);
      return "Updated";
    }
    public String delete(Long id){

       rep.deleteById(id);
       return "Deleted";


    }
   }
    //


