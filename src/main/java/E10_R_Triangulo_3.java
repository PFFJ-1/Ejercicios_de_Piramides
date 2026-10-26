public class E10_R_Triangulo_3 {
    void main(){
        IO.println("Escribe un número entero:");
        int x = Integer.parseInt(IO.readln());
        filas(x);
    }
    void filas(int x){
        for(int i = 0;i<x;i++){
            columnas(i, x);
            IO.println("");
        }
    }
    void columnas(int i, int x){
        for (int j = x-1;j>=0;j--) {
            if (j <= i) {
                IO.print("*");
            } else {
                IO.print(" ");
            }
        }
    }
}
