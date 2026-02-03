package br.com.connmandakaru.mandabank.service.transactionLog;

import br.com.connmandakaru.mandabank.entity.Transaction;
import br.com.connmandakaru.mandabank.entity.TransactionLog;
import br.com.connmandakaru.mandabank.entity.enums.transactions.TransactionStatus;
import br.com.connmandakaru.mandabank.repositories.TransactionLogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class TransactionLogService {

    private final TransactionLogRepository transactionLogRepository;

    public void log(Transaction transaction, TransactionStatus status, String description) {

        TransactionLog log = TransactionLog.builder()
                .transaction(transaction)
                .status(status)
                .description(description)
                .timestamp(LocalDateTime.now())
                .build();

        transactionLogRepository.save(log);
    }
}
