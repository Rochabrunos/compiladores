/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvoresint;

/**
 *
 * @author brunos1212
 */
public class Expr extends AST{
    public float valor;
    public Expr(String nome) {
        super(nome);
    }
  
   public float setValor() {
       return valor;
   }
}
