package br.com.santander.bigdata.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.santander.bigdata.model.Transaction;

@Repository
public interface TransactionRepository extends CrudRepository<Transaction, Long>{

}