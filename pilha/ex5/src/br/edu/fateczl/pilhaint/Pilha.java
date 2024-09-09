package br.edu.fateczl.pilhaint;

public class Pilha
{
	No topo;
	
	public Pilha() 
	{
		
		topo=null;
	}
	
	public boolean isEmpty() 
	{
		
		if(topo==null)
		{
			return true;
		}
		return false;
		
	}
	 
	public void push(int valor) 
	{
		
		No elemento=new No();
		elemento.dado = valor;
		elemento.proximo=topo;
		topo=elemento;
			
	}
	
	public int pop() throws Exception
	{
		if(isEmpty())
		{
			throw new Exception("Pilha Vazia");
		}
		
		int valor = topo.dado;
		topo=topo.proximo;
		
		return valor;
		
	}
	
	public int top() throws Exception
	{
		if(isEmpty())
		{
			throw new Exception("Pilha Vazia");
		}
		int valor = topo.dado;
		return valor;
						
	}
	
		public int size() 
		{
			int cont=0;
			if(!isEmpty()) 
			{
				No auxiliar = topo;
				cont=1;
				while(auxiliar.proximo != null) 
				{
					cont++; 
					auxiliar=auxiliar.proximo;
				}
			}
			return cont ;
		}
		
		public int max() 
		{
		
			int max = 0;
			
			if(!isEmpty()) 
			{
				No auxiliar = topo;
				
				while(auxiliar.proximo != null) 
				{
					if (auxiliar.dado > max)
					{
						max = auxiliar.dado;
					}
					auxiliar=auxiliar.proximo;
				}
			}
			return max;
		}
		
}
