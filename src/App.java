import entidades.Usuario;
public class App {
    public static void main(String[] args) throws Exception {
        Usuario usuario = new Usuario();
        usuario.setId(1);
        usuario.setNome(null);
        usuario.setCpf(null);
        usuario.setEmail(null);
        usuario.setSenha(null);
        usuario.setDataNascimento(null);
        usuario.setStatus(null);
    }
}
