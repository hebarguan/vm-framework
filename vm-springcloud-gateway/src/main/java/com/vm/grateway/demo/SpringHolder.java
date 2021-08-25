package com.vm.grateway.demo;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author huaihai.guan
 * @since 2021/8/4 15:09
 */
@Component
public class SpringHolder implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        SpringHolder.applicationContext = applicationContext;
    }

    public static ApplicationContext getApplicationContext() {
         return SpringHolder.applicationContext;
    }
}
