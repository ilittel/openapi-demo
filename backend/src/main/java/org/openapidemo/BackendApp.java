package org.openapidemo;

import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Environment;

/**
 * Back-end app for OpenAPI demo
 */
public class BackendApp extends Application<Configuration> {
    public static void main(String[] args) throws Exception {
        new BackendApp().run(args);
    }
    
    @Override
    public void run(Configuration configuration, Environment environment) {
        var productsApi = new ProductsApiImpl();
        environment.jersey().register(productsApi);
    }
}
