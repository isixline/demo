package com.example.frontend.rest;

import com.example.frontend.service.UserApplicationService;
import com.example.frontend.usecase.GetUserDetailCase;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UserController {
    private final UserApplicationService applicationService;

    @GetMapping("/{id}")
    public GetUserDetailCase.Response getUserDetail(@PathVariable("id") String id) {
        return applicationService.getUserDetail(id);
    }
}
