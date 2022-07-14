package br.com.cadastro.curso.repositories;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.cadastro.curso.entities.Curso;

@Repository("CursoRepository")
public interface CursoRepository  extends JpaRepository<Curso, Integer> {
	
	@Query(value = "from Curso c where c.dataAbertura BETWEEN :startDate AND :endDate")
    public List<Curso> getAllBetweenDates(@Param("startDate")LocalDate startDate,@Param("endDate")LocalDate endDate);
	
	/**/

}
