package Paytm.app.base.exceptions;

import Paytm.app.base.constant.Code;

public class WrongResponseException extends BaseException {
    public WrongResponseException(Code code, String msg) {
        super(code, msg);
    }
}
