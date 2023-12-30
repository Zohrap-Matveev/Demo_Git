package am.matveev.github.DemoGitHub.controller;

import am.matveev.github.DemoGitHub.dto.PersonDTO;
import am.matveev.github.DemoGitHub.service.PersonService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping()
    public PersonDTO create(@RequestBody @Valid PersonDTO personDTO){
        return personService.create(personDTO);
    }
    @PutMapping("/{id}")
    public PersonDTO update(@PathVariable long id,@RequestBody @Valid PersonDTO personDTO){
        return personService.update(id,personDTO);
    }
}
