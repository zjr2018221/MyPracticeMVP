package com.zhang.mvp.mode.data;

import java.util.List;

/**
 * `*@author LiangYuWei
 *
 * @description:
 * @date :2022/1/9 10:21
 */
public class MessageBean {

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

        public static class RecordsDTO {
            private String id;
            private String title;
            private String content;
            private String recipientId;
            private String type;
            private Object createBy;
            private String createTime;
            private String state;
            private Object readTime;
            private Object planId;
            private String recipientName;
            private Object createName;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public String getRecipientId() {
                return recipientId;
            }

            public void setRecipientId(String recipientId) {
                this.recipientId = recipientId;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
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

            public String getState() {
                return state;
            }

            public void setState(String state) {
                this.state = state;
            }

            public Object getReadTime() {
                return readTime;
            }

            public void setReadTime(Object readTime) {
                this.readTime = readTime;
            }

            public Object getPlanId() {
                return planId;
            }

            public void setPlanId(Object planId) {
                this.planId = planId;
            }

            public String getRecipientName() {
                return recipientName;
            }

            public void setRecipientName(String recipientName) {
                this.recipientName = recipientName;
            }

            public Object getCreateName() {
                return createName;
            }

            public void setCreateName(Object createName) {
                this.createName = createName;
            }
        }
    }
}
