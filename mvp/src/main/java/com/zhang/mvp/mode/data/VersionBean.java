package com.zhang.mvp.mode.data;

/**
 * `*@author LiangYuWei
 *
 * @description:
 * @date :2022/1/17 16:50
 */
public class VersionBean {

    private boolean success;
    private String message;
    private int code;
    private ResultDTO result;

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

    public ResultDTO getResult() {
        return result;
    }

    public void setResult(ResultDTO result) {
        this.result = result;
    }

    public static class ResultDTO {
        private int ionCation;
        private String tionAddress;

        public int getIonCation() {
            return ionCation;
        }

        public void setIonCation(int ionCation) {
            this.ionCation = ionCation;
        }

        public String getTionAddress() {
            return tionAddress;
        }

        public void setTionAddress(String tionAddress) {
            this.tionAddress = tionAddress;
        }
    }
}
