package exCollections.examples.scheduling;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.TreeSet;

public class Main {

	private static final int counter = 5;
	private final static int threshold = 4000;
	private final static Job[][] jobs = createJobs();

	public static void main(String[] args) {
		double value = Math.random();
		System.out.println("Start timing test for job scheduling");
		LinkedList<Job> jobLinkedList = new LinkedList<>();
		final long timeStart2 = System.currentTimeMillis();
		double res2 = test_2(value, jobLinkedList);
		final long timeEnd2 = System.currentTimeMillis();
		System.out.printf("Total sum: %.2f %n", res2);
		System.out.println("  LinkedList:    Time: " + (timeEnd2 - timeStart2) / 1000.0 + " seconds.");

		ArrayList<Job> jobArrayList = new ArrayList<>();
		final long timeStart3 = System.currentTimeMillis();
		double res3 = test_2(value, jobArrayList);
		final long timeEnd3 = System.currentTimeMillis();
		System.out.printf("Total sum: %.2f %n", res3);
		System.out.println("  ArrayList:     Time: " + (timeEnd3 - timeStart3) / 1000.0 + " seconds.");

		TreeSet<Job> jobTree = new TreeSet<>();
		final long timeStart4 = System.currentTimeMillis();
		double res4 = test_3(value, jobTree);
		final long timeEnd4 = System.currentTimeMillis();
		System.out.printf("Total sum: %.2f %n", res4);
		System.out.println("  TreeSet:       Time: " + (timeEnd4 - timeStart4) / 1000.0 + " seconds.");
	
		PriorityQueue<Job> jobQueue = new PriorityQueue<>();
		final long timeStart1 = System.currentTimeMillis();
		double res1 = test_4(value, jobQueue);
		final long timeEnd1 = System.currentTimeMillis();
		System.out.printf("Total sum: %.2f %n", res1);
		System.out.println("  PriorityQueue: Time: " + (timeEnd1 - timeStart1) / 1000.0 + " seconds.");

	}

	static double test_2(double value, List<Job> jobList) {
		double total = 0;
		for (int i = 0; i < counter; i++) {
			jobList = LoadJobs.loadJobList(jobList, jobs[i]);
			while (jobList.size() > threshold) {
				Job job = jobList.remove(0);
				total += doSomething(value, job);
			}
		}
		return total;
	}

	static double test_3(double value, TreeSet<Job> jobTree) {
		double total = 0;
		for (int i = 0; i < counter; i++) {
			jobTree = LoadJobs.loadJobSet(jobTree, jobs[i]);
			while (jobTree.size() > threshold) {
				Job job = jobTree.pollFirst();
				total += doSomething(value, job);
			}
		}
		return total;
	}

	private static Job[][] createJobs() {
		int length = counter * threshold;
		Job[][] jobs = new Job[counter][length];
		Random rand = new Random();
		for (int i = 0; i < counter; i++)
			for (int j = 0; j < length; j++)
				jobs[i][j] = new Job(i * length + j, rand.nextInt(9000), rand.nextInt(20));
		return jobs;
	}

	static double test_4(double value, PriorityQueue<Job> jobQueue) {
		double total = 0;
		for (int i = 0; i < counter; i++) {
			jobQueue = LoadJobs.loadJobQueue(jobQueue, jobs[i]);
			while (jobQueue.size() > threshold) {
				Job job = jobQueue.remove();
				total += doSomething(value, job);
			}
		}
		return total;
	}

	private static double doSomething(double value, Job job) {
		double sum = 0;
		while (sum < job.getCosts())
			sum += value;
		return sum;
	}
}
