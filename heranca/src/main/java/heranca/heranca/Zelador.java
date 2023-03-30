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
public class Zelador extends Funcionario{
    String funcao;
    public Zelador (String _nome, String _cpf, Date _data, String _funcao){
       super(_nome, _cpf, _data); 
       funcao= _funcao;
    }
}
