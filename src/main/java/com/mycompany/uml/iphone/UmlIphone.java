package com.mycompany.uml.iphone;

/**
 *
 * @author gabri
 */
public class UmlIphone {

    public static void main(String[] args) {
        ReprodutorMusical reprodutor = new ReprodutorMusical();
        Aparelho aparelho = new Aparelho();
        NavegadorInternet navegador = new NavegadorInternet();
        
        reprodutor.selecionarMusica("Renova 313");
        reprodutor.tocar();
        
        aparelho.ligar("41 988465571");
        aparelho.atender();
        
        navegador.adicionarNovaAba();
        navegador.exibirPagina("https://github.com/gabrielmuller30");
        navegador.atualizarPagina();
    }
}