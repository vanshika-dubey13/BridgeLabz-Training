package com.dsa.linkedlist.circularlinkedlist.roundrobinscheduling;

class SchedulerOperations {
	
	//attributes
    private ProcessNode head = null;
    private int processCount = 0;

    // Adding process at end
    public void addProcess(int pId, int burstTime) {
        ProcessNode newNode = new ProcessNode(pId, burstTime);

        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            ProcessNode temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
        processCount++;
    }

    // Displaying processes
    public void display() {
        if (head == null) {
            System.out.println("No processes in queue");
            return;
        }

        ProcessNode temp = head;
        System.out.println("Processes:");
        do {
            System.out.println("PID: " + temp.pid +
                               " | Remaining Time: " + temp.remainingTime);
            temp = temp.next;
        } while (temp != head);
    }

    // Round Robin Scheduling Algorithm
    public void roundRobin(int timeQuantum) {
        if (head == null) {
            System.out.println("No processes to schedule");
            return;
        }

        int time = 0;
        int totalWaitingTime = 0;
        int totalTurnAroundTime = 0;
        int completed = 0;

        ProcessNode curr = head;
        ProcessNode prev = null;

        while (processCount > 0) {
            if (curr.remainingTime > 0) {
                int execTime = Math.min(timeQuantum, curr.remainingTime);
                curr.remainingTime -= execTime;
                time += execTime;

                if (curr.remainingTime == 0) {
                    completed++;
                    int turnaround = time;
                    int waiting = turnaround - curr.burstTime;

                    totalWaitingTime += waiting;
                    totalTurnAroundTime += turnaround;

                    System.out.println("Process " + curr.pid + " completed");

                    // Remove node
                    if (curr == head && curr.next == head) {
                        head = null;
                        processCount--;
                        break;
                    }

                    if (curr == head) {
                        ProcessNode temp = head;
                        while (temp.next != head) {
                            temp = temp.next;
                        }
                        head = curr.next;
                        temp.next = head;
                        curr = head;
                    } else {
                        prev.next = curr.next;
                        curr = curr.next;
                    }
                    processCount--;
                    continue;
                }
            }
            prev = curr;
            curr = curr.next;
        }

        System.out.println("\nAverage Waiting Time: " +
                (double) totalWaitingTime / completed);
        System.out.println("Average Turnaround Time: " +
                (double) totalTurnAroundTime / completed);
    }
}
