package com.sdk.test.sdk.beans;

public class ParameterSdkBean {

    String name;
    String defaultValue;
    String integrationTaskValue;
    String runTimeTaskValue;

    public ParameterSdkBean(String name, String defaultValue, String integrationTaskValue, String runTimeTaskValue) {
        this.name = name;
        this.defaultValue = defaultValue;
        this.integrationTaskValue = integrationTaskValue;
        this.runTimeTaskValue = runTimeTaskValue;
    }
}
