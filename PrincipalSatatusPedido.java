package Enum;

public class PrincipalSatatusPedido {

	public static void main(String[] args) {
		SattusPedido pedido = SattusPedido.Em_Andamento;
		SattusPedido pedido2 = SattusPedido.Aberto;
		SattusPedido pedido3 = SattusPedido.Cancelado;
		SattusPedido pedido4 = SattusPedido.Entregue;
		
		System.out.println(pedido);//EM ANDAMENTO
		System.out.println(pedido2);//ABERTO
		System.out.println(pedido3);//CANCELADO
		System.out.println(pedido4);//ENTREGUE
	}

}
