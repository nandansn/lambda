package com.learn.bean;

public class SourceBean {

    String extractStrategyType;
    ParameterBean parameterBean;


    public SourceBean(String extractStrategyType, ParameterBean parameterBean) {
        this.extractStrategyType = extractStrategyType;
        this.parameterBean = parameterBean;
    }

    public String getExtractStrategyType() {
        return extractStrategyType;
    }

    public void setExtractStrategyType(String extractStrategyType) {
        this.extractStrategyType = extractStrategyType;
    }

    public ParameterBean getParameterBean() {
        return parameterBean;
    }

    public void setParameterBean(ParameterBean parameterBean) {
        this.parameterBean = parameterBean;
    }
}
