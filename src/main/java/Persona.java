public class Persona {

	private String Name;
	public Persona(String name ){
		this.Name=name;
	}
	public void viajarEnMoto(motocicleta moto, String destino) {
		System.out.println("Hola "+ this.Name+"! el tiempo de viaje aproximado para llegar a "+destino+" en motocicleta es de: "+moto.getDuracionviaje()+" minutos");
	}



	public void viajarEnAuto(automovil auto,String destino) {
		System.out.println("Hola "+ this.Name+"! el tiempo de viaje aproximado para llegar a "+destino+" en motocicleta es de: "+auto.getDuracionviaje()+" minutos");
	}


	public void viajarEnBicicleta(bicicleta bici,String destino) {
		System.out.println("Hola "+ this.Name+"! el tiempo de viaje aproximado para llegar a "+destino+" en motocicleta es de: "+bici.getDuracionviaje()+" minutos");

	}

}