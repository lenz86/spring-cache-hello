package com.lenz.tutorial.springcachehello.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * Service for testing cache functions
 * We can annotate class as @CacheConfig(cacheNames = "MySimpleCache")
 * It will let us don't print cache name above every method
 */
@Service
public class CacheService {

    private Dao dao;

    @Autowired
    public CacheService(Dao dao) {
        this.dao = dao;
    }

    /**
     * @Cacheble annotation provided to put data from this method into local cache
     * "cacheNames" param is naming cache and must be present othervice we'll get an exception
     */

    @Cacheable("mySimpleCache")
    public String getData() {
        return dao.getData();
    }


    /**
     * @CachePut annotation provided to update data into local cache
     * If we don't use this function our data into cache always be constant and never changes
     */

    @CachePut("mySimpleCache")
    public String updateData() { return dao.getData(); }


    /**
     * Clear all data from cache
     */
    @CacheEvict("mySimpleCache")
    public void clearCache() {

    }
}
