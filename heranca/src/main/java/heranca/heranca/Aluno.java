/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca.heranca;

import java.util.Date;

/**
 *
 * @author allan
 */
public class Aluno extends Pessoa{
    public Aluno(String _nome, String _cpf, Date _data){
        super(_nome, _cpf,_data);
            
    }
    public String matricula;
}