package com.prefox.jlmb.dto.user;

import lombok.Data;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by lk on 2018/1/31.
 */
@Data
public class PassChangeParam {
    private String token;
    private String password;
    private HttpServletRequest request;
}
