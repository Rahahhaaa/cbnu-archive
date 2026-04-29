package com.ctrl.cbnu_archive.auth.exception;

import com.ctrl.cbnu_archive.global.exception.CustomException;
import com.ctrl.cbnu_archive.global.exception.ErrorCode;

public class AuthException extends CustomException {

    public AuthException(ErrorCode errorCode) {
        super(errorCode);
    }

    public AuthException(ErrorCode errorCode, String customMessage) {
        super(errorCode, customMessage);
    }
}
