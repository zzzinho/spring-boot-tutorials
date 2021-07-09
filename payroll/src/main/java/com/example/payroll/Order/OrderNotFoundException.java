package com.example.payroll.Order;

public class OrderNotFoundException extends RuntimeException{
    OrderNotFoundException(Long id){
        super("Could not find Order " + id);
    }
}
