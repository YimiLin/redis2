
package com.gs.base;

import org.springframework.data.redis.core.*;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by 郭成铭 on 2018.8.3 .
 */
public class RedisTemplateUtil {

    private RedisTemplate redisTemplate;

    //构造方法，将注入的redisTemplate构造为RedisTemplateUtil的成员
    public RedisTemplateUtil(RedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    //将多种类型的值存入缓存
    public void set(String key, Object value) {
        ValueOperations valueOperations = redisTemplate.opsForValue();
        valueOperations.set(key, value);
    }

    //获取某个指定key的值
    public Object get(String key) {
        return redisTemplate.opsForValue().get(key);
    }

    //将list存入缓存
    public void setList(String key, List<?> value) {
        ListOperations listOperations = redisTemplate.opsForList();
        listOperations.leftPush(key, value);
    }

    //获取list
    public Object getList(String key) {
        return redisTemplate.opsForList().leftPop(key);
    }

    //将set存入缓存
    public void setSet(String key, Set<?> value) {
        SetOperations setOperations = redisTemplate.opsForSet();
        setOperations.add(key, value);
    }

    //获取set
    public Object getSet(String key) {
        return redisTemplate.opsForSet().members(key);
    }

    //将map存入缓存
    public void setHash(String key, Map<String, ?> value) {
        HashOperations hashOperations = redisTemplate.opsForHash();
        hashOperations.putAll(key, value);
    }

    //获取map
    public Object getHash(String key) {
        return redisTemplate.opsForHash().entries(key);
    }

    //删除某个key
    public void delete(String key) {
        redisTemplate.delete(key);
    }

}