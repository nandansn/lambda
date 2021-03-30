package com.sdk.test.sdk.adapter;

import com.sdk.test.beans.ConnectionParameterBean;
import com.sdk.test.sdk.beans.ConnectionParameterSdkBean;

public class ConnectionParameterSdkAdapter extends ParameterSdkAdapter<ConnectionParameterBean> {

    public ConnectionParameterSdkBean setConnection(ConnectionParameterBean connectionParameterBean) {
        return new ConnectionParameterSdkBean(connectionParameterBean.getName(),
                connectionParameterBean.getDefaultValue(),
                connectionParameterBean.getIntegrationTaskValue(),
                connectionParameterBean.getRunTimeTaskValue()
        );
    }




    @Override
    public <T> T get() {
        return null;
    }

    @Override
    public void accept(IParameterSdkCreator iParameterSdkCreator) {

    }
}
