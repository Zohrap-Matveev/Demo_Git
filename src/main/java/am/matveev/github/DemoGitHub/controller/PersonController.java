package am.matveev.github.DemoGitHub.controller;

import am.matveev.github.DemoGitHub.dto.PersonDTO;
import am.matveev.github.DemoGitHub.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/person")
@RestController
public class PersonController{

    private final PersonService personService;

    @GetMapping("/all")
    public List<PersonDTO> findAll(){
        return personService.findAll();
    }

    @GetMapping("/{id}")
    public PersonDTO findOne(@PathVariable long id){
       return personService.findOne(id);
    }
}
