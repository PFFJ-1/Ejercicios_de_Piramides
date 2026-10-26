public class E6_Piramide {
    void main(){
        IO.println("Escribe un número entero:");
        int x = Integer.parseInt(IO.readln());
        for(int i = 0; i<x;i++){
            for(int j=(-x+1); j<x; j++){
                if((-i<=j)&&(i>=j)){
                    IO.print("*");
                }else{
                    IO.print(" ");
                }
            }
            IO.println("");
        }
    }
}
