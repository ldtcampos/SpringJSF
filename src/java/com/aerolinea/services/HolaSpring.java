package com.aerolinea.services;

import org.springframework.stereotype.Service;

@Service("holaSpring")
public class HolaSpring {

    public String test() {
        return "Hola desde el Services";
    }

}
