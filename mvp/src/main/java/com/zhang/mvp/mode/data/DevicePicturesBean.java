package com.zhang.mvp.mode.data;

import java.util.List;

public class DevicePicturesBean {


    private boolean success;
    private String message;
    private int code;
    private ResultBean result;

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

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        private List<RecordsBean> records;
        private int total;
        private int size;
        private int current;
        private List<?> orders;
        private boolean searchCount;
        private int pages;


        public List<RecordsBean> getRecords() {
            return records;
        }

        public void setRecords(List<RecordsBean> records) {
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

        public static class RecordsBean {
            private String id;
            private Object createBy;
            private String createTime;
            private Object updateBy;
            private String updateTime;
            private int irSourceType;
            private String irEquipmentId;
            private String irPictureAddress;
            private String irPictureSource;
            private String irCollectionDate;
            private int quantity;

            public int getQuantity() {
                return quantity;
            }

            public void setQuantity(int quantity) {
                this.quantity = quantity;
            }
            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public Object getCreateBy() {
                return createBy;
            }

            public void setCreateBy(Object createBy) {
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

            public int getIrSourceType() {
                return irSourceType;
            }

            public void setIrSourceType(int irSourceType) {
                this.irSourceType = irSourceType;
            }

            public String getIrEquipmentId() {
                return irEquipmentId;
            }

            public void setIrEquipmentId(String irEquipmentId) {
                this.irEquipmentId = irEquipmentId;
            }

            public String getIrPictureAddress() {
                return irPictureAddress;
            }

            public void setIrPictureAddress(String irPictureAddress) {
                this.irPictureAddress = irPictureAddress;
            }

            public String getIrPictureSource() {
                return irPictureSource;
            }

            public void setIrPictureSource(String irPictureSource) {
                this.irPictureSource = irPictureSource;
            }

            public String getIrCollectionDate() {
                return irCollectionDate;
            }

            public void setIrCollectionDate(String irCollectionDate) {
                this.irCollectionDate = irCollectionDate;
            }
        }
    }
}
