package model.service;

import java.util.List;

import model.domain.Estado;

public class MiniMax {
	
	private boolean podaAlfaBeta;
	
	private boolean jogadorMin;
	
	private Integer estadosPercorridos;
	
	public MiniMax(boolean podaAlfaBeta,boolean jogadorMin) {
		this.podaAlfaBeta = podaAlfaBeta;
		this.jogadorMin = jogadorMin;
	}
	
	public Estado executaAlgoritmoMiniMax(Estado estadoInicial) throws Exception {
		estadosPercorridos = 0;
		int utilidade = 0;
		if (jogadorMin) {
			utilidade = max(estadoInicial,Integer.MIN_VALUE, Integer.MAX_VALUE);	
		} else {
			utilidade = min(estadoInicial,Integer.MIN_VALUE, Integer.MAX_VALUE);
		}		
		for (Estado estado: estadoInicial.getEstadosSucessores()) {
			if (estado.getUtilidade() == utilidade) {
				return estado;
			}
		}
		throw new Exception("nao achou o estado "+utilidade);
	}

	private int max(Estado estado,Integer alfa,Integer beta) {
		estadosPercorridos++;
		if (estado.isEncerrado()) {
			return estado.calculaUtilidade();
		}
		int v = Integer.MIN_VALUE;
		List<Estado> sucessores = estado.getEstadosSucessores(Estado.CHAR_MAX);
		
		for (Estado noSucessor: sucessores) {
			v = Math.max(v, min(noSucessor,alfa,beta));
			noSucessor.setUtilidade(v);
			if (podaAlfaBeta) {
				if (v >= beta) {
	            	return v;
	            }                
	            alfa = Math.max(v, alfa);	
			}            
		}
		return v;			
	}
	
	private int min(Estado estado,Integer alfa,Integer beta) {
		estadosPercorridos++;
		if (estado.isEncerrado()) {
			return estado.calculaUtilidade();
		}
		int v = Integer.MAX_VALUE;
		List<Estado> sucessores = estado.getEstadosSucessores(Estado.CHAR_MIN);
		
		for (Estado noSucessor: sucessores) {
			v = Math.min(v, max(noSucessor,alfa,beta));
			noSucessor.setUtilidade(v);
			if (podaAlfaBeta) {
				if (v <= alfa) {
	            	return v;
	            }                
	            beta = Math.min(v, beta);	
			}
		}
		return v;			
	}

	public Integer getEstadosPercorridos() {
		return estadosPercorridos;
	}

}
