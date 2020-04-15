package gov.tzms.config.swagger;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangcong
 * @date 2020/4/15 13:34
 */
@Component
@Primary
public class SwaggerProvider implements SwaggerResourcesProvider {
    public static final String SWAGGER_VERSION = "2.0";

    @Override
    public List<SwaggerResource> get() {
        List<SwaggerResource> resources = new ArrayList<>();
        resources.add(swaggerResource("项目管理服务", "/project/v2/api-docs"));
        resources.add(swaggerResource("用户认证服务", "/auth/v2/api-docs"));
        return resources;
    }

    private SwaggerResource swaggerResource(String name, String location) {
        return swaggerResource(name, location, SWAGGER_VERSION);
    }

    private SwaggerResource swaggerResource(String name, String location, String version) {
        SwaggerResource swaggerResource = new SwaggerResource();
        swaggerResource.setName(name);
        swaggerResource.setLocation(location);
        swaggerResource.setSwaggerVersion(version);
        return swaggerResource;
    }
}