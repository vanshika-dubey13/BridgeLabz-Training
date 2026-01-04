package com.dsa.linkedlist.circularlinkedlist.roundrobinscheduling;

class ProcessNode {
	
	//attributes
    int pid;
    int burstTime;
    int remainingTime;
    ProcessNode next;

    //constructor
    ProcessNode(int pid, int burstTime) {
        this.pid = pid;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
        this.next = null;
    }
}
