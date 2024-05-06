//Classe da Ficha Técnica dos veículos
public class FichaTecnica {
	
	private String marca;
    private String modelo;
    private String motor;
    private int cavalos;
    private String tracao;
//Construtores
    public FichaTecnica(String marca, String modelo, String motor, int cavalos, String tracao) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.cavalos = cavalos;
        this.tracao = tracao;
    }
    //Exibir Ficha de Veiculos
    public void display() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Motor: " + motor);
        System.out.println("Cavalos: " + cavalos);
        System.out.println("Tração: " + tracao);
        
    }
// Getter de modelo
	public String getModelo() {
		return modelo;
	}
// Getter de marcas
	public String getMarca() {

		return marca;
	}
    
    
}

