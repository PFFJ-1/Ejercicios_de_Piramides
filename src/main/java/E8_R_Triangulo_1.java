public class E8_R_Triangulo_1 {
    void main(){
        IO.println("Escribe un número entero:");
        int x = Integer.parseInt(IO.readln());
        filas(x);
    }
    void filas(int x){
        for(int i = 0;x>i;i++) {
            columnas(i);
            IO.println();
        }
    }

    void columnas(int i){
            for (int j = 0;i>=j;j++) {
                IO.print("*");
            }
    }
}
