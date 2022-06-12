package com.zhang.mvp.mode.data;

import java.io.Serializable;
import java.util.List;

/**
 * *@author LiangYuWei
 *
 * @description:
 * @date :2022/1/7 20:49
 */
public class BacklogFarmingTaskBean implements Serializable {
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
            private String createBy;
            private String createTime;
            private Object updateBy;
            private String updateTime;
            private String taRegion;
            private String taCropType;
            private String taFarminType;
            private String taPlanStart;
            private String taPlanEnd;
            private String taExecutorId;
            private String taState;
            private String taDescribe;
            private Object extend;
            private String siteTypeName;
            private String siteName;
            private String inName;
            private String ftFarminName;
            private String name;
            private String stateName;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getCreateBy() {
                return createBy;
            }

            public void setCreateBy(String createBy) {
                this.createBy = createBy;
            }

            public String getCreateTime() {
                return createTime;
            }

            public void setCreateTime(String createTime) {
                this.createTime = createTime;
            }

            public Object getUpdateBy() {
                return updateBy;
            }

            public void setUpdateBy(Object updateBy) {
                this.updateBy = updateBy;
            }

            public String getUpdateTime() {
                return updateTime;
            }

            public void setUpdateTime(String updateTime) {
                this.updateTime = updateTime;
            }

            public String getTaRegion() {
                return taRegion;
            }

            public void setTaRegion(String taRegion) {
                this.taRegion = taRegion;
            }

            public String getTaCropType() {
                return taCropType;
            }

            public void setTaCropType(String taCropType) {
                this.taCropType = taCropType;
            }

            public String getTaFarminType() {
                return taFarminType;
            }

            public void setTaFarminType(String taFarminType) {
                this.taFarminType = taFarminType;
            }

            public String getTaPlanStart() {
                return taPlanStart;
            }

            public void setTaPlanStart(String taPlanStart) {
                this.taPlanStart = taPlanStart;
            }

            public String getTaPlanEnd() {
                return taPlanEnd;
            }

            public void setTaPlanEnd(String taPlanEnd) {
                this.taPlanEnd = taPlanEnd;
            }

            public String getTaExecutorId() {
                return taExecutorId;
            }

            public void setTaExecutorId(String taExecutorId) {
                this.taExecutorId = taExecutorId;
            }

            public String getTaState() {
                return taState;
            }

            public void setTaState(String taState) {
                this.taState = taState;
            }

            public String getTaDescribe() {
                return taDescribe;
            }

            public void setTaDescribe(String taDescribe) {
                this.taDescribe = taDescribe;
            }

            public Object getExtend() {
                return extend;
            }

            public void setExtend(Object extend) {
                this.extend = extend;
            }

            public String getSiteTypeName() {
                return siteTypeName;
            }

            public void setSiteTypeName(String siteTypeName) {
                this.siteTypeName = siteTypeName;
            }

            public String getSiteName() {
                return siteName;
            }

            public void setSiteName(String siteName) {
                this.siteName = siteName;
            }

            public String getInName() {
                return inName;
            }

            public void setInName(String inName) {
                this.inName = inName;
            }

            public String getFtFarminName() {
                return ftFarminName;
            }

            public void setFtFarminName(String ftFarminName) {
                this.ftFarminName = ftFarminName;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getStateName() {
                return stateName;
            }

            public void setStateName(String stateName) {
                this.stateName = stateName;
            }
        }
    }
}
