package abstractFactory00.modle;


public class RoundedShapeFactory extends AbstractFactory{

  
    @Override
    public Shape getShape(String type) {
    	
    	if(type.equalsIgnoreCase("roundedRectangle")) {
    		return new RoundedRectangle();
    	} else if(type.equalsIgnoreCase("roundedSquare")) {
    		return new RoundedSquare();
    	} 
    	
    	return null;
    }

}