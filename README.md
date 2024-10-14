# To-Do List CLI

## Description

A simple command-line application for managing a to-do list.

## Objectives

1. **Data Modeling in Clojure**: Learn to model real-world data (tasks) using Clojure’s immutable data structures, and practice designing efficient data representations.
3. **Command-Line Interfaces**: Develop skills in building interactive command-line applications by learning to handle user inputs, process commands, and provide meaningful feedback.
4. **Persistent Storage**: Practice writing and reading from files, enabling the application to retain tasks between sessions and enhancing user experience through data persistence.
5. **Error Handling and Validation**: Strengthen error handling skills by validating user inputs and handling invalid operations gracefully, ensuring a robust user experience.

---

## Functional Requirements

1. **Task Management Operations:**
	- **Add a Task**: Allow users to add a task by entering a task description.
	- **Remove a Task**: Users can remove a task using a unique task ID.
	- **Mark Task as Completed**: Users can mark tasks as completed, changing their status from "incomplete" to "complete."
	- **View All Tasks**: Display a list of all tasks along with their current status (incomplete/complete).
2. **Data Model**:
	- Each task will be a map containing:
	 - `:id`: A unique task identifier (integer).
	 - `:description`: A string description of the task.
	 - `:status`: The status of the task, either `:incomplete` or `:complete`.
   - All tasks will be stored in a vector.
3. **User Input Handling**:
	- The application will prompt users for input to perform actions (e.g., add, remove, complete, view tasks).
	- Validate inputs to ensure tasks can be added with non-empty descriptions and that valid task IDs are used for removal or completion.
	- Provide meaningful error messages for invalid inputs.
4. **Error Handling**:
	- Handle cases where users try to remove or complete non-existent tasks.
	- Handle invalid task IDs and empty task descriptions.
5. **(Stretch Goal 1) Task Deadlines:
	- Allow users to set and track task deadlines, providing reminders for overdue tasks.
6. **(Stretch Goal 2) Project-Task Hierarchy**:
	- Enable users to categorize tasks under different projects or groups for better organization.
	
---

## Non-Functional Requirements

1. **User Interface**:
	- Provide a simple, intuitive command-line interface for task management.
	- Users will be prompted to select actions (add, remove, complete, view, or exit).
2. **Error Handling**:
	- Ensure the program handles invalid inputs, such as non-numeric task IDs or empty descriptions, with appropriate error messages.
3. **Project Structure**:
	- Organize the code into well-defined functions for task management and user interaction.
	- Structure the project using a standard Clojure project layout (`src`, `test`, `resources`).

---

## Testing

1. **Unit Testing**:
   - Test the core functions individually:
     - **Adding a Task**: Ensure that tasks are added correctly with a unique ID.
     - **Removing a Task**: Ensure that removing a task updates the list and that non-existent task IDs trigger error handling.
     - **Completing a Task**: Test that a task’s status is updated to `:complete` when marked as completed.
2. **Integration Testing**:
	- Simulate typical user interactions, such as adding multiple tasks, removing tasks, marking tasks as complete, and viewing the task list.
	- Ensure the application continues to run until the user explicitly exits.
3. **Edge Case Handling**:
	- Handle invalid inputs such as non-numeric task IDs, empty task descriptions, and attempts to remove or complete tasks that do not exist.
	
---

## Future Enhancements

1. **Task Prioritization**:
	- Add a priority field to tasks, allowing users to assign and sort tasks by priority (e.g., low, medium, high).
2. **Recurring Tasks**:
	- Implement automated task creation based on a schedule.
3. **Batch Task Import**:
	- Add functionality to import a file containing multiple tasks into the system.
4. **Terminal User Interface**
	- Implement a terminal user interface to make working with tasks easier for the user
