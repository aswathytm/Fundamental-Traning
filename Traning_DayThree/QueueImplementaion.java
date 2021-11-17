import java.util.*;
class Queue {
	int front, rear, size;
	int capacity;
	int array[];
	public Queue(int capacity)
	{
		this.capacity = capacity;
		front = this.size = 0;
		rear = capacity - 1;
		array = new int[this.capacity];
	}
	boolean isFull(Queue queue)
	{
		return (queue.size == queue.capacity);
	}
	boolean isEmpty(Queue queue)
	{
		return (queue.size == 0);
	}
	void enqueue(int item)
	{
		if (isFull(this))
			return;
		this.rear = (this.rear + 1)% this.capacity;
		this.array[this.rear] = item;
		this.size = this.size + 1;
		System.out.println(item + " enqueued to queue");
	}
	int dequeue()
	{
		if (isEmpty(this))
			return -1;
		int item = this.array[this.front];
		this.front = (this.front + 1) % this.capacity;
		this.size = this.size - 1;
		return item;
	}
}
public class QueueImplementaion {
	public static void main(String[] args)
	{
		Queue queue = new Queue(1000);
		Scanner sc = new Scanner(System.in);
		while(true){
		System.out.println("Enter a Value :\n 1.Add a order\n 2.Delete order \n 3.exit");
		int val=sc.nextInt();
		if(val==1) //Insert a value to queue 
		{
			System.out.println("enter order id:");
			int orderId=sc.nextInt();
			queue.enqueue(orderId);
			System.out.println("order id " +orderId + " is added and processing");
		}
		if(val==2)// delete the item from front of queue
		{
			if(queue.dequeue()==-1){
				System.out.println("Queue is empty ");
			}
			else{
			System.out.println(queue.dequeue() + " deleted from queue\n");
			}
		}
		if(val==3)
		{
			System.exit(0);
		}
		}
	}
}


