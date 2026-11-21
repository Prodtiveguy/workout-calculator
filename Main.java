import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        WorkoutLog log = new WorkoutLog();

        Scanner input = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.print("Command (list / add / quit): ");
            String command = input.nextLine().trim().toLowerCase();

            switch (command) {
                case "list" -> {
                    System.out.println(log.getListText());
                    if (!log.isEmpty()) {
                        System.out.print("Select a workout number: ");
                        String choice = input.nextLine().trim();
                        try {
                            int number = Integer.parseInt(choice);
                            if (number >= 1 && number <= log.getSize()) {
                                System.out.println(log.getSession(number));
                            } else {
                                System.out.println("No workout with that number.");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Please enter a number.");
                        }
                    }
                }
                case "quit" -> running = false;
                default -> System.out.println("Unknown command.");
                case "add" -> {
                    try {
                        System.out.print("Duration in minutes: ");
                        double minutes = Double.parseDouble(input.nextLine().trim());

                        System.out.print("Distance in meters: ");
                        int meters = Integer.parseInt(input.nextLine().trim());

                        System.out.print("Date (YYYY-MM-DD): ");
                        String date = input.nextLine().trim();

                        log.addSession(new WorkoutSession(minutes * 60, meters, date));
                        System.out.println("Workout saved.");
                    } catch (NumberFormatException e) {
                        System.out.println("Please enter a valid number. Workout not saved.");
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                }                            

            }
        }

        input.close();
    }
}