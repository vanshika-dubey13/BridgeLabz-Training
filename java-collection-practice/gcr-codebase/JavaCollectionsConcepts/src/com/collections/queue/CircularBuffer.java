package com.collections.queue;

class CircularBuffer {

	//attributes
    int[] buffer;
    int size;
    int front, rear, cnt;

    //constructor
    CircularBuffer(int size) {
        this.size = size;
        buffer = new int[size];
        front = 0;
        rear = 0;
        cnt = 0;
    }

    // Inserting element into circular buffer
    public void insert(int value) {
        buffer[rear] = value;
        rear = (rear + 1) % size;
        if (cnt < size) {
            cnt++;
        }
        else {
            // Buffer full so overwrite oldest
            front = (front + 1) % size;
        }
    }

    // Displaying buffer contents
    public void displayBuffer() {
        System.out.print("Buffer: [ ");
        for (int i = 0; i < cnt; i++) {
            System.out.print(buffer[(front + i) % size] + " ");
        }
        System.out.println("]");
    }

    //main method
    public static void main(String[] args) {

        CircularBuffer cb = new CircularBuffer(3);
        //adding values into circular buffer
        cb.insert(1);
        cb.insert(2);
        cb.insert(3);
        cb.displayBuffer();

        cb.insert(4);
        cb.displayBuffer();
    }
}
