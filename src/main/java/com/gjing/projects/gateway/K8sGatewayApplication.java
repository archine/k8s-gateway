package com.gjing.projects.gateway;

import cn.gjing.tools.swagger.core.EnableGroupDoc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Gjing
 */
@EnableGroupDoc
@EnableEurekaClient
@SpringBootApplication
public class K8sGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(K8sGatewayApplication.class, args);
    }

}
