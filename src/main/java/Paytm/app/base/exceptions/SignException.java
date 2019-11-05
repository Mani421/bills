package Paytm.app.base.exceptions;

import Paytm.app.base.constant.Code;

public class SignException extends BaseException {
    public SignException(Code code, String msg) {
        super(code, msg);
    }
}
