package com.zhang.mvp.mode.data;

import java.io.Serializable;
import java.util.List;

/**
 * `*@author LiangYuWei
 *
 * @description:
 * @date :2022/1/6 20:09
 */
public class EquipmentCenterBean {

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
            private String productId;
            private Object liveAddress;
            private Object channelNumber;
            private Object hdAddress;
            private int createType;
            private Object mqttPub;
            private int control;
            private Object vender;
            private String equipmentNumber;
            private String productName;
            private Object mqttSub;
            private String itemName;
            private int equipmentMode;
            private int equipmentState;
            private String consumable;
            private Object appId;
            private String cloudPlatformType;
            private Object ruleName;
            private String equipmentName;
            private Object appSecret;
            private String id;
            private String createType_dictText;
            private Object expirationDate;
            private String createDate;

            public String getProductId() {
                return productId;
            }

            public void setProductId(String productId) {
                this.productId = productId;
            }

            public Object getLiveAddress() {
                return liveAddress;
            }

            public void setLiveAddress(Object liveAddress) {
                this.liveAddress = liveAddress;
            }

            public Object getChannelNumber() {
                return channelNumber;
            }

            public void setChannelNumber(Object channelNumber) {
                this.channelNumber = channelNumber;
            }

            public Object getHdAddress() {
                return hdAddress;
            }

            public void setHdAddress(Object hdAddress) {
                this.hdAddress = hdAddress;
            }

            public int getCreateType() {
                return createType;
            }

            public void setCreateType(int createType) {
                this.createType = createType;
            }

            public Object getMqttPub() {
                return mqttPub;
            }

            public void setMqttPub(Object mqttPub) {
                this.mqttPub = mqttPub;
            }

            public int getControl() {
                return control;
            }

            public void setControl(int control) {
                this.control = control;
            }

            public Object getVender() {
                return vender;
            }

            public void setVender(Object vender) {
                this.vender = vender;
            }

            public String getEquipmentNumber() {
                return equipmentNumber;
            }

            public void setEquipmentNumber(String equipmentNumber) {
                this.equipmentNumber = equipmentNumber;
            }

            public String getProductName() {
                return productName;
            }

            public void setProductName(String productName) {
                this.productName = productName;
            }

            public Object getMqttSub() {
                return mqttSub;
            }

            public void setMqttSub(Object mqttSub) {
                this.mqttSub = mqttSub;
            }

            public String getItemName() {
                return itemName;
            }

            public void setItemName(String itemName) {
                this.itemName = itemName;
            }

            public int getEquipmentMode() {
                return equipmentMode;
            }

            public void setEquipmentMode(int equipmentMode) {
                this.equipmentMode = equipmentMode;
            }

            public int getEquipmentState() {
                return equipmentState;
            }

            public void setEquipmentState(int equipmentState) {
                this.equipmentState = equipmentState;
            }

            public String getConsumable() {
                return consumable;
            }

            public void setConsumable(String consumable) {
                this.consumable = consumable;
            }

            public Object getAppId() {
                return appId;
            }

            public void setAppId(Object appId) {
                this.appId = appId;
            }

            public String getCloudPlatformType() {
                return cloudPlatformType;
            }

            public void setCloudPlatformType(String cloudPlatformType) {
                this.cloudPlatformType = cloudPlatformType;
            }

            public Object getRuleName() {
                return ruleName;
            }

            public void setRuleName(Object ruleName) {
                this.ruleName = ruleName;
            }

            public String getEquipmentName() {
                return equipmentName;
            }

            public void setEquipmentName(String equipmentName) {
                this.equipmentName = equipmentName;
            }

            public Object getAppSecret() {
                return appSecret;
            }

            public void setAppSecret(Object appSecret) {
                this.appSecret = appSecret;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getCreateType_dictText() {
                return createType_dictText;
            }

            public void setCreateType_dictText(String createType_dictText) {
                this.createType_dictText = createType_dictText;
            }

            public Object getExpirationDate() {
                return expirationDate;
            }

            public void setExpirationDate(Object expirationDate) {
                this.expirationDate = expirationDate;
            }

            public String getCreateDate() {
                return createDate;
            }

            public void setCreateDate(String createDate) {
                this.createDate = createDate;
            }
        }
    }
}
