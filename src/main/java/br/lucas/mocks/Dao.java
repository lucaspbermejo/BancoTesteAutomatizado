package br.lucas.mocks;

import java.util.List;

import javax.management.RuntimeErrorException;

public interface Dao {

	List<Conta> getContas();

	void atualizaConta(Conta conta) throws RuntimeErrorException;

	void salvaConta(Conta conta);

}