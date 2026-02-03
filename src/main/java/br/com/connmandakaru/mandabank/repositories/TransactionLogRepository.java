package br.com.connmandakaru.mandabank.repositories;

import br.com.connmandakaru.mandabank.entity.TransactionLog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TransactionLogRepository  extends JpaRepository<TransactionLog, UUID> {
}
