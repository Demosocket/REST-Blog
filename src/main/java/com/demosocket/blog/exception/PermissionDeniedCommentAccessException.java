package com.demosocket.blog.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.FORBIDDEN)
public class PermissionDeniedCommentAccessException extends RuntimeException {

    private static final long serialVersionUID = -8009875177416568177L;
}
