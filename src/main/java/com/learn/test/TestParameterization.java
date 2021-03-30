package com.learn.test;

import com.learn.bean.ExtractDateParameterBean;
import com.learn.bean.ParameterBean;
import com.learn.bean.SourceBean;

public class TestParameterization {

    public SourceBean getSourceBean() {

        String parameterName ="initialExtractDate";
        String parameterDefaultValue = "2021-03-14";
        String parameterIntegrationValue = "2020-12-11";
        String parameterRuntimeValue = "2020-12-13";

        ParameterBean parameterBean = new ExtractDateParameterBean(parameterName,
                parameterDefaultValue,parameterIntegrationValue,parameterRuntimeValue);

        String extractStrategyType = "Full";

        SourceBean sourceBean = new SourceBean(extractStrategyType, parameterBean);

        return sourceBean;
    }



    public static void main(String[] args) {
        SourceBean sourceBean = new TestParameterization().getSourceBean();




    }
}
