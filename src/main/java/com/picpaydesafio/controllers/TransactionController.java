package com.picpaydesafio.controllers;

import com.picpaydesafio.domain.user.User;
import com.picpaydesafio.domain.user.transaction.Transaction;
import com.picpaydesafio.dtos.TransactionDTO;
import com.picpaydesafio.dtos.UserDTO;
import com.picpaydesafio.services.Transactionservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transaction")
public class TransactionController {

    @Autowired
    Transactionservice transactionservice;

    @PostMapping
    public ResponseEntity<Transaction> createTransaction(@RequestBody TransactionDTO transaction) throws Exception {
        Transaction newtransaction = this.transactionservice.createTransaction(transaction);
        return new ResponseEntity<>(newtransaction, HttpStatus.CREATED);
    }
}
