using ApiDotnetTester01.Domain.Validations;
using Microsoft.VisualBasic.CompilerServices;

namespace ApiDotnetTester01.Domain.Entities;

public class Purchase
{
    public int Id { get; private set; }
    public int ProductId { get; private set; }
    public int PersonId { get; private set; }
    public DateTime Data { get; private set; }
    public Product Product { get; set; }
    public Purchase(int productId ,int personId ,DateTime? date, int id)
    {
        DomainValidationException.When(id < 0, "O id deve ser informado corretamente !!");
        Validation(personId ,productId ,date);
    }

    private void Validation( int productId, int personId, DateTime? data)
    {
        DomainValidationException.When(productId < 0, "Valor inválido!!!");
        DomainValidationException.When(personId < 0,"O valor do pessoa id deve ser informado corretamente ");
        DomainValidationException.When(!data.HasValue, "Data de compra deve ser informada");
        ProductId = productId;
        Data = data.Value;
        

    }
}