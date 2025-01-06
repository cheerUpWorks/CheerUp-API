package com.cheerup.cheerup_server.domain.user.model.dto.request;

import jakarta.validation.constraints.NotBlank;

public record TokenRefreshRequest(@NotBlank String refreshToken)
{
}