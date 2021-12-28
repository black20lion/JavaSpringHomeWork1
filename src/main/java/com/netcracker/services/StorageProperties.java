package com.netcracker.services;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("services")
public class StorageProperties {

    /**
     * Folder location for storing files
     */
    private String location = "/Users/mac/IdeaProjects/JavaSpringHomeWork/src/main/java/com/netcracker/mystorage";

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}

