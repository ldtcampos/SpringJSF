
package com.aerolinea.control;

import com.aerolinea.services.HolaSpring;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@Scope("request")
public class SpringControl {
    @Autowired private HolaSpring hola;
    
    public String saludar(){
        return hola.test();
    }
}
