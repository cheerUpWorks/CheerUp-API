package com.cheerup.cheerup_server.domain.user.model.dto.vo;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum MemberRole
{
    Child("Child"),
    Parent("Parent");

    private final String role;
}

