package com.coco.boot.service;


import com.coco.boot.common.R;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.servlet.ModelAndView;

/**
 * 定义关键接口
 */
public interface CoCoPilotService {

    /**
     * 上传令牌
     */
    R<String> updaloadGhu(String data);

    /**
     * 获取token
     */
    ModelAndView token();

    /**
     * linuxdo  CallBack
     */
    ResponseEntity<String> callback(String code, String state);

    /**
     * chat 接口
     */
    ResponseEntity<String> chat(@RequestBody Object requestBody, @RequestHeader("Authorization") String auth);
}
