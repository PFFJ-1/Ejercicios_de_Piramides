public class E7_R_Cuadrado {
    void filas(int x){
        for(int i = 0;x>i;i++){
            columnas(x);
            IO.println();
        }
    }
    void columnas(int x){
        for (int j = 0;j<x;j++) {
            IO.print("*");
        }
    }
    void main(){
        IO.println("Escribe un número entero:");
        int x = Integer.parseInt(IO.readln());
        filas (x);
    }
}