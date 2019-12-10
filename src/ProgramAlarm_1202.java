public class ProgramAlarm_1202 {

    public static void main(String args[]) {
//        int[] data = {
//                1,  0, 0, 3, 1, 1, 2, 3, 1, 3,
//                4,  3, 1, 5, 0, 3, 2, 1, 9, 19,   10-19
//                1,  5, 19, 23, 1, 6, 23, 27, 1,
//                27, 10, 31, 1, 31, 5, 35, 2, 10, 35,
//                39, 1, 9, 39, 43, 1, 43, 5, 47, 1,
//                47, 6, 51, 2, 51, 6, 55, 1, 13, 55,
//                59, 2, 6, 59, 63, 1, 63, 5, 67, 2,
//                10, 67, 71, 1, 9, 71, 75,
//                1, 75, 13, 79, 1, 10, 79, 83, 2, 83, 13, 87, 1, 87, 6, 91, 1, 5, 91, 95, 2, 95, 9, 99, 1, 5, 99, 103, 1, 103, 6, 107, 2, 107, 13,
//                111, 1, 111, 10, 115, 2, 10, 115, 119, 1, 9, 119, 123, 1, 123, 9, 127, 1, 13, 127, 131, 2, 10,
//                131, 135, 1, 135, 5, 139, 1, 2, 139,
//     (143i..)   143, 1, 143, 5, 0,    (..147
//                99, 2, 0, 14, 0
//        };
        int[] data = {1,12,2,3,1,1,2,3,1,3,4,3,1,5,0,3,2,1,9,19,1,5,19,23,1,6,23,27,1,27,10,31,1,31,5,35,2,10,35,39,1,9,39,43,1,43,5,47,1,47,6,51,2,51,6,55,1,13,55,59,2,6,59,63,1,63,5,67,2,10,67,71,1,9,71,75,1,75,13,79,1,10,79,83,2,83,13,87,1,87,6,91,1,5,91,95,2,95,9,99,1,5,99,103,1,103,6,107,2,107,13,111,
                1,111,10,115,2,10,115,119,1,9,119,123,1,123,9,127,1,13,127,131,2,10,131,135,1,135,5,139,1,2,139,143,1,143,5,0,99,2,0,14,0};
//        int[] data = {2,10,10,0,99};
//        replace position 1 with the value 12 and replace position 2 with the value 2
//        data[1] = 12;
//        data[2] = 2;

        int i = 0;
        int x;
        while (i < data.length-2) {
            x = data[i];
            int one = data[ data[i+1] ];
            int two = data[ data[i+2] ];
            int dest_i = data[i+3];
            if (dest_i == 0) {
                System.out.println("Updating pos-0 at index: "+i);

            }
//            System.out.println("")

            if (x==1) {
                // Add
                data[dest_i] = one + two;

                i+= 4;

            } else if (x==2) {
                // Multiply
                data[dest_i] = one * two;
                i+= 4;


            } else if (x==99) {
                System.out.println("OPCODE 99 encountered at index "+i);
                System.out.println("99i + 1 "+data[i+1]);
                System.out.println("99i + 2 "+data[i+2]);
                break;
                // Program ended
            } else {

                System.out.println("Unknown OPCODE encountered at index "+i + ",  value of " + x);
            }

        }

        System.out.println("POSITION ZERO RESULT: " + data[0]);
        // 148 is too low ?
    }

}
