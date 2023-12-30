package am.matveev.github.DemoGitHub.service;

import am.matveev.github.DemoGitHub.dto.PersonDTO;
import am.matveev.github.DemoGitHub.entity.PersonEntity;
import am.matveev.github.DemoGitHub.exception.PersonNotFoundException;
import am.matveev.github.DemoGitHub.mapper.PersonMapper;
import am.matveev.github.DemoGitHub.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class PersonService{

    private final PersonRepository personRepository;
    private final PersonMapper personMapper;

    @Transactional(readOnly = true)
    public List<PersonDTO> findAll(){
        List<PersonEntity> people = personRepository.findAll();
        List<PersonDTO> personDTOS = people.stream()
                .map(personMapper::toDTO)
                .collect(Collectors.toList());
        return personDTOS;
    }

    @Transactional(readOnly = true)
    public PersonDTO findOne(long id){
        PersonEntity person = personRepository.findById(id)
                .orElseThrow(PersonNotFoundException :: new);
        PersonDTO personDTO = personMapper.toDTO(person);
        return personDTO;
    }
}
