public class App {
    public static void main(String[] args) throws Exception {
        Viatura carro = new Viatura();
        carro.setNum_rodas(4);
        carro.setTipo_viatura("Carro Desportivo");
        carro.setVel_max(120);

        carro.mostrarInfo();
    }
}
