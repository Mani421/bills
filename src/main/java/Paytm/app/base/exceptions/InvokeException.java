package Paytm.app.base.exceptions;

import Paytm.app.base.constant.Code;

public class InvokeException extends BaseException {
    public InvokeException(Code code, String msg) {
        super(code, msg);
    }
}
