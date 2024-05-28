package br.inatel.felipesss.RedesSociais;

public class Twitter extends RedeSocial implements Compartilhamento{

    @Override
    public void compartilhar() {
        System.out.println("Compartilhou no Twitter!");
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou foto no Twitter!");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou vídeo no Twitter!");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou comentário no Twitter!");
    }

    @Override
    public void curtirPublicacao(){
        System.out.println("Curtiu uma publicação no Twitter!");
    }
}
