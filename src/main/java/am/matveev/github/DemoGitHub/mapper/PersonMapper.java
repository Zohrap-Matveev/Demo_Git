package am.matveev.github.DemoGitHub.mapper;

import am.matveev.github.DemoGitHub.dto.PersonDTO;
import am.matveev.github.DemoGitHub.entity.PersonEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PersonMapper{

    PersonEntity toEntity(PersonDTO personDTO);
    PersonDTO toDTO (PersonEntity person);
}
