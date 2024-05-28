import br.inatel.felipesss.Exceptions.FaltamRecursosRedeSocialException;
import br.inatel.felipesss.Exceptions.SenhaInvalidaException;
import br.inatel.felipesss.RedesSociais.*;

public class Main {

    public static void main(String[] args) throws SenhaInvalidaException {

        Facebook facebook = new Facebook();
        facebook.setSenha("senhafacebook123");
        facebook.setNumAmigos(40);

        try{
            validaSenha(facebook);
        }catch (SenhaInvalidaException e){
            System.out.println(e.getMessage());
            return;
        }

        Instagram instagram = new Instagram();
        instagram.setSenha("senhainstagram123");
        instagram.setNumAmigos(60);

        try{
            validaSenha(instagram);
        }catch (SenhaInvalidaException e){
            System.out.println(e.getMessage());
            return;
        }


        RedeSocial[] redesSociais = {facebook, instagram};

        Usuario usuario = new Usuario(redesSociais);
        usuario.setNome("Fulano de Tal Júnior");
        usuario.setEmail("fulano@gmail.com");

        for (RedeSocial redeSocial : usuario.redesSet){
            try{
                usaMetodosRedeSocial(redeSocial);
            }
            catch (FaltamRecursosRedeSocialException e){
                System.out.println(e.getMessage());
            }
        }
    }

    public static void usaMetodosRedeSocial(RedeSocial redeSocial){

        if (redeSocial instanceof VideoConferencia && redeSocial instanceof  Compartilhamento){
            ((VideoConferencia) redeSocial).fazStreaming();
            ((Compartilhamento) redeSocial).compartilhar();
            redeSocial.postarComentario();
        }
        else{
            redeSocial.curtirPublicacao();
            redeSocial.postarFoto();
            redeSocial.postarVideo();
            throw new FaltamRecursosRedeSocialException("Rede Social não é capaz de fazer streaming e nem compartilhar publicações.");
        }
    }

    public static void validaSenha(RedeSocial redeSocial) throws SenhaInvalidaException{
        if (redeSocial.getSenha().length() < 10){
            redeSocial.setSenha("");
            throw new SenhaInvalidaException("Senha muito curta!");
        }
    }
}