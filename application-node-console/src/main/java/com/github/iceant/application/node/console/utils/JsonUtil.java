package com.github.iceant.application.node.console.utils;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;

import java.util.List;

public class JsonUtil {
    static final ObjectMapper s_ObjectMapper = getObjectMapper();

    public static ObjectMapper getObjectMapper(){
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.findAndRegisterModules();
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
        objectMapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
        SimpleModule module = new SimpleModule();
        objectMapper.registerModule(module);
        return objectMapper;
    }

    public static String toJson(Object object){
        try {
            return s_ObjectMapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public static <T> T fromJson(String json, Class<T> type){
        try {
            return s_ObjectMapper.readValue(json, type);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public static <T> List<T> toList(String json, Class<T> type){
        try {
            return s_ObjectMapper.readerFor(type).readValue(json);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
