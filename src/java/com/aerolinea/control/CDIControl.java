package com.aerolinea.control;

import com.aerolinea.services.HolaSpring;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class CDIControl {
    @Inject private HolaSpring hola; 
    
    public String saludar(){
        return hola.test();
    }
    
    
}
