package com.hit.algorithm;

public interface IAlgoCashe<K,V> {
	V  getElemment(K key);
	V putElement(K key,V value);
	void removeElement(K key);
	

}
