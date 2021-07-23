package pe.edu.upeu.matrises;

public class TransformadasM {
    public void imprimirContenidoMatrizCadena(String[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if(matriz[i][j]!=null && !matriz[i][j].equals("")){
                    System.out.print(matriz[i][j]+"\t");
                }else{
                    System.out.print("\t");
                }                
            }
            System.out.println("");
        }        
    }     
    public String[][] transformada01(int dimen, int numInit) {
        String[][] matriz=new String[dimen][dimen];// i = Fila; j=Columna
        for (int i = 0; i <matriz.length; i++) {
            for(int j=0;j <=i;j++) {
                matriz[i][j]=""+numInit;
                numInit++;
            }
        }
        return matriz;
    }
    
    public String[][] transformada02(int dimen, int numInit) {
        String[][] matriz=new String[dimen][dimen];// i = Fila; j=Columna
        for (int i = 0; i <=matriz.length; i++) {
            for(int j=0;j <=(dimen-1)-i;j++) {
                matriz[i][j]=""+numInit;
                numInit++;
            }
        }
        return matriz;
    }
    public String[][] transformada03(int dimen, int numInit) {
        String[][] matriz=new String[dimen][dimen];// i = Fila; j=Columna
        for (int i = 0; i <=matriz.length; i++) {
            for(int j=0;j <=(dimen-1)-i;j++) {
                matriz[i][(dimen-1)-j]=""+numInit;
                numInit++;
            }
        }
        return matriz;
    }
    public String[][] transformada04(int dimen, int numInit) {
        String[][] matriz=new String[dimen][dimen];// i = Fila; j=Columna
        for (int j = 0; j <=matriz.length; j++) {
            for(int i=0;i <=(dimen-1)-j;i++) {
                matriz[i][j]=""+numInit;
                numInit++;
            }
        }
        return matriz;
    }
    public String[][] transformada05(int dimen, int numInit) {
        String[][] matriz=new String[dimen][dimen];// i = Fila; j=Columna
        for (int j = 0; j < matriz[0].length; j++) {
            if (j%2==0) {
                for (int i = 0; i < matriz.length; i++) {
                    matriz[(dimen-1)-i][j]=""+numInit;
                    numInit++;
                }
            } else {
                for (int i = matriz.length-1; i >=0 ; i--) {
                    matriz[(dimen-1)-i][j]=""+numInit;
                numInit++;
                }                
            } 
        }
        return matriz; 
    }
    public String[][]transformada06(int dimen, int numInit) {
        String[][] matriz=new String[dimen][dimen];// i = Fila; j=Columna
        for (int i = 0; i < matriz[0].length; i++) {
            if (i%2==0) {
                for (int j = 0; j < matriz.length; j++) {
                    matriz[(dimen-1)-i][j]=""+numInit;
                    numInit++;
                }
            } else {
                for (int j = matriz.length-1; j >=0 ; j--) {
                    matriz[(dimen-1)-i][j]=""+numInit;
                numInit++;
                }                
            } 
        }
        return matriz;  
    }
    public String[][] transformada07(int dimen, int numInit) {
        String[][] matriz=new String[dimen][dimen];// i = Fila; j=Columna
        for (int j = 0; j < matriz[0].length; j++) {
            if (j%2==0) {
                for (int i = 0; i < matriz.length; i++) {
                    matriz[(dimen-1)-i][(dimen-1)-j]=""+numInit;
                    numInit++;
                }
            } else {
                for (int i = matriz.length-1; i >=0 ; i--) {
                    matriz[(dimen-1)-i][(dimen-1)-j]=""+numInit;
                numInit++;
                }                
            } 
        }
        return matriz;   
    }
    public String[][] transformada08(int dimen, int numInit) {
        String[][] matriz=new String[dimen][dimen];// i = Fila; j=Columna
        for (int i = 0; i < matriz[0].length; i++) {
            if (i%2==0) {
                for (int j = 0; j < matriz.length; j++) {
                    matriz[i][j]=""+numInit;
                    numInit++;
                }
            } else {
                for (int j = matriz.length-1; j >=0 ; j--) {
                    matriz[i][j]=""+numInit;
                numInit++;
                }                
            } 
        }
        return matriz;    
    }
    
    
    
    public String[][]transformada09(int dimen, int numInit) {
        String[][] matriz=new String[dimen][dimen];// i = Fila; j=Columna
        for (int i = 0; i < matriz[0].length; i++) {
            if (i%2==0) {
                for (int j = 0; j < matriz.length; j++) {
                    matriz[(dimen-1)-i][(dimen-1)-j]=""+numInit;
                    numInit++;
                }
            } else {
                for (int j = matriz.length-1; j >=0; j--) {
                    matriz[(dimen-1)-i][(dimen-1)-j]=""+numInit;
                numInit++;
                }                
            } 
        }
        return matriz;  
    }
    public String[][] transformada10(int dimen, int numInit) { 
        String[][] matriz=new String[dimen+1][dimen+1]; // i = Fila; j=Columna (int n, int x) {i
            for (int i = 1; i <= dimen / 2; i++) {
                for (int j = i; j <= dimen - i; j++) {
                   matriz[i][j] = ""+numInit;
                   numInit++;
                }
                for (int j = i; j <= dimen - i; j++) {
                   matriz[j][dimen - i + 1] = ""+numInit;
                   numInit++;
                }
                for (int j = dimen - i + 1; j >= i + 1; j--) {
                   matriz[dimen - i + 1][j] =""+ numInit;
                   numInit++;
                }
                for (int j = dimen - i + 1; j >= i + 1; j--) {
                   matriz[j][i] = ""+numInit;
                   numInit++;
                }
            }
             if (dimen % 2 == 1) {
                matriz[dimen / 2 + 1][dimen / 2 + 1] =""+ numInit;
            }
            return matriz;
            
    }
   
    
    public static void main(String[] args) {   
        TransformadasM tm=new TransformadasM();   
        System.out.println("_____EJERCICIO 01________6 MATRIZ DE LA FORMA	");
        tm.imprimirContenidoMatrizCadena(tm.transformada01(5, 0));
        System.out.println("");
        System.out.println("_____EJERCICIO 02______________7 MATRIZ DE LA FORMA	");
        System.out.println("");
        tm.imprimirContenidoMatrizCadena(tm.transformada02(5, 0));
        System.out.println("");
        System.out.println("");
        System.out.println("_____EJERCICIO 03_________11 MATRIZ DE LA FORMA	");
        System.out.println("");
        tm.imprimirContenidoMatrizCadena(tm.transformada03(5, 0));
        System.out.println("");
        System.out.println("");
        System.out.println("_____EJERCICIO 04___________13 MATRIZ DE LA FORMA	");
        System.out.println("");
        tm.imprimirContenidoMatrizCadena(tm.transformada04(5, 0));
        System.out.println("");
        System.out.println("");
        System.out.println("_____EJERCICIO 05___________22 MATRIZ DE LA FORMA	");
        System.out.println("");
        tm.imprimirContenidoMatrizCadena(tm.transformada05(5, 0));
        System.out.println("");
        System.out.println("_____EJERCICIO 06___________24 MATRIZ DE LA FORMA	");
        System.out.println("");
        tm.imprimirContenidoMatrizCadena(tm.transformada06(5, 0));
        System.out.println("");
        System.out.println("_____EJERCICIO 07_________25 MATRIZ DE LA FORMA	");
        System.out.println("");
        tm.imprimirContenidoMatrizCadena(tm.transformada07(5, 0));
        System.out.println("");
        System.out.println("_____EJERCICIO 08_________27 MATRIZ DE LA FORMA	");
        System.out.println("");
        tm.imprimirContenidoMatrizCadena(tm.transformada08(5, 0));
        System.out.println("");
        System.out.println("_____EJERCICIO 09__________28 MATRIZ DE LA FORMA	");
        System.out.println("");
        tm.imprimirContenidoMatrizCadena(tm.transformada09(5, 0));
        System.out.println("");
        System.out.println("_____EJERCICIO 10____________29 MATRIZ DE LA FORMA	");
        tm.imprimirContenidoMatrizCadena(tm.transformada10(5, 0));
        System.out.println("");
        
        
    }    

}
