package br.com.alura.forum.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import br.com.alura.forum.model.Topico;

public class TopicoDTO {
	
	private Long id;
	private String titulo;
	private String mensagem;
	private LocalDateTime dataCriacao;
	
	public TopicoDTO(Topico topico) {
		id = topico.getId();
		titulo = topico.getTitulo();
		mensagem = topico.getMensagem();
		dataCriacao = topico.getDataCriacao();
	}
	
	public static List<TopicoDTO> converter(List<Topico> topicos){
		return topicos.stream().map(TopicoDTO::new).collect(Collectors.toList());
	}
	
	public Long getId() {
		return id;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getMensagem() {
		return mensagem;
	}
	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}
}
