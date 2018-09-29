package br.lucas.mocks;

import java.util.ArrayList;
import java.util.List;



public class ContaDaoFalso implements Dao {

	private static List<Conta> contas = new ArrayList<Conta>();
	
	public void salvaConta(Conta conta) {
		contas.add(conta);
	}

	public List<Conta> getContas(){
		return contas;
	}
	
	
	public void atualizaConta(Conta conta) { 

	}
}