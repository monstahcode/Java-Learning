package POO.objetos_incial;

public class Bicycle {

        // the Bicycle class has
        // three fields
        public int cadence;
        public int gear;
        public int speed;

        // the Bicycle class has
        // one constructor
        public Bicycle(int startCadence, int startSpeed, int startGear) {
                gear = startGear;
                cadence = startCadence;
                speed = startSpeed;
        }

        public Bicycle() {
                gear = 1;
                cadence = 0;
                speed = 0;
        }

        // the Bicycle class has
        // four methods
        public int getCadence() {
                return cadence;
        }

        public int getGear() {
                return gear;
        }

        public int getSpeed() {
                return speed;
        }

        public void setCadence(int newValue) {
                cadence = newValue;
        }

        public void setGear(int newValue) {
                gear = newValue;
        }

        public void applyBrake(int decrement) {
                speed -= decrement;
        }

        public void speedUp(int increment) {
                speed += increment;
        }

        public void showdata() {
                System.out.println("Cadence: " + this.cadence);
                System.out.println("Gear: " + this.gear);
                System.out.println("Speed: " + this.speed);
        }

}
