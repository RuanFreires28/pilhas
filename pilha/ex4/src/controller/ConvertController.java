package controller;

public class ConvertController 
{

	public ConvertController()
	{
		super();
	}
	
	
	public String DectoBin(int dec) 
	{
			
		br.edu.fateczl.pilhaint.Pilha pint = new br.edu.fateczl.pilhaint.Pilha();
		br.edu.fateczl.pilhastr.Pilha pstr = new br.edu.fateczl.pilhastr.Pilha();
		
		pint.push(dec);
		
		try 
		{
			while (pint.top() != 0)
			{
				pstr.push(Integer.toString(dec%2));
				dec = dec / 2;
				pint.push(dec);
			}
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		String bin = "";
		
		while (!pstr.isEmpty())
		{
			try 
			{
				bin = bin + pstr.pop();
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		
		return bin;
	}
}
