public class Almacen {
    private producto [][] matriz;

    public Almacen(producto[][] matriz) {
        this.matriz = matriz;
    }

  public String buscarproducto(String nombrebuscado){
        for(int i=0; i<matriz.length;i++){
            for(int j = 0; j < matriz [i].length;j++){
                if (matriz[i][j].getNombre().equalsIgnoreCase(nombrebuscado)) {
                   return "Producto encontrado en posición: (" + i + ", " + j + ")";
                }
    }
    }
    return "Producto no encontrado";
    }
} 
