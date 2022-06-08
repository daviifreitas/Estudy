using Microsoft.EntityFrameworkCore;
using WebPostgre.Data;

var builder = WebApplication.CreateBuilder(args);
var app = builder.Build();

builder.Services.AddEntityFrameworkNpgsql().AddDbContext<Context>(options =>
    options.UseNpgsql("host=localhost;port=5432;Database=CRUD_POSTGRE;User Id =postgres;Password=root"));

app.MapGet("/", () => "Hello World!");

app.Run();