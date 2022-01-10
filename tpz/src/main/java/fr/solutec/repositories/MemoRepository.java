package fr.solutec.repositories;

import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Memo;

public interface MemoRepository extends CrudRepository<Memo, Long>{

}
