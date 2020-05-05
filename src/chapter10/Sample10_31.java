package chapter10;
// パラレル処理を行うクラス

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

class ExamRecuersiveTask extends RecursiveTask<Double>{
	private Double[] nums;
	private int start;
	private int end;
	public ExamRecuersiveTask(String name, Double[] nums, int start, int end) {
		System.out.println("name : " + name + " " + start + " " + end);
		this.nums = nums;
		this.start = start;
		this.end = end;
	}
	protected Double compute() {
		if(end - start <= 3) {
			double sum = 0.0;
			for(int i=start; i<end; i++) {
				nums[i] = Math.random() * 100;
				System.out.println("nums[" + i + "]" + nums[i]);
				sum += nums[i];
			}
			return sum;
		} else {
			int middle = start + (end - start) / 2;
			System.out.println("start: " + start + "middle: " + middle + "end: " + end);
			ExamRecuersiveTask task1 = 
					new ExamRecuersiveTask("f1", nums, start, middle);
			ExamRecuersiveTask task2 = 
					new ExamRecuersiveTask("f2", nums, middle, end);
			task1.fork();
			Double sum1 = task2.compute();
			Double sum2 = task1.join();
			return sum1 + sum2;
		}
	}
}

public class Sample10_31 {
	public static void main(String[] args){
		Double[] nums = new Double[10];
		ForkJoinTask<Double> taks =
				new ExamRecuersiveTask("main", nums, 0, 10);
		ForkJoinPool pool = new ForkJoinPool();
		Double sum = pool.invoke(taks);
		System.out.println("sum : " + sum);
	}
}
