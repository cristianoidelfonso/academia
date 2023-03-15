package me.dio.academia.digital.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.dio.academia.digital.entity.Aluno;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoFisicaForm {

  private Long alunoId;

  private double peso;

  private double altura;
}
