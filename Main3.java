public class Main3{
	public static void main(String[]args){
		Speaker speaker = new Speaker(2,true,20.0,"JBL");
		speaker.displayInfo();
		speaker.on();
		speaker.off();
	}
}
class Speaker{
	int volume;
	boolean connected;
	double power;
	String brand;
    public Speaker(int volume,boolean connected,double power,String brand){
		this.volume = volume;
		this.connected = connected;
		this.power = power;
		this.brand = brand;
    }
	public void on(){
		if(!connected){
			connected = true;
			System.out.println("Speaker On.");
		}else{
			System.out.println("Speaker is still connected.");
		}
	}
	public void off(){
		if(connected){
			connected = false;
			System.out.println("Speaker Off.");
		}
		else{
			System.out.println("Speaker isn't conncted .");
		}
	}
	public void displayInfo(){
		System.out.println("Volume    : "+getVolume());
		System.out.println("Connected  : "+connected);
		System.out.println("Power     : "+power);
		System.out.println("Brand      : "+brand);
	}
	public String getVolume(){
		switch(volume){
			case 1 : return "low";
			case 2 : return "medium";
			case 3 : return "high";
			default : return "unknown";
		}
	}
}