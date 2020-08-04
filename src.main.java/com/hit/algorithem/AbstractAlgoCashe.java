package com.hit.algorithem;

public abstract class AbstractAlgoCashe<K,V> extends java.lang.Object
implements IAlgoCashe<K,V> 
{
	private int _capacity;
	public AbstractAlgoCashe(int capacity) 
	{
		this.set_capacity(capacity);
	}
	public int get_capacity() {
		return _capacity;
	}
	public void set_capacity(int _capacity) {
		this._capacity = _capacity;
	}
}
