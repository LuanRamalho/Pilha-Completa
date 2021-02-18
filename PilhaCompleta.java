
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luan Ramalho
 */
public class PilhaCompleta 
{

    /**
     * @param args the command line arguments
     */
    Stack <String> dado = new Stack <String> ();
    
    public void FormaPilha()
    {
        System.out.println("EMPILHANDO: ");
        dado.push("kdna40-4129");
        System.out.println(dado);
        dado.push("402394");
        System.out.println(dado);
        dado.push("04kfsj234");
        System.out.println(dado);
        dado.push("-;.a/e12838");
        System.out.println(dado);
        dado.push("R%$¨gla938");
        System.out.println(dado);
        dado.push("0324984327");
        System.out.println(dado);
        dado.push("4958128slfks");
        System.out.println(dado);
    }
    
        
    public void Desempilha()
    {
        System.out.println("DESEMPILHANDO");
        dado.pop();
        System.out.println(dado);
        dado.pop();
        System.out.println(dado);
        dado.pop();
        System.out.println(dado);
        dado.pop();
        System.out.println(dado);
        dado.pop();
        System.out.println(dado);
        dado.pop();
        System.out.println(dado);
        dado.pop();
        System.out.println(dado);
    }
    
    public static void main(String[] args) 
    {
        PilhaCompleta p = new PilhaCompleta();
        p.FormaPilha();
        System.out.println("");
        System.out.println("");
        p.Desempilha();
        // TODO code application logic here
    }
    
}
