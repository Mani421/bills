package Paytm.app.base.exceptions;

import Paytm.app.base.constant.Code;

public class QueryDataException extends BaseException {

    public QueryDataException(Code code) {
        super(code);
    }

    public QueryDataException(Code code, String msg) {
        super(code, msg);
    }
}
