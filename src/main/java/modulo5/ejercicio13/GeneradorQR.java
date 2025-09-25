package modulo5.ejercicio13;

public class GeneradorQR {
    public void generar(String valor, Usuario usuario){
        CodigoQR codigoQR = new CodigoQR(valor);

        codigoQR.setUsuario(usuario);

        System.out.println("Se generó el siguiente codigo del QR: " + codigoQR);
    }
}
