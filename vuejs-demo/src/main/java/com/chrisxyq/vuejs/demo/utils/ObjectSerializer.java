package com.chrisxyq.vuejs.demo.utils;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author lcli
 * @date 2020/7/14
 */
public final class ObjectSerializer {
    private static final Gson GSON = new Gson();
    private static final String FROM_TIME="fromJson";
    private ObjectSerializer() {
    }

    /**
     * 对象转json
     * @param obj
     * @return
     */
    public static String toJson(Object obj) {
        try {
            return null == obj ? "" : GSON.toJson(obj);
        } catch (Exception e) {
            return "";
        }
    }

    /**
     * Json转对象
     * @param json
     * @param type new TypeToken<List<String>>() {}.getType()
     * @return
     */
    public static <T> T fromJson(String json, Type type) {
        try {
            return  GSON.fromJson(json, type);
        } catch (Exception e) {
        }
        return null;
    }


    /**
     * 为了bargain使用，Boolean
     * @param json
     * @param clazz
     * @param <T>
     * @return
     */
    public static <T> T fromGson(String json, Class<T> clazz) {
        try {
            return  GSON.fromJson(json, clazz);
        } catch (Exception e) {
        }
        return null;
    }


    public static <T> List<T> parseList(String json, Class<T> clazz){
        try {

            ArrayList<T> mList = new ArrayList<>();
            JsonArray array = new JsonParser().parse(json).getAsJsonArray();
            for(final JsonElement elem : array){
                mList.add(GSON.fromJson(elem, clazz));
            }
            return mList;
        } catch (Exception e) {
        }
        return Collections.emptyList();

    }
}
