package com.chilx.jw.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

/**
 * jpa 自动赋值
 *
 * @author chilx
 * @date 2021/3/4
 **/
@Configuration
public class JPAAuditorConfig implements AuditorAware<Integer> {
    @Override
    public Optional<Integer> getCurrentAuditor() {
        return Optional.of(1);
    }
}
