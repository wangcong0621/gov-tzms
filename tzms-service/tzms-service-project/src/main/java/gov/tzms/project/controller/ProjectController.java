package gov.tzms.project.controller;

import gov.tzms.common.pojos.RestResult;
import gov.tzms.common.utils.ResultUtil;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author wangcong
 * @date 2020/4/14 18:12
 */
@RestController
public class ProjectController {
    Logger logger = LoggerFactory.getLogger(ProjectController.class);

    @Value("${server.port}")
    String serverPort;

    @GetMapping(value = "/test")
    public RestResult test() {
        String msg = "current server name:project server,port:" + serverPort + "       " + UUID.randomUUID();
        logger.info(msg);
        return ResultUtil.success(msg);
    }
}
