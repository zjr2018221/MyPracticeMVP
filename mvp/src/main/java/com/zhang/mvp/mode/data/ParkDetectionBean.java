package com.zhang.mvp.mode.data;

import java.util.List;

/**
 * `*@author LiangYuWei
 *
 * @description:
 * @date :2022/1/11 9:42
 */
public class ParkDetectionBean {

    private int code;
    private String message;
    private ResultDTO result;
    private boolean success;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ResultDTO getResult() {
        return result;
    }

    public void setResult(ResultDTO result) {
        this.result = result;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public static class ResultDTO {
        private List<EquipmentNumDTO> equipmentNum;
        private List<ItemsDTO> items;
        private String title;
        private WaitDealDTO waitDeal;
        private WeatherDTO weather;

        public List<EquipmentNumDTO> getEquipmentNum() {
            return equipmentNum;
        }

        public void setEquipmentNum(List<EquipmentNumDTO> equipmentNum) {
            this.equipmentNum = equipmentNum;
        }

        public List<ItemsDTO> getItems() {
            return items;
        }

        public void setItems(List<ItemsDTO> items) {
            this.items = items;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public WaitDealDTO getWaitDeal() {
            return waitDeal;
        }

        public void setWaitDeal(WaitDealDTO waitDeal) {
            this.waitDeal = waitDeal;
        }

        public WeatherDTO getWeather() {
            return weather;
        }

        public void setWeather(WeatherDTO weather) {
            this.weather = weather;
        }

        public static class WaitDealDTO {
            private int alarmNum;
            private int msgNum;
            private int plantTaskNum;

            public int getAlarmNum() {
                return alarmNum;
            }

            public void setAlarmNum(int alarmNum) {
                this.alarmNum = alarmNum;
            }

            public int getMsgNum() {
                return msgNum;
            }

            public void setMsgNum(int msgNum) {
                this.msgNum = msgNum;
            }

            public int getPlantTaskNum() {
                return plantTaskNum;
            }

            public void setPlantTaskNum(int plantTaskNum) {
                this.plantTaskNum = plantTaskNum;
            }
        }

        public static class WeatherDTO {
            private double atmosphericPressure;
            private double co2;
            private String createDate;
            private String eqId;
            private double humidity;
            private String id;
            private double illuminance;
            private double pm2_5;
            private double rainfall;
            private double soilMoisture;
            private double soilTemperature;
            private double temperature;
            private double windDirection;
            private String windDirectionStr;
            private double windSpeed;

            public double getAtmosphericPressure() {
                return atmosphericPressure;
            }

            public void setAtmosphericPressure(double atmosphericPressure) {
                this.atmosphericPressure = atmosphericPressure;
            }

            public double getCo2() {
                return co2;
            }

            public void setCo2(double co2) {
                this.co2 = co2;
            }

            public String getCreateDate() {
                return createDate;
            }

            public void setCreateDate(String createDate) {
                this.createDate = createDate;
            }

            public String getEqId() {
                return eqId;
            }

            public void setEqId(String eqId) {
                this.eqId = eqId;
            }

            public double getHumidity() {
                return humidity;
            }

            public void setHumidity(double humidity) {
                this.humidity = humidity;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public double getIlluminance() {
                return illuminance;
            }

            public void setIlluminance(double illuminance) {
                this.illuminance = illuminance;
            }

            public double getPm2_5() {
                return pm2_5;
            }

            public void setPm2_5(double pm2_5) {
                this.pm2_5 = pm2_5;
            }

            public double getRainfall() {
                return rainfall;
            }

            public void setRainfall(double rainfall) {
                this.rainfall = rainfall;
            }

            public double getSoilMoisture() {
                return soilMoisture;
            }

            public void setSoilMoisture(double soilMoisture) {
                this.soilMoisture = soilMoisture;
            }

            public double getSoilTemperature() {
                return soilTemperature;
            }

            public void setSoilTemperature(double soilTemperature) {
                this.soilTemperature = soilTemperature;
            }

            public double getTemperature() {
                return temperature;
            }

            public void setTemperature(double temperature) {
                this.temperature = temperature;
            }

            public double getWindDirection() {
                return windDirection;
            }

            public void setWindDirection(double windDirection) {
                this.windDirection = windDirection;
            }

            public String getWindDirectionStr() {
                return windDirectionStr;
            }

            public void setWindDirectionStr(String windDirectionStr) {
                this.windDirectionStr = windDirectionStr;
            }

            public double getWindSpeed() {
                return windSpeed;
            }

            public void setWindSpeed(double windSpeed) {
                this.windSpeed = windSpeed;
            }
        }

        public static class EquipmentNumDTO {
            private String id;
            private int num;
            private String productName;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public int getNum() {
                return num;
            }

            public void setNum(int num) {
                this.num = num;
            }

            public String getProductName() {
                return productName;
            }

            public void setProductName(String productName) {
                this.productName = productName;
            }
        }

        public static class ItemsDTO {
            private String detailName;
            private String id;
            private String name;

            public String getDetailName() {
                return detailName;
            }

            public void setDetailName(String detailName) {
                this.detailName = detailName;
            }

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
        }
    }
}
