package com.sdk.test.sdk.adapter;

import com.sdk.test.beans.ConnectionParameterBean;
import com.sdk.test.beans.DateParameterBean;
import com.sdk.test.beans.EntityParameterBean;
import com.sdk.test.sdk.beans.ParameterSdkBean;

public interface IParameterSdkCreator {


    public ParameterSdkBean date(DateParameterSdkAdapter dateParameterSdkAdapter, DateParameterBean dateParameterBean);

    public ParameterSdkBean entity(EntityParameterSdkAdapter dateParameterSdkAdapter, EntityParameterBean entityParameterBean);


    public ParameterSdkBean connection(ConnectionParameterSdkAdapter dateParameterSdkAdapter, ConnectionParameterBean connectionParameterBean);



}
