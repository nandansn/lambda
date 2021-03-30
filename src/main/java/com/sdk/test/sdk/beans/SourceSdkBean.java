package com.sdk.test.sdk.beans;

public class SourceSdkBean {

    DateParameterSdkBean dateParameterSdkBean;

    ConnectionParameterSdkBean connectionParameterSdkBean;

    EntityParamterSdkBean entityParamterSdkBean;

    public SourceSdkBean(DateParameterSdkBean dateParameterSdkBean,
                         ConnectionParameterSdkBean connectionParameterSdkBean,
                         EntityParamterSdkBean entityParamterSdkBean) {
        this.dateParameterSdkBean = dateParameterSdkBean;
        this.connectionParameterSdkBean = connectionParameterSdkBean;
        this.entityParamterSdkBean = entityParamterSdkBean;
    }
}
