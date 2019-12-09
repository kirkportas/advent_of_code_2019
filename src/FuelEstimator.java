

import java.lang.Math;



public class FuelEstimator {

    public static void main(String args[]) {
        int i, x;
        double fuel_sum = 0;
        double entry_fuel, nextval;

        int[] data = { 73617,104372,131825,85022,105514,78478,87420,118553,97680,89479,146989,79746,108085,117895,
                143811,102509,102382,92975,72978,94208,130521,83042,138605,107566,63374,71176,129487,118408,
                115425,63967,98282,121829,92834,61084,70122,87221,132773,141347,133225,81199,94994,60881,
                110074,63499,143107,76618,86818,135394,106908,96085,99801,112903,51751,56002,70924,62180,133025,
                68025,122660,64898,77339,
                62109,133891,134460,84224,54836,59748,125540,67796,71845,92899,130103,74612,136820,
                96212,132002,97405,82629,63717,62805,112693,147810,139827,116220,69711,50236,137833,
                103743,147456,112098,84867,75615,132738,81072,89444,58443,94465,112494,82127,132533 };


        // iterating over an array
        for (i = 0; i < data.length; i++) {
            entry_fuel = data[i];
            while (entry_fuel > 0) {
                nextval = getFuelForMass(entry_fuel);
                if (getFuelForMass(nextval) > 0) {
                    fuel_sum += nextval;
                }
                entry_fuel = nextval;
            }
//            System.out.print(x + " ");
        }
        System.out.print("Fuel Sum: " + fuel_sum + "\n");
        // 4903642 is too low  => 4903413 also too low
    }


    private static double getFuelForMass(double mass) {
        return Math.floor(mass / 3) - 2;
    }




}


//    List<Integer> data = new ArrayList<Integer>() [
//            73617,104372,131825,85022,105514,78478,87420,118553,97680,89479,146989,79746,108085,117895,
//            143811,102509,102382,92975,72978,94208,130521,83042,138605,107566,63374,71176,129487,118408,
//            115425,63967,98282,121829,92834,61084,70122,87221,132773,141347,133225,81199,94994,60881,
//            110074,63499,143107,76618,86818,135394,106908,96085,99801,112903,51751,56002,70924,62180,133025,
//            68025,122660,64898,77339,
//            62109,133891,134460,84224,54836,59748,125540,67796,71845,92899,130103,74612,136820,
//            96212,132002,97405,82629,63717,62805,112693,147810,139827,116220,69711,50236,137833,
//            103743,147456,112098,84867,75615,132738,81072,89444,58443,94465,112494,82127,132533,
//    ]