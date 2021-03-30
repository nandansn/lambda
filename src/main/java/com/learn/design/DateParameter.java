package com.learn.design;

import com.learn.bean.ParameterBean;

import java.util.List;

public class DateParameter<T extends ParameterBean> implements Parameter<T> {
    NodeOperator nodeOperator;
    T parameterBean;
    List<String> params;

    public DateParameter(NodeOperator nodeOperator, T parameterBean, List<String> params) {
        this.nodeOperator = nodeOperator;
        this.parameterBean = parameterBean;
        this.params = params;
    }

    @Override
    public void assignParameter(NodeOperator nodeOperator, T parameterBean, List<String> params) {
        ParameterConfigs parameterConfigs = new ParameterConfigs(parameterBean);
        nodeOperator.setParameterConfigs(parameterConfigs);
    }
}
