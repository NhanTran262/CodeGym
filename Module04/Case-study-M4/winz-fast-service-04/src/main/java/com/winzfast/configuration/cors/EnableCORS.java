package com.winzfast.configuration.cors;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import({com.winzfast.configuration.cors.CorsAutoConfiguration.class})
public @interface EnableCORS {
}