package exCollections.examples.scheduling;

public class Job implements Comparable<Job> {
	private final int jobNr;
	private final long costs;
	private final int priority;

	public Job(int jobNr, long costs, int priority) {
		this.jobNr = jobNr;
		this.costs = costs;
		this.priority = priority;
	}

	public int getJobNr() {
		return jobNr;
	}

	public long getCosts() {
		return costs;
	}

	public int getPriority() {
		return priority;
	}

	@Override
	public int compareTo(Job job) {
		if (priority != job.getPriority()) {
			return priority < job.getPriority() ? +1 : -1;
		} else if (costs != job.getCosts()) {
			return costs > job.getCosts() ? +1 : -1;
		}
		return jobNr < job.getJobNr() ? +1 : -1;
	}

	@Override
	public String toString() {
		return String.format("JobNr: %3d, Priority %s, Costs %3d", jobNr, priority, costs);
	}
}
