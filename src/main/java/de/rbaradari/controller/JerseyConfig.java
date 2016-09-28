package de.rbaradari.controller;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@ApplicationPath("/api/v1")
@Component
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        register(RestController.class);
    }

}