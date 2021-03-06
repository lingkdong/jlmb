package com.prefox.jlmb.constant;

/**
 * Created by lk on 2018/1/17.
 */
public enum  UserStatus {
    NORMAL((byte)1,"normal"),
    LOCKED((byte)2,"locked"),
    CANCEL((byte)3,"cancel");
    private final Byte code;

    private final String detail;

    public Byte code() {
        return this.code;
    }

    /**
     * Return the reason phrase of this status code.
     */
    public String getDetail() {
        return this.detail;
    }
    UserStatus(Byte code,String detail) {
        this.code=code;
        this.detail=detail;
    }
}
