package exCollections.examples.scheduling;

import java.util.*;

public class LoadJobs {

	// add all Jobs in the order of their priority to the job list.
	public static List<Job> loadJobList(List<Job> jobList, Job[] jobs) {
		for (Job job : jobs) {
			addSorted(jobList, job);
		}
		return jobList;
	}

	// add all Jobs in the order of their priority to the job tree set.
	public static TreeSet<Job> loadJobSet(TreeSet<Job> jobSet, Job[] jobs) {
		TreeSet<Job> jobsTree = new TreeSet<>(Set.of(jobs));
		jobsTree.addAll(jobSet);
		return jobsTree;
	}

	private static void addSorted(List<Job> jobs, Job job) {
		int j = 0;
		for (Job jobEle : jobs) {
			if (jobEle.compareTo(job) < 0)
				j++;
			else
				break;
		}
		jobs.add(j, job);
	}
	
	// add all Jobs in the order of their priority to the priority queue.
	public static PriorityQueue<Job> loadJobQueue(PriorityQueue<Job> jobQueue, Job[] jobs) {
		jobQueue.addAll(Arrays.asList(jobs));
		return jobQueue;
	}
}
