/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvoresint;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.ArrayList;
import javax.swing.filechooser.FileView;
/**
 *
 * @author brunos1212
 */
public class AST {
    String nome; //nome do lexema, <, a, num
    ArrayList<AST> filhos = new ArrayList<>(); // filhos do nodo
    private String tipo; // id, expr, if
    float valor;
    static ArrayList<String> xml = new ArrayList<String>();
    
    public AST(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<AST> getFilhos() {
        return filhos;
    }

    public void setFilhos(AST filhos) {
        this.filhos.add(filhos);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void toString(AST node) {
        System.out.println("< " + nome + ">");
        xml.add("< " + nome + ">");
        for(AST x : filhos) {
            if(x == null)break;
            x.toString(x);
        }
        System.out.println("</" + nome + ">");
        xml.add("</" + nome + ">");
    }
    public void setValor(float valor) {
        this.valor = valor;
    }
    
    public float evaluate(){
         for(AST x : filhos) {
            if(x == null)break;
            x.evaluate();
        }
         return 0;
    }
    
    public void add(String x){
        xml.add(x);
    }
    
    public void save(String nome) {
        try{
        File a = new File(nome+".xml");
        FileWriter fileW = new FileWriter (a);//arquivo para escrita
        BufferedWriter buffW = new BufferedWriter (fileW);
        
        for( String x : xml){
            if(x == null)break;
            buffW.write(x);
            buffW.newLine();
        }
        buffW.flush();
        fileW.close();
        }catch (IOException e){
            
        }
        
        
        
    }
}
