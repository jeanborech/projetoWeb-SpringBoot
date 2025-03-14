package com.aplicacaoweb.projetoweb.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aplicacaoweb.projetoweb.entities.User;


//Indica que esta classe será um controlador REST.
@RestController //lida com requisições HTTP e retorna respostas no formato JSON.
@RequestMapping(value = "/users") // Define o caminho base
public class UserResource {
	
	
	@GetMapping //para mapear requisições HTTP GET(recuperar dados)
	//ResponseEntity é usado para criar respostas HTTP personalizadas no Spring.
	public ResponseEntity<User> findAll(){
		User u = new User(1L,"Maria","Maria@gmail.com","999999","12345");
		return ResponseEntity.ok().body(u); //retornar resposta com sucesso no http
	}
	
	

}
