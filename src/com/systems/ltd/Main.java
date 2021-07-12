package com.systems.ltd;

public class Main {

	static void bubbleSort(int[] arr) {  
        int n = arr.length;  
        int temp = 0;  
        for(int i=0; i < n; i++){  
        	for(int j=1; j < (n-i); j++){  
        		if(arr[j-1] > arr[j]){  
                     temp = arr[j-1];  
                     arr[j-1] = arr[j];  
                     arr[j] = temp;  
                }  
                      
            }  
        }  
  
    }  
	
	public static void main(String[] args) {
		
		Array array=new Array(3);
		array.print();
		array.insert(5);
		array.insert(2);
		array.insert(7);
		array.insert(12);
		array.insert(6);
		array.removeAt(4);
		array.print();
		System.out.println("index is: "+array.indexOf(2));
		
		int arr[] ={3,60,35,2,45,320,5};  
		
		System.out.println("\nArray Before Bubble Sort");  
        for(int i=0; i < arr.length; i++){  
                System.out.print(arr[i] + " ");  
        }  
        System.out.println();  
          
        bubbleSort(arr);//sorting array elements using bubble sort  
         
        System.out.println("Array After Bubble Sort");  
        for(int i=0; i < arr.length; i++){  
                System.out.print(arr[i] + " ");  
        }  
		
		
		
		
		

	}

}
