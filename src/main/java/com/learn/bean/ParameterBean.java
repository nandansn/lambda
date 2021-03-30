package com.learn.bean;

public class ParameterBean {

    String parameterName;
    String parameterDefaultValue;
    String parameterIntegrationValue;
    String parameterRuntimeValue;

    public ParameterBean(String parameterName, String parameterDefaultValue, String parameterIntegrationValue,
                         String parameterRuntimeValue) {
        this.parameterName = parameterName;
        this.parameterDefaultValue = parameterDefaultValue;
        this.parameterIntegrationValue = parameterIntegrationValue;
        this.parameterRuntimeValue = parameterRuntimeValue;
    }

    public String getParameterName() {
        return parameterName;
    }

    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }

    public String getParameterDefaultValue() {
        return parameterDefaultValue;
    }

    public void setParameterDefaultValue(String parameterDefaultValue) {
        this.parameterDefaultValue = parameterDefaultValue;
    }

    public String getParameterIntegrationValue() {
        return parameterIntegrationValue;
    }

    public void setParameterIntegrationValue(String parameterIntegrationValue) {
        this.parameterIntegrationValue = parameterIntegrationValue;
    }

    public String getParameterRuntimeValue() {
        return parameterRuntimeValue;
    }

    public void setParameterRuntimeValue(String parameterRuntimeValue) {
        this.parameterRuntimeValue = parameterRuntimeValue;
    }
}
