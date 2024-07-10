package com.mycompany.uml.iphone;
/**
 *
 * @author gabri
 */
public class ReprodutorMusical {
    private String musicaAtual;
    
    public void tocar(){
        System.out.println("Esta tocando a musica: " + musicaAtual);
    }
    
    public void pausar(){
        System.out.println("Musica pausada");
    }
    
    public void selecionarMusica(String musica){
        this.musicaAtual = musica;
        System.out.println("Musica selecionada: " + musicaAtual);
    }
}
