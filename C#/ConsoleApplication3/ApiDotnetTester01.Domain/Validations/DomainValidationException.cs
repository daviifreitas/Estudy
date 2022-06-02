namespace ApiDotnetTester01.Domain.Validations;

public class DomainValidationException : Exception
{
    public DomainValidationException(string error) : base(error)
    {
    }

    public static void When(bool hasError, string mensage)
    {
        if (hasError)
        {
            throw new DomainValidationException(mensage);
        }
    }
}