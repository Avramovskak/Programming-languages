package exercise;

public class Vehicle {
	static class Car{
			private String type;
			private int no_seats;
			private String fuel;
			private String body_color;
			

			Car(){
				type="";
				no_seats = 0;
				fuel="";
				body_color="";
			}
			

			Car(String type, int seats, String fuel, String body_color){
				this.type = type;
				this.no_seats = seats;
				this.fuel = fuel;
				this.body_color = body_color;
			}
			public String getType() {
				return type;
			}
			public void setType(String type) {
				this.type = type;
			}
			

			public int getSeats() {
				return no_seats;
			}
			public void setSeats(int seats) {
				this.no_seats = seats;
			}
			public String getFuel() {
				return fuel;
			}
			public void setFuel(String fuel) {
				this.fuel = fuel;
			}
			public String getBodyColor() {
				return body_color;
			}
			public void setBodyColor(String body_color) {
				this.body_color = body_color;
			}
			public void spec() {
				System.out.println("Type: "+this.getType());
				System.out.println("Seats: "+this.getSeats());
				System.out.println("Fuel: "+this.getFuel());
				System.out.println("Body Color: "+this.getBodyColor());
			}
		}

			public static void main(String[] args) {
				Car A = new Car("Porsche", 2, "diesel", "red");
				Car B = new Car();
				System.out.println("Car A: ");
				System.out.println("Type: "+A.getType());
				System.out.println("Seats: "+A.getSeats());
				System.out.println("Fuel: "+A.getFuel());
				System.out.println("Body Color: "+A.getBodyColor());
				System.out.println();
				System.out.println("Car B: ");
				System.out.println("Type: "+B.getType());
				System.out.println("Seats: "+B.getSeats());
				System.out.println("Fuel: "+B.getFuel());
				System.out.println("Body Color: "+B.getBodyColor());
				

				B.setType("Audi");
				B.setSeats(5);
				B.setFuel("diesel");
				B.setBodyColor("black");
				System.out.println();
				System.out.println("Car B: ");
				B.spec();
				

				if(A.getSeats()>B.getSeats()) {
					System.out.println("Car A has more seats");
				}
				else if(B.getSeats()>A.getSeats()) {
					System.out.println("Car B has more seats");
				}
				else {
					System.out.println("The cars have equal number of seats");
				}
			}

		}

