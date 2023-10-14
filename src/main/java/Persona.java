public class Persona {

	private String Name;
	public Persona(){
		this.Name="federico, el rico";
	}
	public void viajarEnMoto(motocicleta moto) {
		System.out.println("Hola"+this.Name+"! el tiempo de viaje aproxiamado para llegar al Mall portal Temuco es de: "+moto.getDuracionviaje());
	}



	public void viajarEnAuto(automovil auto) {
		System.out.println("Hola"+this.Name+"! el tiempo de viaje aproxiamado para llegar al Mall portal Temuco es de: "+auto.getDuracionviaje());
	}


	public void viajarEnBicicleta(bicicleta bici) {
		System.out.println("Hola"+this.Name+"! el tiempo de viaje aproxiamado para llegar al Mall portal Temuco es de: "+bici.getDuracionviaje());
	}

}