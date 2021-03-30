package com.sdk.test.beans;

public class SourceBean {

    DateParameterBean dateParameterBean;

    EntityParameterBean entityParameterBean;

    ConnectionParameterBean connectionParameterBean;

    public SourceBean(DateParameterBean dateParameterBean, EntityParameterBean entityParameterBean,
                      ConnectionParameterBean connectionParameterBean) {
        this.dateParameterBean = dateParameterBean;
        this.entityParameterBean = entityParameterBean;
        this.connectionParameterBean = connectionParameterBean;
    }

    public DateParameterBean getDateParameterBean() {
        return dateParameterBean;
    }

    public EntityParameterBean getEntityParameterBean() {
        return entityParameterBean;
    }

    public ConnectionParameterBean getConnectionParameterBean() {
        return connectionParameterBean;
    }
}
