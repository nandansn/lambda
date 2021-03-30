package com.sdk.test.sdk.adapter;

import com.sdk.test.beans.ParameterBean;

public abstract class ParameterSdkAdapter<T extends ParameterBean> {

    public abstract  <T> T get();

    public abstract void accept(IParameterSdkCreator iParameterSdkCreator);
}
