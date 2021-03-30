package com.sdk.test.sdk.test;

import com.sdk.test.beans.ConnectionParameterBean;
import com.sdk.test.beans.DateParameterBean;
import com.sdk.test.beans.EntityParameterBean;
import com.sdk.test.beans.SourceBean;
import com.sdk.test.sdk.adapter.DateParameterSdkAdapter;
import com.sdk.test.sdk.adapter.ParameterSdkAdapter;
import com.sdk.test.sdk.adapter.ParameterSdkCreator;

import java.util.ArrayList;
import java.util.List;

public class TestSdAdapter {

    public static void main(String[] args) {

        DateParameterBean dateParameterBean = new DateParameterBean("d","a","10",
                "12");

        EntityParameterBean entityParameterBean = new EntityParameterBean("e","emp","bank","cust");

        ConnectionParameterBean connectionParameterBean = new ConnectionParameterBean("c","conn1",
                "connInt","connRun");

        SourceBean sourceBean = new SourceBean(dateParameterBean, entityParameterBean, connectionParameterBean);


        List<ParameterSdkAdapter> parameterSdkAdapters = new ArrayList<>();

        parameterSdkAdapters.add(new DateParameterSdkAdapter(sourceBean.getDateParameterBean()));

        parameterSdkAdapters.stream().filter(parameterSdkAdapter -> {
            return parameterSdkAdapter.get() != null;
        }).forEach(parameterSdkAdapter -> {
            parameterSdkAdapter.accept(new ParameterSdkCreator());
        });


    }
}
