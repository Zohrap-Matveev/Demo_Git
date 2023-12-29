package am.matveev.github.DemoGitHub.repository;

import am.matveev.github.DemoGitHub.entity.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<PersonEntity,Long>{
}
