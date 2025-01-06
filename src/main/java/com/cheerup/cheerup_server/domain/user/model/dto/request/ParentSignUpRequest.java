package com.cheerup.cheerup_server.domain.user.model.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ParentSignUpRequest {

    @Schema(description = "전화번호")
    private String phoneNum; // 전화번호

    @Schema(description = "사용자 아이디")
    private String userId; // 아이디

    @Schema(description = "비밀번호")
    private String password; // 비밀번호

    @Schema(description = "아이 아이디")
    private String ChildId; // 비밀번호
}
