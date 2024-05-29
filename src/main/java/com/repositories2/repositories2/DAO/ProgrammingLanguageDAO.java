package com.repositories2.repositories2.DAO;

import com.repositories2.repositories2.entities.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path =  "repo-prog-languages")
public interface ProgrammingLanguageDAO extends JpaRepository<ProgrammingLanguage, Long> {
}
