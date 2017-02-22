package mafia;

import java.util.Stack;

public class CardPool<E> {
	
	Stack<E> pool=new Stack<E>();
	
	public void addCard(E ele){
		pool.add(ele);
	}
	
	public void addCard(E ele,int count){
		for(int i=0;i<count;i++){
			pool.add(ele);
		}
	}
	
	public int count(){
		return pool.size();
	}
	
	public E getCard(int index){
		return pool.get(index);	
	}
	
	public void delCard(int index){
		pool.remove(index);
	}
	
	public String output(){
		String s="";
		for(int i=0;i<pool.size();i++){
			s+=pool.get(i)+" ";
		}
		return s;
	}

}
