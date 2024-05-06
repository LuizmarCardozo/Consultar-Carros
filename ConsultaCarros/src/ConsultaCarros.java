import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultaCarros {

	public static void main(String[] args) {
		//Lista de fichas tecnicas veiculos
		List<FichaTecnica> fichasTecnicas = new ArrayList<>();
        fichasTecnicas.add(new FichaTecnica("Toyota", "Corolla", "2.0L", 150, "Dianteira"));
        fichasTecnicas.add(new FichaTecnica("Honda", "Civic", "1.5L", 170, "Dianteira"));
        fichasTecnicas.add(new FichaTecnica("Chevrolet", "Onix", "1.0L", 80, "Dianteira"));
        fichasTecnicas.add(new FichaTecnica("Volkswagen", "Golf", "2.0L", 200, "Integral"));
        fichasTecnicas.add(new FichaTecnica("Ford", "Mustang", "5.0L", 450, "Traseira"));
        fichasTecnicas.add(new FichaTecnica("Nissan", "350z", "3.5L", 312, "Traseira"));
        fichasTecnicas.add(new FichaTecnica("Chevrolet", "Chevette DL", "1.6L", 73, "Traseira"));

        //solicitar Marca e modelo
        Scanner scanner = new Scanner(System.in);
        System.out.println("Consulta de Ficha Técnica de Veículos");
        System.out.print("Digite a marca do veículo: ");
        String marca = scanner.nextLine();
        System.out.print("Digite o modelo do veículo: ");
        String modelo = scanner.nextLine();
        System.out.println();
		
        //Buscar na lista
        boolean encontrou = false;
        for (FichaTecnica ficha : fichasTecnicas) {
            if (ficha.getMarca().equalsIgnoreCase(marca) && ficha.getModelo().equalsIgnoreCase(modelo)) {
                encontrou = true;
                System.out.println("Ficha Técnica encontrada:");
                ficha.display();
                break;
            }
        }

        if (!encontrou) {
            System.out.println("Ficha Técnica não encontrada para o veículo especificado.");
        }
    }

        
        

	}
