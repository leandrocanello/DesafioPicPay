package com.picpaydesafio.dtos;

import com.picpaydesafio.domain.user.User;

import java.math.BigDecimal;

public record TransactionDTO(BigDecimal value, Long senderId, Long receiverId) {

}
