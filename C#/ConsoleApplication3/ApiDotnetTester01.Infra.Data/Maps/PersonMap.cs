using ApiDotnetTester01.Domain.Entities;
using Microsoft.EntityFrameworkCore;
using Microsoft.EntityFrameworkCore.Metadata.Builders;

namespace ApiDotnetTester01.Infra.Data.Maps;

public class PersonMap : IEntityTypeConfiguration<Person>
{
    public void Configure(EntityTypeBuilder<Person> builder)
    {
        builder.ToTable("Pessoa");

        builder.HasKey(c => c.Id);

        builder.Property(c => c.Id)
            .HasColumnName("IDPessoa")
            .UseIdentityColumn();

        builder.Property(c => c.Document)
            .HasColumnName("Documento");

        builder.Property(c => c.Name)
            .HasColumnName("Nome");

        builder.Property(c => c.Phone)
            .HasColumnName("celular");

        builder.HasMany(c => c.purchases)
            .WithOne(p => p.Person)
            .HasForeignKey(c => c.PersonId);
    }
}