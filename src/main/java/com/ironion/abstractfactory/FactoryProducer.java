package com.ironion.abstractfactory;

/**
 * @author ironion
 * @date 2022/6/13 11:22
 */
public class FactoryProducer {

    /**
     * get factory by category
     *
     * @param category
     * @return
     */
    public static AbstractFactory getAbstractFactory(String category){
        AbstractFactory factory = null;
        switch (category.toLowerCase()){
            case "shape":
                factory = new ShapeFactory();
                break;
            case "color":
                factory = new ColorFactory();
                break;
            default:
                break;
        }
        return factory;
    }
}
