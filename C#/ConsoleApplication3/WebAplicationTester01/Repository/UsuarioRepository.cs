using Microsoft.EntityFrameworkCore;
using WebAplicationTester01.Model;

namespace WebAplicationTester01.Data;

public class UsuarioRepository : IUsuarioRepository
{
    private readonly UsuarioContext _context;
    
    public UsuarioRepository(UsuarioContext context)
    {
        this._context = context;
    }
    public async Task<IEnumerable<Usuario>> BuscaUsuario()
    {
        return await _context.Usuarios.ToListAsync();
    }

    public async Task<Usuario> BuscaUsuario(int id)
    {
        return await _context.Usuarios.Where(x => x.Id == id).FirstOrDefaultAsync();
    }

    public void AdiconaUsuario(Usuario usuario)
    {
        _context.Add(usuario);
    }

    public void AtualizaUsuario(Usuario usuario)
    {
        _context.Update(usuario);
    }

    public void DeletaUsuario(Usuario usuario)
    {
        _context.Remove(usuario);
    }

    public async Task<bool> SaveChangesAsync()
    {
        return await _context.SaveChangesAsync() > 0;
    }
}