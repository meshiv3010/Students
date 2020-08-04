package com.hit.algorithem;

import java.util.HashMap;
import java.util.LinkedList;

public class LRUAlgoCashe <K,V> extends AbstractAlgoCashe<K,V>{
	protected int capacity;
	protected LinkedList<K> usageOrder;
	protected HashMap <K,V> cashe;
	
	public LRUAlgoCashe(int capacity) {
		super(compacity);
		this.capacity=capacity;
		LinkedList<K> usageOrder=new LinkedList<K>();
		HashMap <K,V> cashe =new HashMap <K,V>();
	}
	
	@Override
	public V getElemment (K key) {
		V value=
				this.cashe.get(key);
		return this.putElement(key, value);
	}
	
	@Override
	public V putElement(K key,V value) {
		if(this.cashe.containsKey(key)) {
			this.removeElement(key);			
		}
		else if(this.cashe.size()==this.capacity) {
			this.cashe.remove(key);
			this.usageOrder.removeFirst();
		}
		this.usageOrder.add(key);
		this.cashe.put(key, value);
		return this.cashe.get(key);
	}
	
	
	public void removeElement(K key) {
		this.cashe.remove(key);
		this.usageOrder.remove(key);
	}

}
