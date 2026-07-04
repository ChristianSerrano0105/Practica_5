public class App {

	//Creando una composicion
	private ArrayList<String> listaArray;

	//Constructor, inicializando el objeto ListaArray al crear la App
	public App(){
		this.listaArray = new ArrayList<>();
	}

	public void ejecutarPruebas(){
	System.out.println("=====Pruebas paso a paso=====\n");
	}

	System.out.println("--- Creando la lista (desde el constructor) ---");
	System.out.println("La lista esta vacia? " + this.listaArray.esVacia());
	imprimirLista();

	System.out.println("\n ---listaArray.agregarInicio(\Universidad\) ---");
	this.listaArray.agregarInicio("Universidad");
	imprimirLista();

	System.out.println("\n ---listaArray.agregarFinal(\Trabajador\) ---");
	this.listaArray.agregarFinal("Trabajador");
	imprimirLista;

	System.out.println("\n ---listaArray.agregarElemento(\Estudiante\) ---");
	this.listaArray.agregarElemento("Estudiante");
	imprimirLista();

	private void imprimirLista(){
	System.out.print("Estado de la lista: [ ");
		for (int i = 0; i < this.listaArray.numElementos(); i++){
		System.out.print(this.listaArray.consultar(i));
			if (i < this.listaArray.numElementos() - 1){
				System.out.print(" | ");
			}
		}
		System.out.println(" ]");
	}

	public static void main(String[] args) throws Exception {
	//En lugar de instanciar el ArrayList, se instancia la App completa, esto para no perder la composicion
	App miAplicacion = new App();
	miAplicacion.ejecutarPruebas();
    }
}
