public class Main2{
	public static void main(String[]args){
		AirConditioner airconditioner = new AirConditioner(3,true,24.0,"LG");
		airconditioner.displayInfo();
		airconditioner.on();
		airconditioner.off();
	}
}
class AirConditioner{
	int mode;
	boolean powerOn;
	double temperature;
	String brand;
	public AirConditioner(int mode,boolean powerOn,double temperature,String brand){
		this.mode = mode;
		this.powerOn = powerOn;
		this.temperature=temperature;
		this.brand = brand;
	}
	public void on(){
		if(!powerOn){
			powerOn = true;
			System.out.println("Air Conditioner on.");
		}else{
			System.out.println("Air Conditioner is already working.");
		}
	}
	public void off(){
		if(powerOn){
			powerOn = false ;
			System.out.println("Air Conditioner off.");
		}else{
			System.out.println("Air Conditioner isn't working yet.");
		}
	}
	public void displayInfo(){
		System.out.println("Mode   : "+getMode());
		System.out.println("PowerOn : "+powerOn);
		System.out.println(" Temperature : "+temperature+ " C");
		System.out.println("Brand     : "+brand);
	}
	public String getMode(){
		switch(mode){
			case 1 : return "cool";
			case 2 : return "fan";
			case 3 : return "dry";
			default : return "unknown";
		}
	}
	
	

}








