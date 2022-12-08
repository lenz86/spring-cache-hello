package com.lenz.tutorial.springcachehello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CacheController {

    private CacheService cacheService;

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
