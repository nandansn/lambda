package com.sdk.test.beans;

public class ParameterBean {

    String name;
    String defaultValue;
    String integrationTaskValue;
    String runTimeTaskValue;

    public ParameterBean(String name, String defaultValue, String integrationTaskValue, String runTimeTaskValue) {
        this.name = name;
        this.defaultValue = defaultValue;
        this.integrationTaskValue = integrationTaskValue;
        this.runTimeTaskValue = runTimeTaskValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public String getIntegrationTaskValue() {
        return integrationTaskValue;
    }

    public void setIntegrationTaskValue(String integrationTaskValue) {
        this.integrationTaskValue = integrationTaskValue;
    }

    public String getRunTimeTaskValue() {
        return runTimeTaskValue;
    }

    public void setRunTimeTaskValue(String runTimeTaskValue) {
        this.runTimeTaskValue = runTimeTaskValue;
    }
}
