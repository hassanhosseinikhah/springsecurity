package com.example.springsecurity.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    private static final String SCHEME_NAME = "basicAuth";
    private static final String SCHEME = "basic";

    // TODO: Investigate OpenApiProperties properties - are they custom or from application.properties?
    // For now, let's assume some default values or direct configuration if OpenApiProperties is not found.

    @Bean
    public OpenAPI customOpenAPI(/*OpenApiProperties properties*/) { // Temporarily commenting out properties
        return new OpenAPI()
                .info(getInfo(/*properties*/))
                .components(new Components()
                        .addSecuritySchemes(SCHEME_NAME, createSecurityScheme()))
                .addSecurityItem(new SecurityRequirement().addList(SCHEME_NAME));
    }

    private Info getInfo(/*OpenApiProperties properties*/) { // Temporarily commenting out properties
        return new Info()
                .title("API Title (Placeholder)") // properties.getProjectTitle())
                .description("API Description (Placeholder)") // properties.getProjectDescription())
                .version("v1.0.0") // properties.getProjectVersion())
                .license(getLicense());
    }

    private License getLicense() {
        return new License()
                .name("Unlicense")
                .url("https://unlicense.org/");
    }

    private SecurityScheme createSecurityScheme() {
        return new SecurityScheme()
                .name(SCHEME_NAME)
                .type(SecurityScheme.Type.HTTP)
                .scheme(SCHEME);
    }
}
