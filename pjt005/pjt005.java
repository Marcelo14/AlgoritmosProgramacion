class Main {

    public static void main(String[] args) {
        int m = 123456789;
        
        System.out.printf("%d \n\n", m);
        //System.out.println("");
        
        pImprimirNumero(m);
    }
    
    public static void pImprimirNumero (int iNum){
        int iRS;

        while (iNum>0){
            iRS = iNum % 10;
            iNum = iNum / 10;
            System.out.println(iRS);
        }
        
    }
    
}


