using Microsoft.EntityFrameworkCore;
using WebAplicationTester01.Model;

namespace WebAplicationTester01.Data;

public class UsuarioContext : DbContext
{
    public UsuarioContext(DbContextOptions options) : base(options)
    {
    }
    
    public DbSet<Usuario> Usuarios { get; set; }
    
    protected override void OnModelCreating(ModelBuilder modelBuilder)
    {
        var usuario = modelBuilder.Entity<Usuario>();
        usuario.ToTable("tb_usuario");
        usuario.HasKey(x => x.Id);
        usuario.Property(x => x.Id).HasColumnName("id").ValueGeneratedOnAdd();
        usuario.Property(x => x.Nome).HasColumnName("nome").IsRequired();
        usuario.Property(x => x.dataNascimento).HasColumnName("data_nascimento");
    } 
}