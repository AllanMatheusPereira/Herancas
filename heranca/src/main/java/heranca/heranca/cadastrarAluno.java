/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package heranca.heranca;


import java.util.Date;

/**
 *
 * @author allan
 */
public class cadastrarAluno {

    public static void main(String[] args) {
        Aluno i= new Aluno ("Jose Francisco","123.456.789-19", new Date());
        System.out.println("Dados do Aluno:\nNome: "+ i.nome);
        System.out.println("CPF: " + i.cpf);
        System.out.println("Data de nascimento: " + i.data_nascimento.toString()+"\n");
        
        Professor a= new Professor ("Carlinhos meio metro", "696.696.696-69", new Date());
        System.out.println("Dados do Professor:\nNome: " + a.nome);
        System.out.println("CPF: " + a.cpf);
        System.out.println("Data de nascimento: " + a.data_nascimento.toString()+"\n");
        
        Funcionario v= new Funcionario ("Cabeça de Gelo", "888.888.888-19", new Date());
        System.out.println("Dados do Funcionário:\nNome: " + v.nome);
        System.out.println("CPF: " + v.cpf);
        System.out.println("Data de nascimento: " + v.data_nascimento.toString()+"\n");
        
        Zelador z= new Zelador ("Faxinildo nunes", "959.559.956-19", new Date(),"Limpar");
        System.out.println("Dados do Zelador:\nNome: " + z.nome);
        System.out.println("CPF: " + z.cpf);
        System.out.println("Data de nascimento: " + z.data_nascimento.toString());
        System.out.println("Funçao:" + z.funcao + "\n");
    }
}
