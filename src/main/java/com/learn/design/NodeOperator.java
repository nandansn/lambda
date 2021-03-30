package com.learn.design;

import com.learn.bean.EntityParameterBean;
import com.learn.bean.ParameterBean;

import java.util.Arrays;

public class NodeOperator {

    ParameterConfigs parameterConfigs;

    public ParameterConfigs getParameterConfigs() {
        return parameterConfigs;
    }

    public void setParameterConfigs(ParameterConfigs parameterConfigs) {
        this.parameterConfigs = parameterConfigs;
    }

    public NodeOperator createOperator() {

        NodeOperator nodeOperator = new NodeOperator();

        String parameterName = "entityParam";
        String parameterDefaultValue = "SRC_TAB_1";
        String parameterIntegrationValue = "SRC_TAB_2";
        String parameterRuntimeValue = "SRC_TAB_3";

        EntityParameterBean entityParameterBean = new EntityParameterBean(parameterName,
                parameterDefaultValue,
                parameterIntegrationValue,
                parameterRuntimeValue);

        Parameter parameter = DateParameter::new;
        parameter.assignParameter(nodeOperator,entityParameterBean, Arrays.asList());

        return nodeOperator;
    }
}
