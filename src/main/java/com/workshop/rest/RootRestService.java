package com.workshop.rest;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * This class is responsible for injecting RESTful WebService implementation
 */

// @ApplicationPath is mandatory if you have resteasy.servlet.mapping.prefix defined in web.xml
@ApplicationPath("/rs")
public class RootRestService extends Application {

    @Override
    public Set<Class<?>> getClasses()
    {
        // Dont' define class type, so we can inject more classes
        Set<Class<?>> classes = new HashSet<Class<?>>();
        classes.add(RestService.class);
        return classes;
    }
}
