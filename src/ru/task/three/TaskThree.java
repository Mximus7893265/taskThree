package ru.task.three;


public class TaskThree {
        
    public int findMinElementSecDiag(int[][] a) throws Exception{
    	if(a.length<2)
    		throw new Exception("array size must be greater than 1");
    	for(int i=0; i<a.length; i++) {
    		if(a.length!=a[i].length)
    			throw new Exception("array size must be greater than NxN");
    	}
    	int min=a[0][a.length-1];
    		for(int i=1; i<a.length; i++){
                if(i!=a.length-1-i && min>a[i][a.length-1-i])
                    min=a[i][a.length-1-i];
            }
            return min;
    }
}
