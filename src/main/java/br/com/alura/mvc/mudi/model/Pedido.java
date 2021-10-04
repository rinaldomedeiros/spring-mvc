package br.com.alura.mvc.mudi.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;


@Entity
public class Pedido {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Getter	@Setter 
	private String nomeProduto;
	
	@Getter	@Setter 
	private BigDecimal valorNegociado;
	
	@Getter	@Setter 
	private LocalDate dataDaEntrega;
	
	@Getter	@Setter 
	private String urlProduto;
	
	@Getter	@Setter 
	private String urlImagem;
	
	@Getter	@Setter 
	private String descricao;

	@Getter	@Setter
	@Enumerated(EnumType.STRING)
	private StatusPedido status;
	
	@Getter	@Setter
	@ManyToOne(fetch = FetchType.LAZY)
	private User user;
}
