package com.service;

import org.springframework.stereotype.Service;
import com.model.HelperBean;

@Service
public class HelperService {

    public double calculateTotalCost(HelperBean helperBean) {
        float serviceCostPerHour = 0;

        if(helperBean.getServiceType().equals("ACService")) {
            serviceCostPerHour = 400;
        } else if(helperBean.getServiceType().equals("WashingMachineService")) {
            serviceCostPerHour = 500;
        } else if(helperBean.getServiceType().equals("RefrigeratorService")) {
            serviceCostPerHour = 300;
        }

        helperBean.setServiceCostPerHour(serviceCostPerHour);
        
        double totalCost = serviceCostPerHour * helperBean.getNoOfHours();
        
        return totalCost;
    }
}