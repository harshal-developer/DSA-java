package Task_Management;
import java.util.ArrayList;
import java.util.Scanner;

class Task {
    private String title;
    private String description;
    private boolean completed;

    // Constructor
    public Task(String title, String description) {
        this.title = title;
        this.description = description;
        this.completed = false; // Default to not completed
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void markAsCompleted() {
        this.completed = true;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Description: " + description + ", Completed: " + (completed ? "Yes" : "No");
    }
}

public class ToDoListApp {
    private ArrayList<Task> tasks; // List to store tasks

    // Constructor
    public ToDoListApp() {
        tasks = new ArrayList<>();
    }

    // Method to add a task
    public void addTask(String title, String description) {
        tasks.add(new Task(title, description));
        System.out.println("Task added successfully.");
    }

    // Method to view all tasks
    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    // Method to mark a task as complete
    public void markTaskAsComplete(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).markAsCompleted();
            System.out.println("Task marked as completed.");
        } else {
            System.out.println("Invalid task index.");
        }
    }

    // Method to update a task
    public void updateTask(int index, String newTitle, String newDescription) {
        if (index >= 0 && index < tasks.size()) {
            Task task = tasks.get(index);
            task.setTitle(newTitle);
            task.setDescription(newDescription);
            System.out.println("Task updated successfully.");
        } else {
            System.out.println("Invalid task index.");
        }
    }

    // Method to delete a task
    public void deleteTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
            System.out.println("Task deleted successfully.");
        } else {
            System.out.println("Invalid task index.");
        }
    }

    // Main method to interact with the user
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToDoListApp app = new ToDoListApp();
        int choice;

        do {
            System.out.println("\nTo-Do List Menu:");
            System.out.println("1. Add a task");
            System.out.println("2. View tasks");
            System.out.println("3. Mark a task as complete");
            System.out.println("4. Update a task");
            System.out.println("5. Delete a task");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    // Add a task
                    System.out.print("Enter task title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    app.addTask(title, description);
                    break;

                case 2:
                    // View tasks
                    app.viewTasks();
                    break;

                case 3:
                    // Mark a task as complete
                    System.out.print("Enter task index to mark as complete: ");
                    int indexComplete = scanner.nextInt() - 1; // Convert to 0-based index
                    app.markTaskAsComplete(indexComplete);
                    break;

                case 4:
                    // Update a task
                    System.out.print("Enter task index to update: ");
                    int indexUpdate = scanner.nextInt() - 1; // Convert to 0-based index
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter new task title: ");
                    String newTitle = scanner.nextLine();
                    System.out.print("Enter new task description: ");
                    String newDescription = scanner.nextLine();
                    app.updateTask(indexUpdate, newTitle, newDescription);
                    break;

                case 5:
                    // Delete a task
                    System.out.print("Enter task index to delete: ");
                    int indexDelete = scanner.nextInt() - 1; // Convert to 0-based index
                    app.deleteTask(indexDelete);
                    break;

                case 6:
                    // Exit the program
                    System.out.println("Exiting the program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 6);

        scanner.close();
    }
}
