package me.dio.academia.digital.repository;

import me.dio.academia.digital.entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {

    /**
     *
     * @param dateOfBirth: students' date of birth
     * @return List<Aluno>: list of all students with date of birth passed with method parameter
     */
    List<Aluno> findByDataDeNascimento(LocalDate dateOfBirth);
}
