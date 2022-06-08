using Microsoft.EntityFrameworkCore;
using MigrationsT01.Models;

namespace MigrationsT01.Data;

public class JobContext : DbContext
{
    protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
    {
        optionsBuilder.UseNpgsql("");
    }

    public DbSet<Job> Jobs { get; set; }
}