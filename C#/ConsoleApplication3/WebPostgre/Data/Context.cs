using Microsoft.EntityFrameworkCore;
using WebPostgre.Models;

namespace WebPostgre.Data;

public class Context : DbContext
{
    protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
    {
        optionsBuilder.UseNpgsql("host=localhost;port=5432;Database=CRUD_POSTGRE;User Id =postgres;Password=root");
    }

    public DbSet<Produto> Produtos { get; set; }
    
}