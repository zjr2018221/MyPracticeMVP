package com.zhang.mvp.mode.data;

import java.io.Serializable;
import java.util.List;

/**
 * `*@author LiangYuWei
 *
 * @description:
 * @date :2022/1/10 14:21
 */
public class BacklogDisposePoliceBean implements Serializable {

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

    public static class ResultDTO implements Serializable {
        private List<RecordsDTO> records;
        private int total;
        private int size;
        private int current;
        private List<?> orders;
        private boolean searchCount;
        private int pages;

        public List<RecordsDTO> getRecords() {
            return records;
        }

        public void setRecords(List<RecordsDTO> records) {
            this.records = records;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public int getCurrent() {
            return current;
        }

        public void setCurrent(int current) {
            this.current = current;
        }

        public List<?> getOrders() {
            return orders;
        }

        public void setOrders(List<?> orders) {
            this.orders = orders;
        }

        public boolean isSearchCount() {
            return searchCount;
        }

        public void setSearchCount(boolean searchCount) {
            this.searchCount = searchCount;
        }

        public int getPages() {
            return pages;
        }

        public void setPages(int pages) {
            this.pages = pages;
        }

        public static class RecordsDTO implements Serializable {
            private String id;
            private String equipmentId;
            private String linkman;
            private String linkmanEamil;
            private String linkmanPhone;
            private String content;
            private int alarmType;
            private String alarmDate;
            private String alarmContactsId;
            private String equipmentName;
            private String equipmentNumber;
            private String status;
            private Object alarmFeedbackInfo;
            private Object productName;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getEquipmentId() {
                return equipmentId;
            }

            public void setEquipmentId(String equipmentId) {
                this.equipmentId = equipmentId;
            }

            public String getLinkman() {
                return linkman;
            }

            public void setLinkman(String linkman) {
                this.linkman = linkman;
            }

            public String getLinkmanEamil() {
                return linkmanEamil;
            }

            public void setLinkmanEamil(String linkmanEamil) {
                this.linkmanEamil = linkmanEamil;
            }

            public String getLinkmanPhone() {
                return linkmanPhone;
            }

            public void setLinkmanPhone(String linkmanPhone) {
                this.linkmanPhone = linkmanPhone;
            }

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public int getAlarmType() {
                return alarmType;
            }

            public void setAlarmType(int alarmType) {
                this.alarmType = alarmType;
            }

            public String getAlarmDate() {
                return alarmDate;
            }

            public void setAlarmDate(String alarmDate) {
                this.alarmDate = alarmDate;
            }

            public String getAlarmContactsId() {
                return alarmContactsId;
            }

            public void setAlarmContactsId(String alarmContactsId) {
                this.alarmContactsId = alarmContactsId;
            }

            public String getEquipmentName() {
                return equipmentName;
            }

            public void setEquipmentName(String equipmentName) {
                this.equipmentName = equipmentName;
            }

            public String getEquipmentNumber() {
                return equipmentNumber;
            }

            public void setEquipmentNumber(String equipmentNumber) {
                this.equipmentNumber = equipmentNumber;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public Object getAlarmFeedbackInfo() {
                return alarmFeedbackInfo;
            }

            public void setAlarmFeedbackInfo(Object alarmFeedbackInfo) {
                this.alarmFeedbackInfo = alarmFeedbackInfo;
            }

            public Object getProductName() {
                return productName;
            }

            public void setProductName(Object productName) {
                this.productName = productName;
            }
        }
    }
}
