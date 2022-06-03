using WebAplicationTester01.Model;

namespace WebAplicationTester01.Data;

public interface IUsuarioRepository
{
    Task<IEnumerable<Usuario>> BuscaUsuario();
    Task<Usuario> BuscaUsuario(int id);

    void AdiconaUsuario(Usuario usuario);

    void AtualizaUsuario(Usuario usuario);

    void DeletaUsuario(Usuario usuario);
    Task<bool> SaveChangesAsync();

}