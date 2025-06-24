public class Main1 {
	public static void main(String[]args){
		Lamp lamp = new Lamp(0,true,600,"WHITE");
		lamp.displayLampInfo();
		lamp.on();
		lamp.off();
	}
}
class Lamp{
	int brightness;
	boolean isPluggedIn;
	double wattage;
	String colour;
	public Lamp(int brightness,boolean isPluggedIn,double wattage , String colour){
		this.brightness = brightness;
		this.isPluggedIn = isPluggedIn;
		this.wattage = wattage;
		this.colour = colour;
	}
	// lamp on
	public void on(){
		if(!isPluggedIn){
			isPluggedIn=true;
			System.out.println("Lamp on.");
		}
		else{
			System.out.println("Lamp is already on .");
		}
	}
	public void off(){
		if(isPluggedIn){
			isPluggedIn=false;
			System.out.println("Lamp off.");
		}
		else{
			System.out.println("Lamp isn't already on yet.");
		}
	}
	public void displayLampInfo(){
		System.out.println("Brightness : "+getBrightness());
		System.out.println("isPluggedIn : "+isPluggedIn);
		System.out.println("Wattage     : "+wattage+ "W");
		System.out.println("Colour : "+colour);
	}
	public String getBrightness(){
		switch(brightness){
			case 0 : return "OFF";
			case 1 : return "LOW";
			case 2 : return "HIGH";
			default : return "Unknown";
		}
	}
}
	
	
	
	
	
	
	
	
	
	
	
