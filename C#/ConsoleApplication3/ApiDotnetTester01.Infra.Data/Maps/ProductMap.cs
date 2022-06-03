﻿using ApiDotnetTester01.Domain.Entities;
using Microsoft.EntityFrameworkCore;
using Microsoft.EntityFrameworkCore.Metadata.Builders;

namespace ApiDotnetTester01.Infra.Data.Maps;

public class ProductMap : IEntityTypeConfiguration<Product>
{
    public void Configure(EntityTypeBuilder<Product> builder)
    {
        builder.ToTable("Produto");
        builder.HasKey(x => x.Id);
        builder.Property(x => x.Id)
            .HasColumnName("IdProduto")
            .UseIdentityColumn();
        
        builder.Property(x => x.CodErp)
            .HasColumnName("CodErp");
        builder.Property(x => x.Name)
            .HasColumnName("Nome");
        builder.Property(x => x.Price)
            .HasColumnName("Preco");
    }
}