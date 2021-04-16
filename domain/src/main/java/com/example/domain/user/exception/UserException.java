package com.example.domain.user.exception;

import java.util.Set;

public class UserException extends RuntimeException{
    public UserException(String message) {
        super(message);
    }

   public static UserException emailConflicted() {
       return new UserException("email_conflicted");
   }
}
