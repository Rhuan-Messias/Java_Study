package carrinhoDeCompras;

public class CarrinhoDeCompras 
{
	private String[] itens;
	private int[] quantidades;
	private double[] precos;
	private double total = 0d;
	private int contador = 0;
	
	//Constructor
	public CarrinhoDeCompras(int quantidadeItens)
	{
		this.itens = new String[quantidadeItens];
		this.quantidades = new int[quantidadeItens];
		this.precos = new double[quantidadeItens];
	}
	
	//Adicionar Itens
	public void adicionarItem(String item, int quantidade, double preco) 
	{
		
		if(contador < itens.length)
		{
			itens[contador] = item;
			quantidades[contador] = quantidade;
			precos[contador] = preco;
			
			total += preco*quantidade;
			
			contador++;
		}
		
	}
	
	//Remover Itens
	public void removerItem(String item) 
	{
		try 
		{
			for(int i = 0; i < this.contador ; i++) 
			{
				if(itens[i] == item) 
				{
					//Remover do valor total antes de remover o item
					
					total -= quantidades[i]*precos[i];
					
					//O espaço do item excluído recebe os valores do seguinte
					//O último item recebe tudo 0 no final
					for(int j = i; j < contador -1; j++ )
					{
						itens[j] = itens[j+1];
						quantidades[j] = quantidades[j+1];
						precos[j] = precos[j+1];	
					}
					
					itens[contador-1] = null;
					quantidades[contador - 1] = 0;
					precos[contador - 1] = 0d;
					
					contador--;
				}
			}
		}
		catch(Exception e) {
			System.out.println("\nItem não existe");
		}
	}
	
	//Retornar valor total
	public double calcularTotal() { return this.total; }
	
	//Exibir tudo (View)
	public void exibirResumo() 
	{
		for(int i=0; i < contador; i++)
		{
			System.out.println(
					" Item: "+ itens[i] + 
					" Quantidade: " + quantidades[i] +
					" Preço: " + precos[i] +
					" Valor Total: " + this.quantidades[i]*this.precos[i]);
		}
	}
	
	
}
