package com.cof.server.config;

import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.ErrorPageRegistrar;
import org.springframework.boot.web.server.ErrorPageRegistry;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;

/**
 * @author huang
 */
@Configuration
public class AppErrorPagesConfiguration {

    @Bean
    public MyErrorPageRegistrar errorPageRegistrar() {
        return new MyErrorPageRegistrar();
    }

    private class MyErrorPageRegistrar implements ErrorPageRegistrar {
        @Override
        public void registerErrorPages(ErrorPageRegistry errorPageRegistry) {
            ErrorPage page404 = new ErrorPage(HttpStatus.NOT_FOUND, "/404");
            ErrorPage page500 = new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR, "/500");

            errorPageRegistry.addErrorPages(page404, page500);
        }
    }
}
