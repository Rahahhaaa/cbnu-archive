package com.ctrl.cbnu_archive.project.exception;

import com.ctrl.cbnu_archive.global.exception.CustomException;
import com.ctrl.cbnu_archive.global.exception.ErrorCode;

public class ProjectException extends CustomException {

    public ProjectException(ErrorCode errorCode) {
        super(errorCode);
    }

    public ProjectException(ErrorCode errorCode, String customMessage) {
        super(errorCode, customMessage);
    }
}
