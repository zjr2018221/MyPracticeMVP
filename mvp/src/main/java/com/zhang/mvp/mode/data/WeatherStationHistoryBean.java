package com.zhang.mvp.mode.data;

import com.google.gson.annotations.SerializedName;

public class WeatherStationHistoryBean {

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
        @SerializedName("AmbientTemperature")
        private String ambientTemperature;
        @SerializedName("CO2")
        private String cO2;
        @SerializedName("EC")
        private String eC;
        @SerializedName("LightIntensity")
        private String lightIntensity;
        @SerializedName("O2")
        private String o2;
        @SerializedName("PH")
        private String pH;
        @SerializedName("PM10")
        private String pM10;
        @SerializedName("PM2.5")
        private String _$PM25125;// FIXME check this code
        @SerializedName("SoilMoisture")
        private String soilMoisture;
        @SerializedName("SoilTemperature")
        private String soilTemperature;
        private String lightControl;
        private String temperature;

        public String getAmbientTemperature() {
            return ambientTemperature;
        }

        public void setAmbientTemperature(String ambientTemperature) {
            this.ambientTemperature = ambientTemperature;
        }

        public String getCO2() {
            return cO2;
        }

        public void setCO2(String cO2) {
            this.cO2 = cO2;
        }

        public String getEC() {
            return eC;
        }

        public void setEC(String eC) {
            this.eC = eC;
        }

        public String getLightIntensity() {
            return lightIntensity;
        }

        public void setLightIntensity(String lightIntensity) {
            this.lightIntensity = lightIntensity;
        }

        public String getO2() {
            return o2;
        }

        public void setO2(String o2) {
            this.o2 = o2;
        }

        public String getPH() {
            return pH;
        }

        public void setPH(String pH) {
            this.pH = pH;
        }

        public String getPM10() {
            return pM10;
        }

        public void setPM10(String pM10) {
            this.pM10 = pM10;
        }

        public String get_$PM25125() {
            return _$PM25125;
        }

        public void set_$PM25125(String _$PM25125) {
            this._$PM25125 = _$PM25125;
        }

        public String getSoilMoisture() {
            return soilMoisture;
        }

        public void setSoilMoisture(String soilMoisture) {
            this.soilMoisture = soilMoisture;
        }

        public String getSoilTemperature() {
            return soilTemperature;
        }

        public void setSoilTemperature(String soilTemperature) {
            this.soilTemperature = soilTemperature;
        }

        public String getLightControl() {
            return lightControl;
        }

        public void setLightControl(String lightControl) {
            this.lightControl = lightControl;
        }

        public String getTemperature() {
            return temperature;
        }

        public void setTemperature(String temperature) {
            this.temperature = temperature;
        }
    }
}
