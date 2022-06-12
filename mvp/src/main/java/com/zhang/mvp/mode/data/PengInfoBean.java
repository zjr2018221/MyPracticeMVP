package com.zhang.mvp.mode.data;

import java.util.List;

public class PengInfoBean {

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
        private List<SingleGroupDTO> singleGroup;
        private List<MultipleGroupDTO> multipleGroup;

        public List<SingleGroupDTO> getSingleGroup() {
            return singleGroup;
        }

        public void setSingleGroup(List<SingleGroupDTO> singleGroup) {
            this.singleGroup = singleGroup;
        }

        public List<MultipleGroupDTO> getMultipleGroup() {
            return multipleGroup;
        }

        public void setMultipleGroup(List<MultipleGroupDTO> multipleGroup) {
            this.multipleGroup = multipleGroup;
        }

        public static class SingleGroupDTO {
            private String id;
            private String state;
            private String name;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getState() {
                return state;
            }

            public void setState(String state) {
                this.state = state;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }

        public static class MultipleGroupDTO {
            private String groupName;
            private String executingId;
            private Object executingName;
            private String state;
            private int countDown;

            public int getMaxExecuteTime() {
                return maxExecuteTime;
            }

            public void setMaxExecuteTime(int maxExecuteTime) {
                this.maxExecuteTime = maxExecuteTime;
            }

            private int maxExecuteTime;
            private List<EquipmentControlVosDTO> equipmentControlVos;

            public String getGroupName() {
                return groupName;
            }

            public void setGroupName(String groupName) {
                this.groupName = groupName;
            }

            public String getExecutingId() {
                return executingId;
            }

            public void setExecutingId(String executingId) {
                this.executingId = executingId;
            }

            public Object getExecutingName() {
                return executingName;
            }

            public void setExecutingName(Object executingName) {
                this.executingName = executingName;
            }

            public String getState() {
                return state;
            }

            public void setState(String state) {
                this.state = state;
            }

            public int getCountDown() {
                return countDown;
            }

            public void setCountDown(int countDown) {
                this.countDown = countDown;
            }

            public List<EquipmentControlVosDTO> getEquipmentControlVos() {
                return equipmentControlVos;
            }

            public void setEquipmentControlVos(List<EquipmentControlVosDTO> equipmentControlVos) {
                this.equipmentControlVos = equipmentControlVos;
            }

            public static class EquipmentControlVosDTO {
                private String id;
                private String name;
                private String executeTime;

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getExecuteTime() {
                    return executeTime;
                }

                public void setExecuteTime(String executeTime) {
                    this.executeTime = executeTime;
                }
            }
        }
    }
}
