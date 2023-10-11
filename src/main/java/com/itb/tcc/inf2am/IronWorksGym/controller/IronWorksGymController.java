package com.itb.tcc.inf2am.IronWorksGym.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itb.tcc.inf2am.IronWorksGym.model.Usuario;
import com.itb.tcc.inf2am.IronWorksGym.repository.UsuarioRepository;

@Controller 
@RequestMapping("/IronWorksGym/usuario")

public class IronWorksGymController {

	@Autowired // Injeção de dependência ( o objeto será criado automaticamente pelo spring)
	private UsuarioRepository usuarioRepository;
	
// Carregar o formulário de Cadastro de Usuário
	
	@GetMapping("/novo-usuario")
	public String novoUsuario(Usuario usuario, Model model) {
		
		model.addAttribute("usuario", usuario);
		return "Cadastrar";
	}
	
	// Inserir Usuário
	
	@PostMapping("/add-usuario")
	public String addUsuario(Usuario usuario, Model model) {
		
		usuario.setCodStatusUsuario(true);
		
		Usuario usuarioDb = usuarioRepository.save(usuario);
		
		return "redirect:/IronWorksGym/usuario/home";
	}
	
	@GetMapping("/home")
	public String showFormLogin() {
		
		return "Home";
	}


}
