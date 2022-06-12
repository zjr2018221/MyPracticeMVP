package com.zhang.mvp.mode.data;

/**
 * `*@author LiangYuWei
 *
 * @description:
 * @date :2022/1/15 10:21
 */
public class ChangePassWordBean {
    private boolean success;
    private String message;
    private int code;
    private String result;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
