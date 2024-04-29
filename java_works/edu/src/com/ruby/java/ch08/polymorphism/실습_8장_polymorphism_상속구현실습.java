package com.ruby.java.ch08.polymorphism;
/*
 * 인터페이스 다형성 실습 코드
 * 생성자에서 this()를 사용, super()를 사용
 * 추상 메소드 구현에서 super.추상메소드를 사용하는 구현 실습이 목적임 
 */
interface Vehicle {
	public abstract void showVehicle();
}

class Truck implements Vehicle {
	int weight;
	public Truck(int weight) {
		this.weight=weight;
	}
	public void showVehicle() {
		System.out.println("Truck: weight="+weight);
	}
}

class Car implements Vehicle {
	int vehicleOccupants;

	public Car(int vehicleOccupants) {
		// TODO Auto-generated constructor stub
		this.vehicleOccupants = vehicleOccupants;
	}

	@Override
	public void showVehicle() {
		// TODO Auto-generated method stub
		System.out.println("Car: vehicleOccupants="+ vehicleOccupants);
	}

}

class Taxi extends Car {
	int mileage;
	
	public Taxi(int vehicleOccupants, int mileage) {
		// TODO Auto-generated constructor stub
		super(vehicleOccupants);
		this.mileage = mileage;
	}
	
	public void showVehicle() {
		System.out.println("Taxi: vehicleOccupants=" + vehicleOccupants + ", mileage=" + mileage);
	}

}

class MotorCycle implements Vehicle{
	int price;

	public MotorCycle(int price) {
		// TODO Auto-generated constructor stub
		this.price = price;
	}

	@Override
	public void showVehicle() {
		// TODO Auto-generated method stub
		System.out.println("MotorCycle: price="+ price);
	}

}

public class 실습_8장_polymorphism_상속구현실습 {
	public static void displayVehicles(Vehicle[] a) {		// Vehicle 클래스의 배열을 인자로 받아서 Vehicle 객체를 순회하면서, showVehicle()메서드를 호출하여 차량의 정보를 출력하는 메서드
		for (Vehicle v : a) {
			v.showVehicle();								//v의 타입을 실행 시간에 확인하여 해당 클래스의 메소드로 바인딩
		}
	}
	public static void main(String[] args) {
		Vehicle[] arr = new Vehicle[5];
		arr[0] = new Truck(33);
		arr[1] = new Car(4);
		arr[2] = new Taxi(2, 9000);							//생성자가 super()를 사용
		arr[3] = new Truck(22);
		arr[4] = new MotorCycle(12000);
		
		displayVehicles(arr);
		Vehicle v = new Vehicle() {
			public void showVehicle() {
				System.out.println("Vehicle: 익명 클래스 ");
			}
		};
		v.showVehicle();
	}
}