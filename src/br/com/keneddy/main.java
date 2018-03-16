
package br.com.keneddy;

import br.com.keneddy.objeto.Aluno;
import br.com.keneddy.objeto.Disciplina;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author keneddy.149317
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
       List<Disciplina> materias = new ArrayList();
       
       do {
          String nome;
          String departamento;
          char status;
          
          nome = JOptionPane.showInputDialog("Informe o nome da disciplina");
          departamento = JOptionPane.showInputDialog("Informe o departamento");
          status = JOptionPane.showInputDialog("Status: Ativo(A) - Intaivo(I)").charAt(0);
          materias.add(new Disciplina(nome, departamento, status));
           
       }while ((JOptionPane.showConfirmDialog(null, "Deseja Continuar?")) == 0);
         String disciplinasDisponiveis = "";
         
      for (Disciplina materia : materias) {
          disciplinasDisponiveis +="\n"+ materias.lastIndexOf(materia)+ " " + materia.getNome();
      }
      JOptionPane.showMessageDialog(null, disciplinasDisponiveis);
  
     List<Aluno> alunos = new ArrayList<>();
        SimpleDateFormat sdf;
     SimpleDateFormat: sdf = new SimpleDateFormat("dd/mm/yyyy");
     do {
         int matricula;
         Date dataMatricula;
         String nome;
         String rg;
         String cpf;
         Date dataNascimento;
         int idade;
         
         nome = JOptionPane.showInputDialog("Informe o Nome do Aluno:");
         rg = JOptionPane.showInputDialog("Informe o RG do Aluno");
         cpf = JOptionPane.showInputDialog("Informe o cpf do Aluno");
         matricula = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de matriculas"));
         dataNascimento = sdf.parse(JOptionPane.showInputDialog("Qual a data de nascimento do aluno?"));
         dataMatricula = sdf.parse(JOptionPane.showInputDialog("Qual a data da Matricula"));
         alunos.add(new Aluno(nome, rg, cpf, matricula, dataMatricula, dataNascimento, idade));
     }while((JOptionPane.showConfirmDialog(null, "deseja continuar?")) == 0);
         for (Aluno aluno : alunos) {
             
         }
         
         
     
    

                  
   

          
       
    

   

    