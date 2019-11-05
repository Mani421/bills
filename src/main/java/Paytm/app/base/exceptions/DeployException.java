package Paytm.app.base.exceptions;

import Paytm.app.base.constant.Code;

public class DeployException extends BaseException {
    public DeployException(Code code, String msg) {
        super(code, msg);
    }
}
