package com.example.admin.usecases;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class GetUsersCase {
    @Getter
    @Setter
    @Builder
    public static class Response {
        private String id;
        private String name;
    }
}
