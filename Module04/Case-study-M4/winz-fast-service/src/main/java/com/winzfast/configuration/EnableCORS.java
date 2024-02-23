package com.winzfast.configuration;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import({com.winzfast.configuration.CorsAutoConfiguration.class})
public @interface EnableCORS {
}