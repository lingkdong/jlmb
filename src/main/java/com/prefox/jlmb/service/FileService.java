package com.prefox.jlmb.service;

import com.prefox.jlmb.dto.BaseResponseDTO;
import com.prefox.jlmb.dto.UploadFileDto;

/**
 * Created by lk on 2018/3/9.
 */
public interface FileService {
    /**
     * persistent file
     *
     * @return
     */
    String getUploadBase();

    /**
     * user upload temp
     * will delete by schedule
     *
     * @return
     */
    String getUploadTemp();

    /**
     * program generate file for user download
     * will delete by schedule
     *
     * @return
     */
    String getDownloadTemp();

    String getDateDir();

    boolean delUploadTemp();

    boolean delDownTemp();

    BaseResponseDTO detectFileDto(UploadFileDto uploadFileDto);

    BaseResponseDTO doUpload(UploadFileDto fileDto);

    String getTokenFileName(String fileName);

    String getNginxUrl();

}
