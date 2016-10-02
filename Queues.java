package ctciHackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class Queues {

	public static class MyQueue<Integer> {
		private ArrayList<Integer> order;

		public MyQueue() {
			order = new ArrayList<Integer>();
		};

		public void dequeue() {
			order.remove(order.size() - 1);
		};

		public void enqueue(Integer item) {
			order.add(0, item);
		};

		public Integer peek() {
			return order.get(order.size() - 1);

		}
	}

	public static void main(String[] args) {
		MyQueue<Integer> queue = new MyQueue<Integer>();

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		for (int i = 0; i < n; i++) {
			int operation = scan.nextInt();
			if (operation == 1) { // enqueue
				queue.enqueue(scan.nextInt());
			} else if (operation == 2) { // dequeue
				queue.dequeue();
			} else if (operation == 3) { // print/peek
				System.out.println(queue.peek());
			}
		}
		scan.close();
	}
}