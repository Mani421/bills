package Paytm.app.base.exceptions;

import Paytm.app.base.constant.Code;

public class ParamErrorException extends BaseException {
    public ParamErrorException(Code code) {
        super(code);
    }

    public ParamErrorException(Code code, String msg) {
        super(code, msg);
    }
}
