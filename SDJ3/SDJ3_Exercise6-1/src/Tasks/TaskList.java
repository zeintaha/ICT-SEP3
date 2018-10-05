package Tasks;

import java.util.ArrayList;

public class TaskList implements TaskListInterface {
	private ArrayList<Task> tasks;
	
	public TaskList() {
		tasks = new ArrayList<>();
	}
	
	@Override
	public void add(Task task) {
		tasks.add(task);
		System.out.println("tasks: " + tasks);
	}
	
	@Override
	public Task getAndRemoveNextTask() {
		Task r = tasks.remove(0);
		System.out.println("tasks: " + tasks);
		return r;
	}
	
	@Override
	public int size() {
		return tasks.size();
	}
}
