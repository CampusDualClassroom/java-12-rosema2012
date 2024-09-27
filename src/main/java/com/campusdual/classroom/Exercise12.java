package com.campusdual.classroom;

public class Exercise12 {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota","Supra","Gasoil");
        System.out.println(myCar.isTachometerEqualToZero());
        //Comprueba que el vehiculo ya esta encendido o lo enciende
        myCar.start();

        //Comprobar que no se enciende dos veces
        myCar.start();
        //Apaga el coche si esta encendido
        //c.stop();

        //aceleramos el coche hasta intentar pasar el limite
        for (int i = 0; i < 125; i++) {
            myCar.accelerate();
        }


        myCar.turnAngleOfWheels(-44);
        myCar.showSteeringWheelDetail();
        myCar.stop();

        myCar.setReverse(true);

        for (int i = 0; i < 125; i++) {
            myCar.brake();
        }

        myCar.setReverse(true);

        myCar.stop();

        myCar.showDetails();

    }
}