package com.hit.algorithm;


import org.junit.jupiter.api.Test;

import com.hit.algorithem.LRUAlgoCashe;

public class IAlgoCacheTest extends java.lang.Object
{
	public IAlgoCacheTest() {};
	
    @Test
	public void LRUTest() 
	{
		int[] Array = {2,3,4,2,1,3,7,5,4,3};
		LRUAlgoCashe<Integer, String> LRUTest = new LRUAlgoCashe<>(3);
		System.out.println("LRU Test Here:");
		for (int i=0; i< Array.length;i++ )
		{
			LRUTest.putElement( Array[i], Integer.toString(Array[i]+1) );
			LRUTest.printHashMap();
		}
		System.out.println("\n");	
	}
}
