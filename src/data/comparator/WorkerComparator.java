package data.comparator;


import data.Worker;

import java.util.Comparator;

public class WorkerComparator implements Comparator<Worker> {
    @Override
    public int compare(Worker h1, Worker h2){
        return h1.getName().compareTo(h2.getName());
    }
}