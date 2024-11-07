package com.udemy.spring_master_class.SpringMasterClass.S2_CDI;


import javax.inject.Inject;
import javax.inject.Named;

@Named
public class CdiBusiness {

    @Inject
    private  CdiTestClass cdiTestClass;

    public CdiTestClass getCdiTestClass() {
        return cdiTestClass;
    }

    public void setCdiTestClass(CdiTestClass cdiTestClass) {
        this.cdiTestClass = cdiTestClass;
    }
}
