package com.sdk.test.sdk.adapter;

import com.sdk.test.beans.ConnectionParameterBean;
import com.sdk.test.beans.DateParameterBean;
import com.sdk.test.beans.EntityParameterBean;
import com.sdk.test.sdk.beans.ConnectionParameterSdkBean;
import com.sdk.test.sdk.beans.DateParameterSdkBean;
import com.sdk.test.sdk.beans.EntityParamterSdkBean;

public class ParameterSdkCreator implements IParameterSdkCreator {

    @Override
    public DateParameterSdkBean date(DateParameterSdkAdapter dateParameterSdkAdapter,
                                     DateParameterBean dateParameterBean) {
        return dateParameterSdkAdapter.setDate(dateParameterBean);
    }

    @Override
    public EntityParamterSdkBean entity(EntityParameterSdkAdapter entityParameterSdkAdapter,
                                        EntityParameterBean entityParameterBean) {
        return entityParameterSdkAdapter.setEntity(entityParameterBean);
    }

    @Override
    public ConnectionParameterSdkBean connection(ConnectionParameterSdkAdapter connectionParameterSdkAdapter,
                                                 ConnectionParameterBean connectionParameterBean) {
        return connectionParameterSdkAdapter.setConnection(connectionParameterBean);
    }
}
