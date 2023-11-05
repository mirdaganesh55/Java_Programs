package com.java.day8;

import java.util.LinkedList;
import java.util.Queue;

class Task {
	    private String name;

	    public Task(String name) {
	        this.name = name;
	    }

	    public String getName() {
	        return name;
	    }
	}

	public class Queues {
	    public static void main(String[] args) {
	        Queue<Task> taskQueue = new LinkedList<>();

	        // Adding tasks to the queue
	        taskQueue.offer(new Task("Task 1"));
	        taskQueue.offer(new Task("Task 2"));
	        taskQueue.offer(new Task("Task 3"));

	        System.out.println("Task Scheduler Simulation:");
	        while (!taskQueue.isEmpty()) {
	            Task currentTask = taskQueue.poll();
	            System.out.println("Running: " + currentTask.getName());

	            // Simulate task execution by sleeping for a short duration
	            try {
	                Thread.sleep(1000);
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }

	            System.out.println("Completed: " + currentTask.getName());
	        }

	        System.out.println("All tasks completed...");
	    }
	
}
