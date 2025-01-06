package com.cheerup.cheerup_server.domain.user.model.dto.response;

public record UserResponse(
        String name,
        String userId,
        int point,
        String childId
) {}