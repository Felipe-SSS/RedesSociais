package br.inatel.felipesss.RedesSociais;

public class Facebook extends RedeSocial implements VideoConferencia, Compartilhamento{

    @Override
    public void compartilhar() {
        System.out.println("Compartilhou no Facebook!");
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou foto no Facebook!");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou vídeo no Facebook!");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou comentário no Facebook!");
    }

    @Override
    public void curtirPublicacao(){
        System.out.println("Curtiu uma publicação no Facebook!");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Realizou uma vídeo conferência no Facebook!");
    }
}