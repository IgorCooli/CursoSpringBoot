package br.com.alura.forum.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.forum.controller.dto.TopicoDto;
import br.com.alura.forum.model.Curso;
import br.com.alura.forum.model.Topico;

@RestController
public class TopicosController {
	
	@RequestMapping("/topicos")
	public List<TopicoDto> lista(){
		Topico t1 = new Topico("Dúvida", "Duvida com Spring", new Curso("Spring", "Programação"));
		
		return TopicoDto.converter(Arrays.asList(t1, t1, t1));
	}
}
