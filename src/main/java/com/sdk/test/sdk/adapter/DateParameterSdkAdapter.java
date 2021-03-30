package com.sdk.test.sdk.adapter;

import com.sdk.test.beans.DateParameterBean;
import com.sdk.test.beans.ParameterBean;
import com.sdk.test.sdk.beans.DateParameterSdkBean;

public class DateParameterSdkAdapter extends ParameterSdkAdapter<DateParameterBean> {

    DateParameterBean dateParameterBean;

    public DateParameterSdkAdapter(DateParameterBean dateParameterBean) {
        this.dateParameterBean = dateParameterBean;
    }

    public DateParameterSdkBean setDate(DateParameterBean dateParameterBean) {
        return new DateParameterSdkBean(dateParameterBean.getName(),
                dateParameterBean.getDefaultValue(),
                dateParameterBean.getIntegrationTaskValue(),
                dateParameterBean.getRunTimeTaskValue()
        );
    }

    @Override
    public DateParameterBean get() {
        return this.dateParameterBean;
    }

    @Override
    public void accept(IParameterSdkCreator iParameterSdkCreator) {
        iParameterSdkCreator.date(this, this.dateParameterBean);
    }
}
