public class Persona {
    private String nombre;
    private String primerapellido;
    private String segundoapellido;
    private int edad = 21;
    Persona () {
        nombre = "Antonio";
    }
    Persona (String nombre, String primerapellido, int edad) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public String getPrimerapellido() {
        return primerapellido;
    }
    public String getSegundoapellido() {
        return segundoapellido;
    }
    public void setNombre (String nombre) {
        this.nombre = nombre;
    }
    public void setEdad (int edad) {
        this.edad = edad;
    }
    public void mayoredad () {
        if (edad < 18 ) {
            System.out.println("La persona es menor de edad");
        } else {
            System.out.println("La persona es mayor de edad ");
        }
    }
}