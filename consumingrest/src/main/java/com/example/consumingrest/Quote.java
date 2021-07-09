package com.example.consumingrest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties // 유형에 맞지 않는 속성 무시
public class Quote {
    private String type;
    private Value value;

    public Quote(){}

    public String getType() {
        return type; 
    }

    public void setType(String type) {
        this.type = type;
    }

    public Value getValue() {
        return value;
    }
    public void setValue(Value value){
        this.value = value;
    }

    @Override
    public String toString() {
        return "Quote{" +
            "type='" + type + '\'' +
            ", value=" + value +
            '}';
    }
}
