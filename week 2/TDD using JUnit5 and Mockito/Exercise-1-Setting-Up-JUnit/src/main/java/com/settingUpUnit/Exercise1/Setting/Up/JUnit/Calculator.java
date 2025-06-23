package com.settingUpUnit.Exercise1.Setting.Up.JUnit;
import org.springframework.stereotype.*;

@Service
public class Calculator {
    public int add(int a , int b){
        return(a+b);
    }
}
