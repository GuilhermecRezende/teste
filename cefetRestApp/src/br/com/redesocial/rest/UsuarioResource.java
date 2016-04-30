package br.com.redesocial.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.redesocial.dao.Usuario;
import br.com.redesocial.dao.UsuarioService;

@Path("/usuarios")
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
public class UsuarioResource {

	UsuarioService service = new UsuarioService();
	
	@GET
	public List<Usuario> get() {
		
		return service.getAll();
		
	}
	
	@POST
	public void save(Usuario u){
		
		service.insert(u);
		
	}
}
