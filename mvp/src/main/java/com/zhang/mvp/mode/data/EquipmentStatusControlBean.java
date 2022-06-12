package com.zhang.mvp.mode.data;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class EquipmentStatusControlBean implements Serializable {


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

    public static class ResultBean implements Serializable {
        @SerializedName("1")
        private List<_$1Bean> _$1;
        @SerializedName("2")
        private List<_$2Bean> _$2;
        @SerializedName("3")
        private List<_$3Bean> _$3;
        private EquipmentDataBean equipmentData;
        private int control;
        private String createDate;

        public String getCreateDate() {
            return createDate;
        }

        public void setCreateDate(String createDate) {
            this.createDate = createDate;
        }

        public List<_$1Bean> get_$1() {
            return _$1;
        }

        public void set_$1(List<_$1Bean> _$1) {
            this._$1 = _$1;
        }

        public List<_$2Bean> get_$2() {
            return _$2;
        }

        public void set_$2(List<_$2Bean> _$2) {
            this._$2 = _$2;
        }

        public List<_$3Bean> get_$3() {
            return _$3;
        }

        public void set_$3(List<_$3Bean> _$3) {
            this._$3 = _$3;
        }

        public EquipmentDataBean getEquipmentData() {
            return equipmentData;
        }

        public void setEquipmentData(EquipmentDataBean equipmentData) {
            this.equipmentData = equipmentData;
        }

        public int getControl() {
            return control;
        }

        public void setControl(int control) {
            this.control = control;
        }

        public static class EquipmentDataBean {
            private String itemName;
            private String equipmentName;
            private String equipmentNumber;
            private String productName;

            public String getItemName() {
                return itemName;
            }

            public void setItemName(String itemName) {
                this.itemName = itemName;
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

            public String getProductName() {
                return productName;
            }

            public void setProductName(String productName) {
                this.productName = productName;
            }
        }

        public static class _$1Bean implements Serializable {
            private String unit;
            private String name;
            private String value;

            public String getUnit() {
                return unit;
            }

            public void setUnit(String unit) {
                this.unit = unit;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getValue() {
                return value;
            }

            public void setValue(String value) {
                this.value = value;
            }
        }

        public static class _$2Bean implements Serializable {
            private String unit;
            private String name;
            private String value;

            public String getUnit() {
                return unit;
            }

            public void setUnit(String unit) {
                this.unit = unit;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getValue() {
                return value;
            }

            public void setValue(String value) {
                this.value = value;
            }
        }

        public static class _$3Bean implements Serializable {
            private String name;
            private String id;
            private String type;
            private List<CommandBean> command;
            private int status;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public List<CommandBean> getCommand() {
                return command;
            }

            public void setCommand(List<CommandBean> command) {
                this.command = command;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public static class CommandBean implements Serializable {
                private int min;
                private int max;
                private String name;
                private String value;

                public int getMin() {
                    return min;
                }

                public void setMin(int min) {
                    this.min = min;
                }

                public int getMax() {
                    return max;
                }

                public void setMax(int max) {
                    this.max = max;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getValue() {
                    return value;
                }

                public void setValue(String value) {
                    this.value = value;
                }
            }
        }
    }
}
