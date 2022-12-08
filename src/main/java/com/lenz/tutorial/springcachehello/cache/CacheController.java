package com.lenz.tutorial.springcachehello.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CacheController {



    private CacheService cacheService;

    @Autowired
    public CacheController(CacheService cacheService) {
        this.cacheService = cacheService;
    }

    @GetMapping(value = "/")
    public String getData() {
        return cacheService.getData();
    }

    @GetMapping(value = "/update")
    public String updateData() {
        return cacheService.updateData();
    }

    @GetMapping(value = "/clear")
    public void clearCache() {
        cacheService.clearCache();
    }
}
