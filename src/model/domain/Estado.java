package model.domain;
import java.util.ArrayList;
import java.util.List;

public class Estado {
	
	public static final char CHAR_MAX = 'X';
	
	public static final char CHAR_MIN = 'O';
	
	public static final char CHAR_VAZIO = ' ';
	
	private Integer profundidade;
	
	private Integer utilidade;
	
	private char[][] jogada = new char[3][3];
	
	private List<Estado> estadosSucessores = new ArrayList<>();
	
	public Estado(char[][] jogada,Integer profundidade) {
		this.jogada = jogada;
		this.profundidade = profundidade;
	}
	
	public char[][] getJogada() {
		return jogada;
	}

	public Integer getUtilidade() {
		return utilidade;
	}

	public void setUtilidade(Integer utilidade) {
		this.utilidade = utilidade;
	}

	public List<Estado> getEstadosSucessores(char c) {		
		estadosSucessores = new ArrayList<>();
		List<PosXY> posicoes = getPosicoesLivres();
		for (PosXY pos: posicoes) {
			char[][] jogo = getJogadaClone();
			jogo[pos.getX()][pos.getY()] = c;
			estadosSucessores.add(new Estado(jogo,getProfundidade()+1));
		}	
		return estadosSucessores;
	}
	
	public List<Estado> getEstadosSucessores() {
		return estadosSucessores;
	}
	
	private char[][] getJogadaClone() {
		char[][] jogadaClone = new char[3][3];
		for (int i = 0; i < 3;i++) {
			for (int j = 0; j < 3; j++) {
				jogadaClone[i][j] = jogada[i][j];
			}
		}
		return jogadaClone;
	}

	public Integer getProfundidade() {
		return profundidade;
	}

	public List<PosXY> getPosicoesLivres() {
		List<PosXY> posLivres = new ArrayList<>();
		for (int i = 0; i < 3;i++) {
			for (int j = 0; j < 3; j++) {
				if (jogada[i][j] ==CHAR_VAZIO) {
					posLivres.add(new PosXY(i,j));
				}
			}
		}
		return posLivres;
	}
	
	public Integer calculaUtilidade() {
		if (isGanhou(CHAR_MAX)) {
			return 10 - profundidade;
		} else if (isGanhou(CHAR_MIN)) {
			return profundidade - 10;
		} 
		return 0;
	}
	
	public boolean isEncerrado() {
		return isGanhou(CHAR_MAX) || isGanhou(CHAR_MIN) || semEspaco();
	}
	
	private boolean semEspaco() {
		for (int i = 0; i < 3;i++) {
			for (int j = 0; j < 3;j++) {
				if (jogada[i][j] == CHAR_VAZIO) {
					return false;
				}
			}
		}
		return true;
	}

	public boolean isGanhou(Character c) {
		if ((jogada[0][0] == c && jogada[0][1] == c && jogada[0][2] == c) ||
		   (jogada[1][0] == c && jogada[1][1] == c && jogada[1][2] == c) ||
		   (jogada[2][0] == c && jogada[2][1] == c && jogada[2][2] == c) ||
		   (jogada[0][0] == c && jogada[1][0] == c && jogada[2][0] == c) ||
		   (jogada[0][1] == c && jogada[1][1] == c && jogada[2][1] == c) ||
		   (jogada[0][2] == c && jogada[1][2] == c && jogada[2][2] == c) ||
		   (jogada[0][0] == c && jogada[1][1] == c && jogada[2][2] == c) ||
		   (jogada[0][2] == c && jogada[1][1] == c && jogada[2][0] == c)) {
			return true;
		} 
		return false;
	}
	
	public String toString() {
		return jogada[0][0]+" | "+jogada[0][1]+" | "+jogada[0][2]+"\n"+
			   jogada[1][0]+" | "+jogada[1][1]+" | "+jogada[1][2]+"\n"+
			   jogada[2][0]+" | "+jogada[2][1]+" | "+jogada[2][2];
	}

}
