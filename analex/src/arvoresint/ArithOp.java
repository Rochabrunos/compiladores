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
public class ArithOp extends Expr{
    
    public ArithOp(String nome) {
        super(nome);
    }
    
    public void toString(AST node) {
        System.out.println("<ArithOp op='" + node.getNome() + "' >");
        xml.add("< ArithOp op='" + node.getNome() + "' >");
        for(AST x : node.getFilhos()) {
            if(x == null)break;
            x.toString(x);
        }
        System.out.println("</ArithOp>");
        xml.add("</ArithOp>");
    }
    
    public float evaluate () {
        switch(nome){
            case "+":
                valor =  filhos.get(0).evaluate() + filhos.get(1).evaluate();
                System.out.println(filhos.get(0).evaluate() + " + " +  filhos.get(1).evaluate() + " = " + valor);
                break;
            case "-":
                valor = filhos.get(0).evaluate() - filhos.get(1).evaluate();
                System.out.println(filhos.get(0).evaluate() + " - " +  filhos.get(1).evaluate() + " = " + valor);
                break;
            case "*":
                valor = filhos.get(0).evaluate() * filhos.get(1).evaluate();
                System.out.println(filhos.get(0).evaluate() + " * " +  filhos.get(1).evaluate() + " = " + valor);
                break;
            case "/":
                valor = filhos.get(0).evaluate() / filhos.get(1).evaluate();
                System.out.println(filhos.get(0).evaluate() + " / " +  filhos.get(1).evaluate() + " = " + valor);
                break;    
               
        }
        return valor;
    }
}
