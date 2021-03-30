package com.sdk.test.sdk.adapter;

import com.sdk.test.beans.EntityParameterBean;
import com.sdk.test.sdk.beans.EntityParamterSdkBean;

public class EntityParameterSdkAdapter extends ParameterSdkAdapter<EntityParameterBean> {

    public EntityParamterSdkBean setEntity(EntityParameterBean entityParameterBean) {
        return new EntityParamterSdkBean(entityParameterBean.getName(),
                entityParameterBean.getDefaultValue(),
                entityParameterBean.getIntegrationTaskValue(),
                entityParameterBean.getRunTimeTaskValue()
        );
    }

    /*@Override
    public void accept(IParameterSdkCreator iParameterSdkCreator, EntityParameterBean parameterBean) {
        iParameterSdkCreator.entity(this, parameterBean);
    }*/

    @Override
    public <T> T get() {
        return null;
    }

    @Override
    public void accept(IParameterSdkCreator iParameterSdkCreator) {

    }
}
