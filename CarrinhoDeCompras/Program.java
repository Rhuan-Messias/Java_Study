import carrinhoDeCompras.CarrinhoDeCompras;

public class Program 
{
	public static void main(String[] args) 
	{
		System.out.println("\n**********CARRINHO DE COMPRAS**********\n");
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras(3);
		
		carrinho.adicionarItem("Iphone PRO", 1, 4499.99d);
		carrinho.adicionarItem("Short Jeans", 5, 100d);
		carrinho.adicionarItem("Smart Watch 2.0", 4, 250);
		
		carrinho.exibirResumo();
		
		System.out.println("\n Valor Total: " + carrinho.calcularTotal());
		
		System.out.println("\n==============================\n");
		
		carrinho.removerItem("Short Jeans");
		carrinho.exibirResumo();
		System.out.println("\n Valor Total: " + carrinho.calcularTotal());
		
		
	}

}
