public class Viatura {
    private String tipo_viatura;
    private int num_rodas;
    private int vel_max;
    private String matricula;
    
    // Construtores
    public Viatura() {
    }
    public Viatura(String tipo_viatura, int num_rodas, int vel_max, String matricula) {
        this.tipo_viatura = tipo_viatura;
        this.num_rodas = num_rodas;
        this.vel_max = vel_max;
        this.matricula = matricula;
    }

    // Getters & Setters
    public String getTipo_viatura() {
        return tipo_viatura;
    }
    public void setTipo_viatura(String tipo_viatura) {
        this.tipo_viatura = tipo_viatura;
    }
    public int getNum_rodas() {
        return num_rodas;
    }
    public void setNum_rodas(int num_rodas) {
        this.num_rodas = num_rodas;
    }
    public int getVel_max() {
        return vel_max;
    }
    public void setVel_max(int vel_max) {
        this.vel_max = vel_max;
    }

    // Mostrar Info
    public void mostrarInfo() {
        System.out.println("Vou mostrar a informação do carro =");
        System.out.println("Tipo da viatura: " + this.tipo_viatura);
        System.out.println("Numero de rodas: " + this.num_rodas);
        System.out.println("Velocidade Maxima: " + this.vel_max);
        System.out.println("Matricula: " + this.matricula);
    }
    
}
