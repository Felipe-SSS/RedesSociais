package br.inatel.felipesss.RedesSociais;

public class Instagram extends RedeSocial{

    @Override
    public void postarFoto() {
        System.out.println("Postou foto no Instagram!");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou vídeo no Instagram!");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou comentário no Instagram!");
    }

    @Override
    public void curtirPublicacao(){
        System.out.println("Curtiu uma publicação no Instagram!");
    }

}
