package com.learn.design2;

import com.learn.design.NodeOperator;

import java.util.List;

public interface IParameter {

    void assignParameter(NodeOperator nodeOperator, T parameterBean, List<String> parameters);
}
