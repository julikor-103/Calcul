package com.Hillel;


    public class Divide implements BaseCommand {
        @Override
        public double execution(double a, double b) {
            if (b == 0)
                return 0;
            else {
                return a / b;
            }
        }
    }
