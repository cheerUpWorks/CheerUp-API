package com.cheerup.cheerup_server.common.dto;

public record TokenResponse(
        String accessToken,
        String refreshToken
) {
}