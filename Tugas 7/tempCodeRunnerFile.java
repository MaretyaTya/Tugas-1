     for(int iOuter=1; iOuter<=n; iOuter++){
                for(a=1; a<=iOuter;a++){
                    System.out.print(" ");
                }
                for(b=n; b>=iOuter*2-1;b--){
                    System.out.print("*");
                }
                System.out.println();
            }