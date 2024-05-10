package FactoryMethodPattern.sharp;

import FactoryMethodPattern.matcha.Controller;
import FactoryMethodPattern.matcha.ViewEngine;

public class SharpController extends Controller {
    @Override
    protected ViewEngine createViewEngine(){
        return new SharpViewEngine();
    }
}
