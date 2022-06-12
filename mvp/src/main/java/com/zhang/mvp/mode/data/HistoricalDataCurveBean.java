package com.zhang.mvp.mode.data;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class HistoricalDataCurveBean {


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
            @SerializedName("PM2_5")
            private double pM2_5;
            @SerializedName("Temperature")
            private double temperature;
            @SerializedName("SoilTemperature")
            private double soilTemperature;
            @SerializedName("CO2")
            private double cO2;
            @SerializedName("Rainfall")
            private double rainfall;
            @SerializedName("WindSpeed")
            private double windSpeed;
            private String equipmentId;
            @SerializedName("AtmosphericPressure")
            private double atmosphericPressure;
            private int illuminance;
            private int deviceSwitchStatus;
            @SerializedName("Humidity")
            private double humidity;
            @SerializedName("SoilMoisture")
            private double soilMoisture;
            private String _id;
            private String id;
            @SerializedName("WindDirection")
            private double windDirection;
            private String createDate;

            public double getPM2_5() {
                return pM2_5;
            }

            public void setPM2_5(double pM2_5) {
                this.pM2_5 = pM2_5;
            }

            public double getTemperature() {
                return temperature;
            }

            public void setTemperature(double temperature) {
                this.temperature = temperature;
            }

            public double getSoilTemperature() {
                return soilTemperature;
            }

            public void setSoilTemperature(double soilTemperature) {
                this.soilTemperature = soilTemperature;
            }

            public double getCO2() {
                return cO2;
            }

            public void setCO2(double cO2) {
                this.cO2 = cO2;
            }

            public double getRainfall() {
                return rainfall;
            }

            public void setRainfall(double rainfall) {
                this.rainfall = rainfall;
            }

            public double getWindSpeed() {
                return windSpeed;
            }

            public void setWindSpeed(double windSpeed) {
                this.windSpeed = windSpeed;
            }

            public String getEquipmentId() {
                return equipmentId;
            }

            public void setEquipmentId(String equipmentId) {
                this.equipmentId = equipmentId;
            }

            public double getAtmosphericPressure() {
                return atmosphericPressure;
            }

            public void setAtmosphericPressure(double atmosphericPressure) {
                this.atmosphericPressure = atmosphericPressure;
            }

            public int getIlluminance() {
                return illuminance;
            }

            public void setIlluminance(int illuminance) {
                this.illuminance = illuminance;
            }

            public int getDeviceSwitchStatus() {
                return deviceSwitchStatus;
            }

            public void setDeviceSwitchStatus(int deviceSwitchStatus) {
                this.deviceSwitchStatus = deviceSwitchStatus;
            }

            public double getHumidity() {
                return humidity;
            }

            public void setHumidity(double humidity) {
                this.humidity = humidity;
            }

            public double getSoilMoisture() {
                return soilMoisture;
            }

            public void setSoilMoisture(double soilMoisture) {
                this.soilMoisture = soilMoisture;
            }

            public String get_id() {
                return _id;
            }

            public void set_id(String _id) {
                this._id = _id;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public double getWindDirection() {
                return windDirection;
            }

            public void setWindDirection(double windDirection) {
                this.windDirection = windDirection;
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
