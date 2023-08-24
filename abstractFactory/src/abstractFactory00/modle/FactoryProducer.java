package abstractFactory00.modle;


public class FactoryProducer {

    public AbstractFactory getFactory(boolean rounded) {
        if(rounded) {
        	return new RoundedShapeFactory();
        }
        else {
        	return new ShapeFactory();
        }
    }

}