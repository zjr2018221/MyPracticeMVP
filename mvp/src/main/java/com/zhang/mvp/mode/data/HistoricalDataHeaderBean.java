package com.zhang.mvp.mode.data;

import java.util.List;

public class HistoricalDataHeaderBean {

    private boolean success;
    private String message;
    private int code;
    private List<ResultBean> result;


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

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean {
        private String id;
        private String englishFieldName;
        private String chineseFieldName;
        private String fieldUnit;

        public String getFieldUnit() {
            return fieldUnit;
        }

        public void setFieldUnit(String fieldUnit) {
            this.fieldUnit = fieldUnit;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getEnglishFieldName() {
            return englishFieldName;
        }

        public void setEnglishFieldName(String englishFieldName) {
            this.englishFieldName = englishFieldName;
        }

        public String getChineseFieldName() {
            return chineseFieldName;
        }

        public void setChineseFieldName(String chineseFieldName) {
            this.chineseFieldName = chineseFieldName;
        }
    }
}
