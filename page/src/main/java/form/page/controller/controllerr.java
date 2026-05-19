package form.page.controller;

import form.page.dto.ContactResponseDto;
import form.page.dto.Dto;
import form.page.service.Servicee;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class controllerr {
    private final Servicee serv;
    public controllerr(Servicee serv){
        this.serv=serv;
    }
    @GetMapping("/contact")
    public List<ContactResponseDto> get(){
        return serv.get();
    }
    @PostMapping("/contact")
    public String pp(@Valid @RequestBody Dto dto){
        return serv.post(dto);
    }
    @GetMapping("/contact/{id}")
    public ContactResponseDto getbyid(@Valid @PathVariable Long id){
        return serv.getid(id);
    }
    @DeleteMapping("/contact/{id}")
    public String del(@PathVariable Long id){
        return serv.delete(id);
    }
    @PutMapping ("/contact/{id}")
    public String update(@PathVariable Long id,@RequestBody Dto dto){
        return serv.update(id,dto);
    }
}
