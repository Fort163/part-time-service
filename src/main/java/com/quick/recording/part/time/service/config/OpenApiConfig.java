package com.quick.recording.part.time.service.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.security.OAuthFlow;
import io.swagger.v3.oas.annotations.security.OAuthFlows;
import io.swagger.v3.oas.annotations.security.OAuthScope;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.servers.Server;


@OpenAPIDefinition(
        info = @Info(
                title = "Титульник",
                description = "Описание",
                version = "2.0.0",
                license = @License(name = "Apache 2.0", url = "http://foo.bar"),
                contact = @Contact(
                        name = "Никита",
                        email = "a@a.ru",
                        url = "www.w.ww"
                )
        ),
        servers = @Server(url = "http://localhost:8096")
)
//@SecurityScheme(
//        name = "JWT",
//        description = "JWT",
//        paramName = "JWT",
//        type = SecuritySchemeType.HTTP,
//        bearerFormat = "JWT",
//        scheme = "bearer"
//)
//@SecurityScheme(
//        name = "APIKEY",
//        description = "APIKEY",
//        paramName = "APIKEY",
//        type = SecuritySchemeType.APIKEY,
//        bearerFormat = "APIKEY",
//        scheme = "bearer"
//)
//@SecurityScheme(
//        name = "security_auth",
//        type = SecuritySchemeType.OAUTH2,
//        flows = @OAuthFlows(
//                authorizationCode = @OAuthFlow(
//                authorizationUrl = "${springdoc.oAuthFlow.authorizationUrl}",
//                        tokenUrl = "${springdoc.oAuthFlow.tokenUrl}")
//        )
//)
//http://localhost:8096/swagger-ui/index.html#/
public class OpenApiConfig {
}
