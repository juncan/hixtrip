package com.hixtrip.sample.app.core.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.hixtrip.sample.app.core.constant.CoreConstant;
import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * 通用返回对象
 * @author xingkong
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Accessors(chain = true)
public class R<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 成功标记
     */
    public static final Integer SUCCESS = CoreConstant.SUCCESS;
    public static final String SUCCESS_MSG = CoreConstant.SUCCESS_MSG;

    /**
     * 失败标记
     */
    public static final Integer FAIL = CoreConstant.FAIL;
    public static final String FAIL_MSG = CoreConstant.FAIL_MSG;

    /**
     * 返回标记：成功标记=200，失败标记=500
     */
    private Integer code;

    /**
     * 返回信息
     */
    private String msg;

    /**
     * 数据
     */
    private T data;

    /**
     * 扩展
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Map<String, Object> ext;

    private R(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public R<T> put(String key, Object value) {
        if (ext == null) {
            ext = new HashMap<>();
        }
        ext.put(key, value);
        return this;
    }

    public R<T> remove(String key) {
        if (ext != null) {
            ext.remove(key);
        }
        return this;
    }

    @JsonIgnore
    @JSONField(serialize = false, deserialize = false)
    public boolean isOk() {
        return SUCCESS.equals(getCode());
    }

    @JsonIgnore
    @JSONField(serialize = false, deserialize = false)
    public boolean isFail() {
        return !isOk();
    }

    public static <T> R<T> ok() {
        return result(SUCCESS, SUCCESS_MSG, null);
    }

    public static <T> R<T> ok(T data) {
        return result(SUCCESS, SUCCESS_MSG, data);
    }

    public static <T> R<T> ok(T data, String msg) {
        return result(SUCCESS, msg, data);
    }

    public static <T> R<T> fail() {
        return result(FAIL, FAIL_MSG, null);
    }

    public static <T> R<T> fail(String msg) {
        return result(FAIL, msg, null);
    }

    public static <T> R<T> fail(T data) {
        return result(FAIL, FAIL_MSG, data);
    }

    public static <T> R<T> fail(T data, String msg) {
        return result(FAIL, msg, data);
    }

    public static <T> R<T> fail(int code, T data, String msg) {
        return result(code, msg, data);
    }

    public static <T> R<T> result(int code, String msg, T data) {
        return new R<>(code, msg, data);
    }
}
