package me.dio.academia.digital.repository;

import me.dio.academia.digital.entity.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, Long> {
    /**
     *
     * @param bairro: bairro referencia para o filtro
     * @return List<Matricula>: lista de alunos matriculados que residem no bairro passado como parâmetro para o método
     */

    @Query(value = "SELECT * FROM tb_matriculas AS m INNER JOIN tb_alunos AS a ON m.aluno_id = a.id WHERE a.bairro = :bairro", nativeQuery = true)
//    @Query("FROM Matricula m WHERE m.aluno.bairro = :bairro")
    List<Matricula> findByAlunosMatriculadosBairro(String bairro);


//    List<Matricula> findByAlunoBairro(String bairro);

}
