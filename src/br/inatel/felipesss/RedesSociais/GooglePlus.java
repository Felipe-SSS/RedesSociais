package br.inatel.felipesss.RedesSociais;

public class GooglePlus extends RedeSocial implements VideoConferencia, Compartilhamento{

    @Override
    public void compartilhar() {
        System.out.println("Compartilhou no GooglePlus!");
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou foto no GooglePlus!");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou vídeo no GooglePlus!");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou comentário no GooglePlus!");
    }

    @Override
    public void curtirPublicacao(){
        System.out.println("Curtiu uma publicação no GooglePlus!");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Realizou uma vídeo conferência no GooglePlus!");
    }

}
