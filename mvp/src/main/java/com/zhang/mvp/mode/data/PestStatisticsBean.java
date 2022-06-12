package com.zhang.mvp.mode.data;

import java.util.List;

public class PestStatisticsBean {


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
        private List<StatisticsTimeBean> statisticsTime;
        private List<InsectNumsBean> insectNums;
        private List<InsectListBean> insectList;
        private int totalNum;

        public List<StatisticsTimeBean> getStatisticsTime() {
            return statisticsTime;
        }

        public void setStatisticsTime(List<StatisticsTimeBean> statisticsTime) {
            this.statisticsTime = statisticsTime;
        }

        public List<InsectNumsBean> getInsectNums() {
            return insectNums;
        }

        public void setInsectNums(List<InsectNumsBean> insectNums) {
            this.insectNums = insectNums;
        }

        public List<InsectListBean> getInsectList() {
            return insectList;
        }

        public void setInsectList(List<InsectListBean> insectList) {
            this.insectList = insectList;
        }

        public int getTotalNum() {
            return totalNum;
        }

        public void setTotalNum(int totalNum) {
            this.totalNum = totalNum;
        }

        public static class StatisticsTimeBean {
            private String caseTime;
            private int num;

            public String getCaseTime() {
                return caseTime;
            }

            public void setCaseTime(String caseTime) {
                this.caseTime = caseTime;
            }

            public int getNum() {
                return num;
            }

            public void setNum(int num) {
                this.num = num;
            }
        }

        public static class InsectNumsBean {
            private String name;
            private int num;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getNum() {
                return num;
            }

            public void setNum(int num) {
                this.num = num;
            }
        }

        public static class InsectListBean {
            private String insectName;
            private String num;
            private String gatherTime;
            private String eqId;
            private String eqNum;

            public String getInsectName() {
                return insectName;
            }

            public void setInsectName(String insectName) {
                this.insectName = insectName;
            }

            public String getNum() {
                return num;
            }

            public void setNum(String num) {
                this.num = num;
            }

            public String getGatherTime() {
                return gatherTime;
            }

            public void setGatherTime(String gatherTime) {
                this.gatherTime = gatherTime;
            }

            public String getEqId() {
                return eqId;
            }

            public void setEqId(String eqId) {
                this.eqId = eqId;
            }

            public String getEqNum() {
                return eqNum;
            }

            public void setEqNum(String eqNum) {
                this.eqNum = eqNum;
            }
        }
    }
}
