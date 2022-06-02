using aula_api;

var builder = WebApplication.CreateBuilder(args);
var app = builder.Build();

app.MapGet("/GetClientes/", () => Results.Ok(new Cliente("Raoni","raoni@ni.com",22 ,1)));

app.Run();
