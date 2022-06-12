package com.zhang.mvp.mode.data;

/**
 * `*@author LiangYuWei
 *
 * @description:
 * @date :2022/1/10 16:15
 */
public class BacklogDisposePoliceDetailsBean {

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
        private AlarmFeedbackInfoDTO alarmFeedbackInfo;
        private String productName;

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

        public AlarmFeedbackInfoDTO getAlarmFeedbackInfo() {
            return alarmFeedbackInfo;
        }

        public void setAlarmFeedbackInfo(AlarmFeedbackInfoDTO alarmFeedbackInfo) {
            this.alarmFeedbackInfo = alarmFeedbackInfo;
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public static class AlarmFeedbackInfoDTO {
            private String id;
            private String equipmentId;
            private String alarmId;
            private String resultInfo;
            private String sceneImg;
            private String executorId;
            private String processingTime;
            private Object createBy;
            private Object createTime;
            private Object updateBy;
            private Object updateTime;
            private Object remarks;
            private Object equipmentNumber;
            private Object equipmentName;
            private Object content;
            private Object linkman;

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

            public String getAlarmId() {
                return alarmId;
            }

            public void setAlarmId(String alarmId) {
                this.alarmId = alarmId;
            }

            public String getResultInfo() {
                return resultInfo;
            }

            public void setResultInfo(String resultInfo) {
                this.resultInfo = resultInfo;
            }

            public String getSceneImg() {
                return sceneImg;
            }

            public void setSceneImg(String sceneImg) {
                this.sceneImg = sceneImg;
            }

            public String getExecutorId() {
                return executorId;
            }

            public void setExecutorId(String executorId) {
                this.executorId = executorId;
            }

            public String getProcessingTime() {
                return processingTime;
            }

            public void setProcessingTime(String processingTime) {
                this.processingTime = processingTime;
            }

            public Object getCreateBy() {
                return createBy;
            }

            public void setCreateBy(Object createBy) {
                this.createBy = createBy;
            }

            public Object getCreateTime() {
                return createTime;
            }

            public void setCreateTime(Object createTime) {
                this.createTime = createTime;
            }

            public Object getUpdateBy() {
                return updateBy;
            }

            public void setUpdateBy(Object updateBy) {
                this.updateBy = updateBy;
            }

            public Object getUpdateTime() {
                return updateTime;
            }

            public void setUpdateTime(Object updateTime) {
                this.updateTime = updateTime;
            }

            public Object getRemarks() {
                return remarks;
            }

            public void setRemarks(Object remarks) {
                this.remarks = remarks;
            }

            public Object getEquipmentNumber() {
                return equipmentNumber;
            }

            public void setEquipmentNumber(Object equipmentNumber) {
                this.equipmentNumber = equipmentNumber;
            }

            public Object getEquipmentName() {
                return equipmentName;
            }

            public void setEquipmentName(Object equipmentName) {
                this.equipmentName = equipmentName;
            }

            public Object getContent() {
                return content;
            }

            public void setContent(Object content) {
                this.content = content;
            }

            public Object getLinkman() {
                return linkman;
            }

            public void setLinkman(Object linkman) {
                this.linkman = linkman;
            }
        }
    }
}
