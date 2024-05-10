package FactoryMethodPattern.sharp;

import FactoryMethodPattern.matcha.ViewEngine;

import java.util.Map;

public class SharpViewEngine implements ViewEngine {
    @Override
    public String render(String viewName, Map<String, Object> context) {
        return "View BY SHARP";
    }
}
