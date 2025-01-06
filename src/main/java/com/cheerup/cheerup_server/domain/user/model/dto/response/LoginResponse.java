package com.cheerup.cheerup_server.domain.user.model.dto.response;
import com.boundary.boundarybackend.common.dto.TokenResponse;


public record LoginResponse(
        TokenResponse tokens) {
}
