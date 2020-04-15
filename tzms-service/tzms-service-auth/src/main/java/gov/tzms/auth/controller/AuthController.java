package gov.tzms.auth.controller;

import gov.tzms.common.pojos.RestResult;
import gov.tzms.common.utils.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author wangcong
 * @date 2020/4/15 18:13
 */
@RestController
public class AuthController {
    Logger logger = LoggerFactory.getLogger(AuthController.class);

    @Value("${server.port}")
    String serverPort;

    @GetMapping(value = "/test")
    public RestResult test() {
        String msg = "current server name:auth server,port:" + serverPort + "       " + UUID.randomUUID();
        logger.info(msg);
        return ResultUtil.success(msg);
    }
}
