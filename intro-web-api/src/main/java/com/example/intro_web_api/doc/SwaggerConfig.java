package com.example.intro_web_api.doc;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(info = @Info(
        title = "API de Introdução ao Spring Boot Web",
        version = "1.0",
        description = "Documentação da API Introdução ao Spring Boot Web",
        contact = @Contact(name = "dio", email = "dio@email.com"),
        license = @License(name = "Apache 2.0", url = "https://www.apache.org/licenses/LICENSE-2.0")
))
public class SwaggerConfig {
}

