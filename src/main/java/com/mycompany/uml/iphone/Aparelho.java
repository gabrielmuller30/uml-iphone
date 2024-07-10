package com.mycompany.uml.iphone;
/**
 *
 * @author gabri
 */
public class Aparelho {
    private String numeroDiscado;
    
    public void ligar (String numero){
        this.numeroDiscado = numero;
        System.out.println("Ligando para: " + numeroDiscado);
    }
    
    public void atender(){
        System.out.println("Chamada atendida");
    }
    
    public void iniciarCorreioVoz(){
        System.out.println("Redirecionando para o correio de voz.");
    }
}
