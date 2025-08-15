package com.picpaysimplificado.dtos;

import lombok.extern.java.Log;

import java.math.BigDecimal;

public record TransactionDTO(BigDecimal value, Long senderId, Long receiverId) {
}
