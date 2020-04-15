package gov.tzms.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author wangcong
 * @date 2020/4/14 18:13
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProjectApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProjectApplication.class);
    }
}
