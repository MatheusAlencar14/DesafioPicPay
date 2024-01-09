package com.dev.desafiopcp.dtos;

import com.dev.desafiopcp.entities.user.UserType;

import java.math.BigDecimal;

public record UserDTO(String firstName, String lastName, String document, BigDecimal balance, String email, String password, UserType userType) {
}
