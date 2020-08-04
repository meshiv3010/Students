package com.hit.algorithem;

public interface IAlgoCashe<K,V> {
	V  getElemment(K key);
	V putElement(K key,V value);
	void removeElement(K key);
	

}
