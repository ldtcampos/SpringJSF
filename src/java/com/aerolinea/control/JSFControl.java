
package com.aerolinea.control;
import com.aerolinea.services.HolaSpring;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;


@ManagedBean
@RequestScoped
public class JSFControl {
    @ManagedProperty("#{holaSpring}")
    HolaSpring hola; 
    
    public String saludar(){
        return hola.test();
    }

    public HolaSpring getHola() {
        return hola;
    }

    public void setHola(HolaSpring hola) {
        this.hola = hola;
    }
    
    
}
