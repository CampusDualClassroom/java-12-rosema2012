package com.campusdual.classroom;

public class Car {
        public String brand;
        public String model;
        public static final int MAX_SPEED = 120;
        public String fuel;
        public int speedometer = 0;
        public int tachometer = 0;
        public String gear = "N";
        public boolean reverse = false;
        public int wheelsAngle = 0;

        public Car(String brand, String model, String fuel) {
            this.brand = brand;
            this.model = model;
            this.fuel = fuel;
        }

        public Car() {}

        public void start() {
            if (isTachometerEqualToZero()) {
                this.tachometer = 1000;
                System.out.println("Vehículo acendido");
            } else {
                System.out.println("O vehículo xa está acendido");
            }
        }

        public void stop() {
            if (isTachometerGreaterThanZero()&& speedometer==0) {
                this.tachometer = 0;
                System.out.println("Vehículo apagado");
            } else {
                System.out.println("Non se pode apagar o vehículo, primeiro ten que estar detido");
            }
        }

        public void accelerate() {
            if(!isTachometerEqualToZero()) {
                if (speedometer < MAX_SPEED) {
                    this.speedometer+=15;
                } else {
                    System.out.println("Llego a la velocidad maxima");
                }
            }else{
                System.out.println("Vehiculo apagado, no acelera");
            }
        }

        public void brake() {
            if(!isTachometerEqualToZero()) {
                if (speedometer > 0) {
                    this.speedometer-=15;
                    if(speedometer<0){
                        this.speedometer=0;
                    }
                } else {
                    System.out.println("El coche esta detenido");
                }
            }else{
                System.out.println("Vehiculo apagado");
            }
        }

        public void turnAngleOfWheels(int angle) {
            if(angle<=45 && angle>=-45) {
                this.wheelsAngle += angle;
            }else if(angle<-45){
                this.wheelsAngle=-45;
                System.out.println("El angulo es demasiado grande");
            }else if(angle>45){
                this.wheelsAngle=45;
                System.out.println("El angulo es demasiado grande");
            }
        }

        public String showSteeringWheelDetail() {

            return "El angulo del volante es "+ wheelsAngle; }

        public boolean isReverse() {
            return this.reverse; }

        public void setReverse(boolean reverse) {
            if(speedometer==0 && !isReverse()) {
                this.reverse = true;
                this.gear = "R";
            }else if(speedometer==0 && isReverse()){
                this.reverse = false;
                this.gear = "N";
            }else{
                System.out.println("No se puede poner la marcha atras en movimiento");
            }
        }

        public void showDetails() {
            System.out.println("Speedometer: "+speedometer);
            System.out.println("Marcha atras: "+isReverse());
            System.out.println("Tacometro: "+tachometer);
            System.out.println("Angulo del volante: "+showSteeringWheelDetail());
            System.out.println("Marcha (gear): "+gear);
        }

    public boolean isTachometerEqualToZero() {
        return tachometer == 0;
    }

    public boolean isTachometerGreaterThanZero(){
            return tachometer > 0;
    }
}
