package sk.stuba.fei.uim.oop.car;

public class Auto {
        public static final double EFFICIENCY = 0.5;
        private double status;
        private double vydrz = 2;

        public void drive(double distance)
        {
            this.status -= distance*EFFICIENCY;
            System.out.println(status);
        }
        public void getStatus(double status){this.status = status; }
        public double setStatus(){return status;}
    }

