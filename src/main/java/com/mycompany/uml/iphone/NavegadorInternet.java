package com.mycompany.uml.iphone;
/**
 *
 * @author gabri
 */
public class NavegadorInternet {
    private String paginaAtual;
    public void exibirPagina(String url){
        this.paginaAtual = url;
        System.out.println("Exibindo pagina: " + paginaAtual);
    }
    
    public void adicionarNovaAba(){
        System.out.println("Nova aba adicionada.");
    }
    
    public void atualizarPagina(){
        System.out.println("Pagina atualizada.");
    }
    
}
