package br.com.santander.bigdata.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.santander.bigdata.model.Transaction;
import br.com.santander.bigdata.repository.TransactionRepository;

@Service
public class TransactionService {

	@Autowired
	TransactionRepository transactionRepository;
	
	public void saveTransaction(Transaction transaction) {
		transactionRepository.save(transaction);
	}
	
	public Iterable<Transaction> getTransactionHistory() {
		return transactionRepository.findAll();
	}
	
	public Optional<Transaction> getTransaction(Long id) {
		return transactionRepository.findById(id);
	}
}