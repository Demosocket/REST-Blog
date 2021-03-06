package com.demosocket.blog.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class CommentNotFoundException extends RuntimeException {

    private static final long serialVersionUID = -4566054271942223015L;
}
