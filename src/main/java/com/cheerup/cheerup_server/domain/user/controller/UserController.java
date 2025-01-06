package com.cheerup.cheerup_server.domain.user.controller;

import com.boundary.boundarybackend.domain.facade.UserFacade;
import com.boundary.boundarybackend.domain.user.model.dto.request.*;
import com.boundary.boundarybackend.domain.user.model.dto.response.UserResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.boundary.boundarybackend.common.util.AuthenticationUtil.getMemberId;

@Tag(name = "출석")
@Slf4j
@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserFacade userFacade;
    @Operation(summary = "유저 정보 확인")
    @GetMapping("/user")
    public ResponseEntity<UserResponse> getUser() {
      var user = userFacade.getUser(getMemberId());
        return ResponseEntity.ok(user);
    }
}