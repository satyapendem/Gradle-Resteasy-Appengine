package com.gradleresteasy.config;


import com.gradleresteasy.controller.SampleController;
import org.apache.james.mime4j.storage.DefaultStorageProvider;
import org.apache.james.mime4j.storage.MemoryStorageProvider;

import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by valishah on 5/16/17.
 */
public class AppConfig extends Application{
    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> classes = new HashSet<>();

//        DefaultStorageProvider.setInstance(new MemoryStorageProvider());
        classes.add(SampleController.class);
        return classes;
    }
}
