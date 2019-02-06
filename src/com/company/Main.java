package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Zork {
    //public static int counter = 0;
    //public static int total_money = 0;

    public static int Room_char = 0;
    static Map<Integer, Boolean> visited = new HashMap<>();
    static Map<Integer, String> items = new HashMap<>();
    static Map<Integer, Integer> money = new HashMap<>();

    static  Scanner scanner = new Scanner(System.in);
    static boolean characterFound = false;


    public static void main(String[] args) {
        System.out.println("|----------------------------|");
        System.out.println("|****************************|");
        System.out.println("|***WELCOME TO THE PROGRAM***|");
        System.out.println("|************ZORK************|");
        System.out.println("|----------------------------|");

        Room_char = (int) (Math.random() * 8 + 1);
        foyer();
    }

    public static void foyer() {
        items.put(1, "Dead Scorpion");
        visited.put(1, true);
        String answer = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("'ROOM:'          FOYER\n'CONTAIN:'       DEAD SCORPION\n'DIRECTION TO:' (NORTH)\n");
        money(1);

        if (Room_char == 1) {
            System.out.println("YOU LOST ALL OF YOUR MONEY. YOU LOSS");
            money.clear();// total_money = 0;
            Room_char = 9;
        }

        while (true) {
            System.out.println("which room you want to travel type (NORTH|N).. OR press 'q' to exit");
            answer = scanner.nextLine();
            if ((answer.equalsIgnoreCase("NORTH")) || (answer.equalsIgnoreCase("N"))) {
                front_room();
            } else if ((answer.equalsIgnoreCase("q"))) {
                exit();
            } else {
                System.out.println("please enter the correct choice");
            }
        }
    }

    public static void front_room() {
        items.put(2, "Piano");
        visited.put(2, true);
        String money_choice;
        String answer = "";
        int random = (int) (Math.random() * 1000 + 1);
        System.out.println("'ROOM:'      FRONT_ROOM \n'CONTAIN:'    PIANO \n'DIRECTION TO:'  (SOUTH|WEST|EAST)\n");

        money(2);
        if (Room_char == 2) {
            System.out.println("YOU LOST ALL OF YOUR MONEY. YOU LOSS");
            money.clear();// total_money = 0;
            Room_char = 9;
        }

        while (true) {
            System.out.println("which room you want to travel type (SOUTH|S),(WEST|W),(EAST|E).. OR press 'q' to exit");
            answer = scanner.nextLine();
            answer = answer.toLowerCase();
            if (!(answer.equalsIgnoreCase("q"))) {
                switch (answer) {
                    case "south":
                    case "s":
                        foyer();
                        break;
                    case "west":
                    case "w":
                        library();
                        break;
                    case "e":
                    case "east":
                        kitchen();
                        break;
                    default:
                        System.out.println("please enter the correct direction");
                }
            } else if ((answer.equalsIgnoreCase("q"))) {
                exit();
            } else {
                System.out.println("please enter the correct choice");
            }
        }
    }

    public static void library() {
        items.put(3, "Spider");
        visited.put(3, true);
        String money_choice;
        String answer = "";
        System.out.println("'ROOM:'        LIBRARY \n'CONTAIN:'      SPIDERS \n'DIRECTION TO:' (NORTH|EAST)\n");
        money(3);
        if (Room_char == 3) {
            System.out.println("YOU LOST ALL OF YOUR MONEY. YOU LOSS");
            money.clear();// total_money = 0;
            Room_char = 9;
        }
        while (true) {

            System.out.println("which room you want to travel type (NORTH|N),(EAST|E).. OR press 'q' to exit");

            answer = scanner.nextLine();
            answer = answer.toLowerCase();
            if (!(answer.equalsIgnoreCase("q"))) {
                switch (answer) {
                    case "east":
                    case "e":
                        front_room();
                        break;
                    case "north":
                    case "n":
                        dining_room();
                        break;
                    default:
                        System.out.println("please enter the correct direction");
                }
            } else if ((answer.equalsIgnoreCase("q"))) {
                exit();
            } else {
                System.out.println("please enter the correct choice");
            }
        }
    }

    public static void kitchen() {
        items.put(4, "Bats");
        visited.put(4, true);
        String money_choice;
        String answer = "";
        System.out.println("'ROOM:'        KITCHEN\n'CONTAIN:'     BATS \n'DIRECTION TO:' (WEST|NORTH)\n");
        Scanner scanner = new Scanner(System.in);
        money(4);
        if (Room_char == 4) {
            System.out.println("YOU LOST ALL OF YOUR MONEY. YOU LOSS");
            money.clear();// total_money = 0;
            Room_char = 9;
        }

        while (true) {
            System.out.println("which room you want to travel type (WEST|W),(NORTH|N).. OR press 'q' to exit");
            answer = scanner.nextLine();
            if (!(answer.equalsIgnoreCase("q"))) {
                switch (answer) {
                    case "w":
                    case "west":
                        front_room();
                        break;
                    case "n":
                    case "north":
                        parlor();
                        break;
                    default:
                        System.out.println("please enter the correct room direction");
                }
            } else if ((answer.equalsIgnoreCase("q"))) {
                exit();
            } else {
                System.out.println("please enter the correct choice");
            }

        }

    }

    public static void dining_room() {
        items.put(5, "Dust Empty Box");
        visited.put(5, true);
        String money_choice;
        String answer = "";
        System.out.println("'ROOM:'       DINING_ROOM\n'CONTAIN:'     DUST EMPTY BOX\n'DIRECTION TO:'(SOUTH)\n");
        Scanner scanner = new Scanner(System.in);
        money(5);
        if (Room_char == 5) {
            System.out.println("YOU LOST ALL OF YOUR MONEY. YOU LOSS");
            money.clear();// total_money = 0;
            Room_char = 9;
        }

        while (true) {
            System.out.println("which room you want to travel type (SOUTH|S).. OR press 'q' to exit");
            answer = scanner.nextLine();
            if ((answer.equalsIgnoreCase("south")) || (answer.equalsIgnoreCase("s"))) {
                library();
            } else if (answer.equalsIgnoreCase("q")) {
                exit();
            } else {
                System.out.println("please enter the correct choice");
            }
        }
    }

    public static void valut() {
        items.put(6, "3 Walking Skeletons");
        visited.put(6, true);
        String money_choice;
        String answer = "";
        System.out.println("'ROOM:'        VALUT \n'CONTAIN:'     3 WALKING SKELETONS \n'DIRECTION TO:' (EAST1|E1),(EAST2|E2)\n");
        money(6);
        if (Room_char == 6) {
            System.out.println("YOU LOST ALL OF YOUR MONEY. YOU LOSS");
            money.clear();// total_money = 0;
            Room_char = 9;
        }

        while (true) {
            System.out.println("which room you want to travel type (EAST1|E1),(EAST2|E2).. OR press 'q' to exit");
            answer = scanner.nextLine();
            int random = (int) (Math.random() * 10 + 1);
            if (((answer.equalsIgnoreCase("EAST1")) || (answer.equalsIgnoreCase("E1"))) || (answer.equalsIgnoreCase("EAST2")) || (answer.equalsIgnoreCase("EAST2"))) {
                if (random >= 7) {
                    parlor();
                } else if (random < 7) {
                    secret_room();
                }
            } else if (answer.equalsIgnoreCase("q")) {
                exit();
            } else {
                System.out.println("please enter the correct choice");
            }
        }
    }

    public static void parlor() {
        items.put(7, "Treasure Chest");
        visited.put(7, true);
        String money_choice;
        String answer = "";
        System.out.println("'ROOM:'        PARLOR\n'CONTAIN:'      TREASURE CHEST \n'DIRECTION TO:' (EAST|E),(SOUTH|S)\n");
        money(7);
        if (Room_char == 7) {
            System.out.println("YOU LOST ALL OF YOUR MONEY. YOU LOSS");
            money.clear();// total_money = 0;
            Room_char = 9;
        }


        while (true) {
            System.out.println("which room you want to travel type (EAST|E),(SOUTH|S).. OR press 'q' to exit");
            answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("e6")) {
                valut();
            } else if (answer.equalsIgnoreCase("s4")) {
                kitchen();
            } else if (answer.equalsIgnoreCase("q")) {
                exit();
            } else {
                System.out.println("please enter the correct choice");
            }
        }
    }

    public static void secret_room() {
        items.put(8, "Piles of Gold");
        visited.put(8, true);
        String money_choice;
        String answer = "";
        System.out.println("YOU ARE IN SECRET ROOM RIGHT NOW\n");
        System.out.println("'ROOM:'        SECRET_ROOM \n'CONTAIN:'     PILES OF GOLD \n'DIRECTION TO:' (WEST)\n");
        money(8);
        if (Room_char == 8) {
            System.out.println("YOU LOST ALL OF YOUR MONEY. YOU LOSS");
            for(int key : money.keySet()){
                money.put(key,0);
            }
            //money.clear();// total_money = 0;
            Room_char = 9;
        }
        while (true) {
            System.out.println("which room you want to travel type (WEST|W).. OR press 'q' to exit");

            //Scanner scanner=new Scanner(System.in);
            answer = scanner.nextLine();
            if ((answer.equalsIgnoreCase("w")) || (answer.equalsIgnoreCase("west"))) {
                valut();
            } else if (answer.equalsIgnoreCase("q")) {
                exit();
            } else {
                System.out.println("please enter the correct choice");
            }
        }
    }

    public static void money(int room) {
        if(!money.containsKey(room)){
            String money_choice;
            int random = (int) (Math.random() * 1000 + 1);
            System.out.println("DO YOU WANT TO TAKE THE MONEY "+ random +"?...(y|n)" );
            money_choice = scanner.nextLine();
            if ((money_choice.equalsIgnoreCase("y"))) {
                money.put(room, random);
                //total_money += random;
            } else if ((money_choice.equalsIgnoreCase("n"))) {
                //total_money  += 0;
            } else {
                System.out.println("you should type 'y' or 'n'");
                System.out.println("thanks try later");
                System.exit(0);
            }
        }
    }

    public static void exit() {
        System.out.println("YOU VISIT " + (1 + visited.size()) + " ROOM");
        int totalMoney =0;
        for(int i : money.values()){
            totalMoney += i;
        }
        System.out.println("YOU HAVE $" + totalMoney + " AMOUNT OF MONEY");
        System.out.println("THE ITEM YOU WAS SEEN:" + items);
        System.out.println("THANKS");
        System.exit(0);
    }

    public static int getRandom(int min, int max) {
        return min + ((int) (Math.random() * max));
    }

    public static boolean isCharacterFound() {
        return characterFound;
    }

}
