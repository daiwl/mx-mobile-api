package com.magenta.maxoptra.api.mobile.service.impl;


import com.magenta.maxoptra.api.mobile.node.mns0.MobileAPIResponse;
import com.magenta.maxoptra.api.mobile.service.MobileIntegrationLocalService;

import javax.ejb.Remote;
import javax.ejb.Stateless;

@Stateless
@Remote(MobileIntegrationLocalService.class)
public class MobileIntegrationLocalServiceImpl implements MobileIntegrationLocalService {

    @Override
    public void pushMessage(MobileAPIResponse response) {
        throw new UnsupportedOperationException();
    }
}
