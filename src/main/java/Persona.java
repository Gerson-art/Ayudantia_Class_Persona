public class Persona {

	private String Name;
	public Persona(String name ){
		this.Name=name;
	}
	public void viajarEnMoto(motocicleta moto) {
		System.out.println("Hola "+ this.Name+"! el tiempo de viaje aproximado para llegar a la Universidad de La Frontera en motocicleta es de: "+moto.getDuracionviaje()+" minutos");
	}



	public void viajarEnAuto(automovil auto) {
		System.out.println("Hola "+this.Name+"! el tiempo de viaje aproximado para llegar a la Universidad de La Frontera en automovil es de: "+auto.getDuracionviaje()+" minutos");
	}


	public void viajarEnBicicleta(bicicleta bici) {
		System.out.println("Hola "+this.Name+"! el tiempo de viaje aproximado para llegar al Universidad de La Frontera en bicicleta es de: "+bici.getDuracionviaje()+" minutos");
	}

}