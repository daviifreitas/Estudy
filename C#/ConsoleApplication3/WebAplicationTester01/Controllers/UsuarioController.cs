using Microsoft.AspNetCore.Mvc;
using WebAplicationTester01.Data;
using WebAplicationTester01.Model;

namespace WebAplicationTester01.Controllers;

[ApiController]
[Route("api/[controller]")]
public class UsuarioController : ControllerBase
{
    private readonly IUsuarioRepository _repository;
    
    public UsuarioController(IUsuarioRepository repository)
    {
        this._repository = repository;
    }
    
    [HttpPost]
    public async Task<IActionResult> Post(Usuario usuario)
    {
        _repository.AdiconaUsuario(usuario);
        return await _repository.SaveChangesAsync()
            ? Ok("Usuario adicionado com sucesso !")
            : BadRequest("Error ao adicionar o usuário ");
    }

    [HttpGet]
    public async Task<IActionResult> Get()
    {
        var usuarios = await _repository.BuscaUsuario();
        return usuarios.Any() ? Ok(usuarios) : NoContent();
    }
    [HttpGet("{id}")]
    public async Task<IActionResult> GetById(int id)
    {
        var usuario = await _repository.BuscaUsuario(id);
        return usuario != null ? Ok(usuario) : NotFound("Usuario não encontrado");
    }

    [HttpPut("{id}")]
    public async Task<IActionResult> Put(int id, Usuario user)
    {
        var usuario = await _repository.BuscaUsuario(id);
        if (usuario == null) return NotFound("Uusario não encontrado");

        usuario.Nome = user.Nome ?? usuario.Nome;
        usuario.dataNascimento = user.dataNascimento != new DateTime() ? user.dataNascimento : usuario.dataNascimento;
        
        _repository.AtualizaUsuario(usuario);
        
        return await _repository.SaveChangesAsync()
            ? Ok("Usuario atualizado com sucesso !")
            : BadRequest("Error ao atualizar o usuário ");
    }

    [HttpDelete("{id}")]
    public async Task<IActionResult> Delete(int id )
    {
        var usuario = await _repository.BuscaUsuario(id);
        if (usuario == null) return NotFound("Uusario não encontrado");
        
        _repository.DeletaUsuario(usuario);
        
        return await _repository.SaveChangesAsync()
            ? Ok("Usuario Deletado com sucesso !")
            : BadRequest("Error ao deletar o usuário ");
    }
}