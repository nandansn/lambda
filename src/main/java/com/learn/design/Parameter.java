package com.learn.design;

import com.learn.bean.ParameterBean;

import java.util.List;

public interface Parameter<T extends ParameterBean> {

   void assignParameter(NodeOperator nodeOperator, T parameterBean, List<String> parameters);
}
