using FilmesAPI.Models;
using Microsoft.AspNetCore.Mvc;

namespace FilmesAPI.Controllers;
[ApiController]
[Route("[Controller")]
public class FilmeController : ControllerBase
{
    private static List<Filme> filmes = new List<Filme>();
    [HttpPost]
    public void adicionarFilme([FromBody] Filme filme )
    {
        filmes.Add(filme);
        Console.WriteLine("O nome do filme : " + filme.Titulo);
    }
}