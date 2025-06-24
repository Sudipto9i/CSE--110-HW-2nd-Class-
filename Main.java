public class Main {
    public static void main(String[] args) {
        Car car = new Car(3,false,5.0,"white");
		car.displayInfo();
		car.start();
		car.stop();
    }
}
//java.car
 class Car{
	int carType;
	boolean running;
	double engineCapacity;
	String colour;
//contructor 
public Car(int carType , boolean running , double engineCapacity , String colour){
	this.carType=carType;
	this.running=running;
	this.engineCapacity=engineCapacity;
	this.colour = colour;
}
//start the car
public void start(){
	if(!running){
		running = true;
		System.out.println("Car start.");
	}
	else{
		System.out.println("Car is already running. ");
	}
}
//stop the car
public void stop(){
	if(running){
		running=false;
		System.out.println("Car stop.");
	}
	else{
		System.out.println("Car isn't running yet.");
	}
}
//display
public void displayInfo(){
	System.out.println("Car-Type :"+carTypeName());
	System.out.println("Running   :"+running);
	System.out.println("Engine Capacity : "+engineCapacity+ "L");
	System.out.println("Colour : "+colour);
}
//String
public String carTypeName(){
	switch(carType){
		case 1 : return "Sedan";
		case 2 : return"SUV";
		case 3 : return"Truck";
		default : return "Unknown";
	}
}
}