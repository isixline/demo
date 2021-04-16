package com.example.frontend.usecase;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

public class GetUserDetailCase {

    @Getter
    @Setter
    @Builder
    public static class Response {
        private String id;
        private String name;
    }
}
