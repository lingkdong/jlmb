package com.prefox.jlmb.service;


import com.prefox.jlmb.dto.EmailDto;

/**
 * Created by lk on 2018/1/13.
 */
public interface EmailService {
    boolean send(EmailDto dto);

    boolean sendWithAttachment(EmailDto dto);

    boolean sendHtmlEmail(EmailDto dto);

}
