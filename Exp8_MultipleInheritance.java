package Expt8;
import java.util.Scanner;

class Queue {
	protected int[] arr;
	protected int front, rear, size, capacity;
	public Queue(int capacity) {
		this.capacity = capacity;
		arr = new int[capacity];
		front = rear = size = 0;
	}

	public void enqueue(int item) {
		if (isFull()) {
			System.out.println("Queue is full.");
			return;
		}
		
		arr[rear] = item;
		rear = (rear + 1) % capacity;
		size++;
	}

	public int dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is empty.");
			return -1;
		}

		int item = arr[front];
		front = (front + 1) % capacity;
		size--;
		return item;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean isFull() {
		return size == capacity;
	}

	public void display() {
		int i = front;

		for (int count = 0; count < size; count++) {
			System.out.print(arr[i] + " ");
			i = (i + 1) % capacity;
		}
		System.out.println();
	}
}
	
interface QueueMethods {	
	void enqueue(int item);
	int dequeue();
	int size();
	boolean isEmpty();
	boolean isFull();
	void display();
}

class QueueImplement implements QueueMethods {
	private Queue queue;
	public QueueImplement(int capacity) {
		this.queue = new Queue(capacity);
	}

	public void enqueue(int item) {
		queue.enqueue(item);
	}

	public int dequeue() {
		return queue.dequeue();
	}

	public int size() {
		return queue.size();
	}

	public boolean isEmpty() {
		return queue.isEmpty();
	}

	public boolean isFull() {
		return queue.isFull();
	}

	public void display() {
		queue.display();
	}
}

public class MultInheritance {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the size of the queue: ");
		int capacity = scanner.nextInt();
		scanner.nextLine();

		QueueMethods queue = new QueueImplement(capacity);

		while (true) {
			System.out.println("\nQueue Operations:");
			System.out.println("1. Enqueue");
			System.out.println("2. Dequeue");
			System.out.println("3. Display");
			System.out.println("4. Count");
			System.out.println("5. Exit");
			
			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:
				System.out.print("Enter an element to enqueue: ");
				int element = scanner.nextInt();
				scanner.nextLine();
				queue.enqueue(element);
				break;
				
			case 2:
				int dequeued = queue.dequeue();
				if (dequeued != -1) {
					System.out.println("Dequeued element: " + dequeued);
				}
				break;
				
			case 3:
				System.out.print("Queue elements: ");
				queue.display();
				break;
				
			case 4:
				System.out.println("Queue size: " + queue.size());
				break;

			case 5:
				scanner.close();
				System.exit(0);
	
			default:
				System.out.println("Invalid choice.");
			}
		}
	}
}