using ApiDotnetTester01.Domain.Validations;

namespace ApiDotnetTester01.Domain.Entities;

public sealed class Person
{
    public int Id { private set; get; }
    public string Name { private set; get; }
    public string Document { get; private set; }
    public string Phone { get; private set; }

    public Person(string document , string nome ,string phone)
    {
    }

    public Person(int id, string document, string name, string phone)
    {
        DomainValidationException.When(id < 0, "Id deve ser maior que zero !!!");
        Id = id;
        Validation(document ,name ,phone);
    }

    private void Validation(string document, string name, string phone)
    {
        DomainValidationException.When(string.IsNullOrEmpty(name),"None deve ser informado !!!");
        DomainValidationException.When(string.IsNullOrEmpty(document ),"Document odeve ser informado !");
        DomainValidationException.When(string.IsNullOrEmpty(phone),"Celular deve ser informado");

        Name = name;
        Document = document;
        Phone = phone;
    }
}