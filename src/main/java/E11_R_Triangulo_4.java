public class E11_R_Triangulo_4 {
    void main(){
        IO.println("Escribe un número entero:");
        int x = Integer.parseInt(IO.readln());
        filas(x);
    }
    void filas(int x){
        for(int i = 0;i<x;i++){
            columnas(i,x);
            IO.println("");
        }
    }
    void columnas(int i,int x){
        for (int j = 0;j<x;j++) {
            if (j >= i) {
                IO.print("*");
            } else {
                IO.print(" ");
            }
        }
    }
}
